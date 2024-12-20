import { FaUser, FaLock } from "react-icons/fa";
import { Link, useNavigate } from "react-router-dom";
import { useState } from "react";
import axios from 'axios';


import "./Login.css";

const Login = () => {

    const [nome, setNome] = useState("");
    const [senha, setSenha] = useState("");
    // const navigate = useNavigate();

    const i = axios.create({baseURL: 'http://localhost:8080'})

    const enviarFormulario = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault(); //Evita o envio do formulário e recarregamento da página
        console.log("envio");
        if (nome && senha) {
            i.post("/user", {nome, senha}).then(() => {
                console.log('Axiosin')
            })
        } else {
          alert("Por favor, preencha todos os campos!");
        }
    
    }

  return (
    <div className='container'>
      <form onSubmit={enviarFormulario}>
        <h1>Entrar</h1>
        <div className = "input-campo">
            <input type="email" placeholder='E-mail' 
            onChange={(e) => setNome(e.target.value)} 
            />
            
            <FaUser className="icon"/>
        </div>
        <div className = "input-campo">
            <input type="password" placeholder='Senha' 
            onChange={(e) => setSenha(e.target.value)} 
            />
            <FaLock className="icon"/>
        </div>
        <div className = "input-campo">
            <button>Entrar</button>
        </div>
        <div className="cria-conta">
            <p>Não tem uma conta? <Link to = {"/registro"}>Registra</Link></p>
        </div>
      </form>
    </div>
  )
}

export default Login