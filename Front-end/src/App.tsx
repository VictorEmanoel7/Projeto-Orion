import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import './tl.css';
import Login from './Componentes/Login/Login';
import Registro from './Componentes/Register/Register';
import Inicial from './Componentes/Tela-inicial/TelaInicial';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/inicial" element={
            <div className="tl">
            <Inicial />
          </div>
          } />
          
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
