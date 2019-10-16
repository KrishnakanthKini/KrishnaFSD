package comm.example.model.bank;



import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "bank_type")
@DiscriminatorValue("Bank")
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String branch;
	private String ifsc;
	private float balance;
	

	public Bank() {
	}

	public Bank(String name, String branch,String ifsc,float balance) {
		this.name = name;
		this.branch = branch;
		this.ifsc = ifsc;
		this.balance=balance;
		
	}
}