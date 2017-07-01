package co.edu.usbcali.demo.logica;

import java.util.List;

import co.edu.usbcali.demo.modelo.Usuarios;

public interface IUsuariosLogica {
	
	public void crear(Usuarios entity)throws Exception;
	public void modificar(Usuarios entity)throws Exception;
	public void borrar(Usuarios entity)throws Exception;
	public Usuarios consultarPorId(long usuId)throws Exception;
	public List<Usuarios> consultar();

}
