package daoc.soapjaxws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface I_EmpleadoService {
	@WebMethod
	public Empleado getEmpleado(int id);
	@WebMethod
	public List<Empleado> getAllEmpleados();	
	@WebMethod
	public void createEmpleado(String nombre, String cargo);
}
