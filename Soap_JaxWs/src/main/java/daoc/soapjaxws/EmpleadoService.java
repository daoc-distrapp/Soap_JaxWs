package daoc.soapjaxws;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@WebService(endpointInterface = "daoc.soapjaxws.I_EmpleadoService")
public class EmpleadoService implements I_EmpleadoService {

	@Autowired
	public EmpleadoRepository repository;	
	
	@Override
	public Empleado getEmpleado(int id) {
		Optional<Empleado> opt = repository.findById(id);
		return opt.orElse(null);
	}
	@Override
	public List<Empleado> getAllEmpleados() {
	    List<Empleado> result = new ArrayList<>();
	    repository.findAll().forEach(result::add);
		return result;
	}
	@Override
	public void createEmpleado(String nombre, String cargo) {
		System.out.println(String.format("Empleado [nombre: %s, cargo: %s]", nombre, cargo));
		repository.save(new Empleado(nombre, cargo));
	}

}
