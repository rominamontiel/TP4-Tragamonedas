package ar.edu.unlam.basica2;

public class Tragamonedas {
	
	Tambor tambor1;
	Tambor tambor2;
	Tambor tambor3;
			
	
	public Tragamonedas(){
		
		FixNumberGenerator inicial = new FixNumberGenerator(1);
		
		tambor1.getPosicion();
		tambor2.getPosicion();
		tambor3.getPosicion();
			
				
	}
	
	public void activar(){
		
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
				
	}
	
	
	public Boolean entregarPremio() {
		
		if(tambor1.getPosicion()==tambor2.getPosicion() && tambor2.getPosicion()==tambor3.getPosicion())
			return true;
		else
			return false;
		
	
	}
}