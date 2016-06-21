package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	/*@Test
	public void PrimerTest_VerificacionPERSONAL() {
				
		RandomNumberGenerator tambor = new RandomNumberGenerator();
		int t1 = tambor.generate(); 
		int t2 = tambor.generate();
		int t3 = tambor.generate(); 
		
		System.out.printf("\n \n Generador de 3 posiciones:\n \n       %d | %d | %d ",t1,t2,t3);
		
		if(t1==t2 && t2==t3)
			{System.out.printf(" \n   $$$$ PREMIO $$$$");}
		else
			{System.out.printf(" \n Sigue participando! :) \n ---------------------------------------- ");}
		
		
	}*/

	
	@Test
	public void TestearValorInicial(){
		
		Tragamonedas tragamoneda = new Tragamonedas();
		
		Integer esperado = 1;
		
		Integer t1 = tragamoneda.tambor1.getPosicion();
		Integer t2 = tragamoneda.tambor2.getPosicion();
		Integer t3 = tragamoneda.tambor3.getPosicion();

		assertEquals(esperado,t1);
		assertEquals(esperado,t2);
		assertEquals(esperado,t3);
		
		
	}
	
	
	@Test
	public void TestJugarAlTragamonedas(){
		
		Tragamonedas tragamoneda = new Tragamonedas();
		
		tragamoneda.activar();
		
		if(tragamoneda.entregarPremio()==true)
			System.out.printf("\n %d | %d | %d \n $$$$ GANASTE!! $$$$$ \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		else
			System.out.printf("\n %d | %d | %d  PERDISTE! :( Sigue participando!! \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		
		
	}
	
	
}
