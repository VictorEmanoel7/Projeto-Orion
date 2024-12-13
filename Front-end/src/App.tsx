import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Login from './Componentes/Login/Login';
import Registro from './Componentes/Register/Register';
import Inicial from './Componentes/Tela-inicial/TelaInicial';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        {/* Rota Inicial, fora da div */}
        <Route path="/inicial" element={<Inicial />} />

        {/* Outras rotas dentro da div */}
        <Route 
          path="/" 
          element={
            <div className="app">
              <Login />
            </div>
          } 
        />
        <Route 
          path="/registro" 
          element={
            <div className="app">
              <Registro />
            </div>
          } 
        />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
