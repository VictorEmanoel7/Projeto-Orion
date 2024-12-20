import { Link } from "react-router-dom";
import "./TelaInicial.css";
const TelaInicial = () => {
  return (
    <div className="container">
      <div className="titulo">
        <h1>Bem-vindo</h1>
      </div>
      
      <div 
      className="botao">
        <button>
          Criar Projeto
        </button>
      </div>

      <div className="botao">
        <button>
          Listar Projetos
        </button>
      </div>

      <div className="voltar-login">
          <p>
            Retorna a tela de login? <Link to="/">Faça login</Link>
          </p>
      </div>
    </div>
  );
};

export default TelaInicial;
