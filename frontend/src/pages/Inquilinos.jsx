import React from 'react'
import { useEffect, useState} from 'react';
import { getInquilinos } from '../services/InquilinosService';

export default function Inquilinos() {

  const [inquilinos, setInquilinos] = useState(null)

  // settear usuario con ordenes
  useEffect(() => {
    const fetchInquilinos = async () => {
      try {
        const inquilinos = await getInquilinos();
        setInquilinos(inquilinos);
        console.log(inquilinos)
      } catch (e) {
        setInquilinos(false)
        console.error("Error: ", e);
      }
    };
    fetchInquilinos();
  }, []);

  return (
      <div className="container mt-4">
        <h1 className="mb-4">Inquilinos</h1>
        {inquilinos === null && (
            <div className="text-center">
              <div className="spinner-border text-primary" role="status">
                <span className="visually-hidden">Cargando...</span>
              </div>
            </div>
        )}
        {inquilinos === false && (
            <div className="alert alert-danger text-center">
              Hubo un error al cargar los datos.
            </div>
        )}
        {inquilinos && (
            <div className="table-responsive">
              <table className="table table-striped table-bordered">
                <thead>
                <tr>
                  <th>#</th>
                  <th>Nombre</th>
                  <th>Apellido</th>
                  <th>Email</th>
                </tr>
                </thead>
                <tbody>
                {inquilinos.map((inquilino, index) => (
                    <tr key={inquilino.id}>
                      <td>{index + 1}</td>
                      <td>{inquilino.nombre}</td>
                      <td>{inquilino.apellido}</td>
                      <td>{inquilino.email}</td>
                    </tr>
                ))}
                </tbody>
              </table>
            </div>
        )}
      </div>
  );
  
}