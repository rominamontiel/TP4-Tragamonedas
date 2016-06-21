package ar.edu.unlam.basica2;

public class RandomNumberGenerator implements NumberGenerator {
	
	//private Integer number;
	
	@Override
	public Integer generate(){
								
		return (int)Math.floor(Math.random()*(1-10)+10);
						
	}
		
}
