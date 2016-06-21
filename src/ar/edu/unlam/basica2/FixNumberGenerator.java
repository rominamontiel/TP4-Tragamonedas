package ar.edu.unlam.basica2;

public class FixNumberGenerator implements NumberGenerator{
	
	private Integer numero;	
	
	public FixNumberGenerator(Integer number){
		
		this.numero=number;
		
		}
	
	
	@Override
	public Integer generate(){
		return numero;
	}
	
	

}
