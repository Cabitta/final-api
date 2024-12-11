import axios from "axios";

export const getInquilinos = async() => {
  try{
    const response = await axios.get("http://localhost:8080/inquilino")
    return response.data;
  } catch (e) {
    console.error("Error al obtener productos con ordenes", e)
  }
};