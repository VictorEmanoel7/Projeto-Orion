import React, { useState } from "react";
import { Link } from "react-router-dom";
import axios from 'axios';
import "./Register.css";

const Register: React.FC = () => {
  const [nome, setNome] = useState("");
  const [cpf, setCpf] = useState("");
  const [email, setEmail] = useState("");
  const [senha, setSenha] = useState("");

  const i = axios.create({ baseURL: 'http://localhost:8080' });

  const enviarFormulario = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault(); // Evita o envio do formulário e recarregamento da página
  };

  return (
    <div className="container">
      <h1>Criar Conta</h1>
      <form onSubmit={enviarFormulario}>
        <div className="input-campo">
          <input
            type="text"
            placeholder="Nome"
            value={nome}
            onChange={(e) => setNome(e.target.value)}
          />
        </div>
        <div className="input-campo">
          <input
            type="tel"
            placeholder="CPF"
            value={cpf}
            onChange={(e) => setCpf(e.target.value)}
          />
        </div>
        <div className="input-campo">
          <input
            type="email"
            placeholder="E-mail"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>
        <div className="input-campo">
          <input
            type="password"
            placeholder="Senha"
            value={senha}
            onChange={(e) => setSenha(e.target.value)}
          />
        </div>
        <div className="input-campo">
          <button>Criar</button>
        </div>
        <div className="voltar-login">
          <p>
            Já tem uma conta? <Link to="/">Faça login</Link>
          </p>
        </div>
      </form>
    </div>
  );
};

export default Register;
