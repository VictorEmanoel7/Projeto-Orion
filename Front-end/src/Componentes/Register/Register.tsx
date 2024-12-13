import React from "react";
import { Link } from "react-router-dom";
import "./Register.css";

const Register: React.FC = () => {
  return (
    <div className="container">
      <h1>Criar Conta</h1>
      <form>
        <div className="input-campo">
          <input type="text" placeholder="Nome" />
        </div>
        <div className="input-campo">
          <input type="tel" placeholder="CPF" />
        </div>
        <div className="input-campo">
          <input type="email" placeholder="E-mail" />
        </div>
        <div className="input-campo">
          <input type="password" placeholder="Senha" />
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
