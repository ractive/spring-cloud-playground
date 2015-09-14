package ch.local.api.customers;

import java.util.Arrays;
import java.util.List;

import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customers")
@ExposesResourceFor(Customer.class)
@Slf4j
public class CustomersController {
	
	@SuppressWarnings("serial")
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public class CustomerNotFoundException extends RuntimeException {
	}
	
	private final Customer customer1 = new Customer(1L, "foo");
	private final Customer customer2 = new Customer(2L, "bar");
	
	@RequestMapping
	public List<Customer> customers() {
		return Arrays.asList(customer1, customer2);
	}
	
	@RequestMapping("/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") Long customerID) {
		log.info("getCustomer {}", customerID);
		Customer customer = null;
		if (customerID == 1L) {
			customer = customer1;
		} else if (customerID == 2L) {
			customer = customer2;
		}
		
		if (customer == null) {
			throw new CustomerNotFoundException(); 
		}
		
		return customer;
	}
}

