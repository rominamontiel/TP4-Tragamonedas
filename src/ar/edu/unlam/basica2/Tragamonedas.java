package ar.edu.unlam.basica2;

public class Tragamonedas {
	
	public Tambor tambor1;
	public Tambor tambor2;
	public Tambor tambor3;
			
	
	public Tragamonedas(){
		
		FixNumberGenerator inicial = new FixNumberGenerator(1);
		
		tambor1 = new Tambor(inicial);
		tambor2 = new Tambor(inicial);
		tambor3 = new Tambor(inicial);
			
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