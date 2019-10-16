package comm.example.model.bank;



import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("bankcurrent")
public class bankcurrent extends Bank {
	
	private double base_amount;

	public bankcurrent() {
	}

	public bankcurrent(String name, String branch,String ifsc,float balance, double base_amount) {
		super(name, branch,ifsc,balance);
		
		this.base_amount=base_amount;
	}
}