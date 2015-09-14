package ch.local.zuul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.local.api.customers.Customer;

@RestController
public class TestController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/test")
	public Customer test() {
		return restTemplate.getForObject("/customers/1", Customer.class);
	}
}
