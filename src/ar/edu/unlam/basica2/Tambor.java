package ar.edu.unlam.basica2;

public class Tambor {
	
	private int posicion;
	
	public Tambor(NumberGenerator generator){  // CONSTRUCTOR 
		this.posicion=generator.generate();
	}
	
	public Integer getPosicion(){
		  return posicion;    
	}
	
	public void girar(){
		
		RandomNumberGenerator resultado = new RandomNumberGenerator();
		this.posicion=resultado.generate();
		
	}
	

}
