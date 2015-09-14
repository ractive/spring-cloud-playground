package ch.local.api.offers;

import org.springframework.hateoas.ResourceSupport;

import ch.local.api.customers.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offer extends ResourceSupport {
	private Long offerId;
	private Long priceInCents;
	private Customer customer;
}
