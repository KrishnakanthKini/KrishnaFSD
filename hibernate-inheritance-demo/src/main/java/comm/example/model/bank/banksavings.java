package comm.example.model.bank;




import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("banksavings")
public class banksavings extends Bank {
	
	private float interest;

	public banksavings() {
	}

	public banksavings(String name, String branch,String ifsc,float balance,float interest) {
		super(name, branch,ifsc,balance);
		this.interest =interest;
		
	}
}