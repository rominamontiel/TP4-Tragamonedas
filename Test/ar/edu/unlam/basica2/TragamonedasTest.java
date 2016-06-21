package ar.edu.unlam.basica2;

//import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void PrimerTest_VerificacionPERSONAL() {
				
		RandomNumberGenerator tambor = new RandomNumberGenerator();
		int t1 = tambor.generate(); 
		int t2 = tambor.generate();
		int t3 = tambor.generate(); 
		
		System.out.printf("Generador de 3 posiciones:\n \n       %d | %d | %d ",t1,t2,t3);
		
		if(t1==t2 && t2==t3)
			{System.out.printf(" \n   $$$$ PREMIO $$$$");}
		else
			{System.out.printf(" \n Sigue participando! :) ");}
		
		
	}

	
	
	
	
	
	
}
