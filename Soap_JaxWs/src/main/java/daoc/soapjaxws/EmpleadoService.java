package daoc.soapjaxws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService(serviceName = "EmpService",
			name = "Emp",
			portName = "EmpPort",
			targetNamespace = "http://soapjaxws.daoc/")
public class EmpleadoService {

	@Autowired
	public EmpleadoRepository repository;	
	
	public Empleado getEmpleado(int id) {
		Optional<Empleado> opt = repository.findById(id);
		return opt.orElse(null);
	}
	public List<Empleado> getAllEmpleados() {
	    List<Empleado> result = new ArrayList<>();
	    repository.findAll().forEach(result::add);
		return result;
	}
	public void createEmpleado(String nombre, String cargo) {
		System.out.println(String.format("Empleado [nombre: %s, cargo: %s]", nombre, cargo));
		repository.save(new Empleado(nombre, cargo));
	}

}
