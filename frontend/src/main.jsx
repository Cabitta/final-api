import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
//import './index.css'
import Home from './pages/Inquilinos.jsx'
import Inquilinos from './pages/Inquilinos.jsx'

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <Inquilinos />
  </StrictMode>,
)
