package hello.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.service.Service;
import hello.service.ServiceConfiguration;

@SpringBootApplication
@Import(ServiceConfiguration.class)
@RestController
public class DemoApplication
{

	private final Service service;

	@Autowired
	public DemoApplication (Service service)
	{
		this.service = service;
	}

	@GetMapping("/")
	public String home ()
	{
		String message = service.message();
		return message + " XXXX";
	}

	public static void main (String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}
    
    public void useDto (App1Dto dto) {
        // Change to App1
    }
}
