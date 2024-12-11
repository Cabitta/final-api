import React from 'react'
import { useEffect, useState} from 'react';
import { getInquilinos } from '../services/InquilinosService';

export default function Inquilinos() {

  const [inquilinos, setInquilinos] = useState(null)

  // settear usuario con ordenes
  useEffect(() => {
    const fetchInquilinos = async () => {
      try {
        const userWithOrders = await getInquilinos();
        setInquilinos(userWithOrders);
        console.log(userWithOrders)
      } catch (e) {
        setInquilinos(false)
        console.error("Error: ", e);
      }
    };
    fetchInquilinos();
  }, []);

  return (
    <div>Inquilinos</div>
  )
}
