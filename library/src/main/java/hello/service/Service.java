package hello.service;

import org.springframework.stereotype.Component;

@Component
public class Service
{

	private final String message;

	public Service (String message)
	{
		this.message = "YYYY" + message;
	}

	public String message ()
	{
        // Change to library 
		return this.message;
	}
}
