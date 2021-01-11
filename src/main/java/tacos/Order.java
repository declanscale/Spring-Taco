package tacos;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.CreditCardNumber;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Order {
	
	private Long id;
	private Date placedAt;
	
	@NotBlank(message="Name is required")
	private String name;
	
	@NotBlank(message="Street is required")
	private String street;
	
	@NotBlank(message="City is required")
	private String city;
	
	@NotBlank(message="state is required")
	private String state;
	
	@NotBlank(message="zip code is required")
	private String zip;
	
	@CreditCardNumber(message="not a valid credit card number")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",message="must be formatted MM/YY")
	private String ccExpiration;
	
	@Digits(integer=3,fraction=0,message="invalid CVV")
	private String ccCVV;

}
