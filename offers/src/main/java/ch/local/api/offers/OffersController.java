package ch.local.api.offers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import ch.local.api.customers.Customer;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/offers")
@ExposesResourceFor(Offer.class)
@Slf4j
public class OffersController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping
	public List<Offer> offers() {
		log.info("offers");
		Customer customer1 = restTemplate.getForObject("http://CUSTOMERS/customers/1", Customer.class);
		Customer customer2 = restTemplate.getForObject("http://CUSTOMERS/customers/2", Customer.class);

		Offer offer1 = new Offer(1L, 123L, customer1);
		Offer offer2 = new Offer(2L, 234L, customer2);

		return Arrays.asList(offer1, offer2);
	}
}
