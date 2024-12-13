import { Link } from "react-router-dom";
//teste
const TelaInicial = () => {
  return (
    <div
      style={{
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
        justifyContent: 'center',
        height: '100vh',
      }}
    >
      <h1>Tela Inicial</h1>
      <p>Já tem uma conta? <Link to="/">Faça login</Link></p>
    </div>
  );
};

export default TelaInicial;
