package comm.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class League {
	private String season;
	private int year;
	private String title;
	
	@Override
	public String toString() {
		return "League [season=" + season + ", year=" + year + ", title=" + title + "]";
	}
	
	

}
