package daoc.soapjaxws;

import javax.xml.ws.Endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapJaxWsApplication {
	
	final String URL = "http://localhost:8080/empleados";
	
	@Autowired
	EmpleadoService service;
	
	@Bean(destroyMethod = "stop")
	Endpoint getEndpoint() {
		return Endpoint.publish(URL, service);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SoapJaxWsApplication.class, args);
	}
	
}
