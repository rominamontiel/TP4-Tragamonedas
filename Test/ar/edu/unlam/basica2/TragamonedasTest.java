package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void TesteoQueSeGenereUnNumeroEntreUnoYDiez(){
		
		int esperado=1;
		int obtenido=1;
		
		RandomNumberGenerator objetoRNG = new RandomNumberGenerator();
		
		int numero=objetoRNG.generate();
		
		if(numero<1 || numero>10)
		{obtenido=-1;}
		
		assertEquals(esperado,obtenido);
				
	}	
	
		
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
	public void TesteoMetodoEntregarPremio1(){
		
		Tragamonedas objetoTM = new Tragamonedas();
		
		objetoTM.activar();
		
		assertFalse(objetoTM.entregarPremio());
			
		
	}			
		
		
	@Test
	public void TesteoMetodoEntregarPremioOPCION2(){
		
		Tragamonedas objetoTM = new Tragamonedas();
		
		objetoTM.activar();
		
		Integer t1 = objetoTM.tambor1.getPosicion();
		Integer t2 = objetoTM.tambor2.getPosicion();
		Integer t3 = objetoTM.tambor3.getPosicion();
		
		if(t1!=t2 && t1!=t3 && t2!=t3)
		{ 
			assertFalse(objetoTM.entregarPremio()); }
		
		else
		{
			assertTrue(objetoTM.entregarPremio());
		}
		
		
		
	}
	
	/*
	@Test
	public void TesteoQueLosTamboresTomenValoresCorrectos(){
		
		System.out.printf("\n \n--------- Funcionamiento normal de la máquina: ---------\n");
		
		Tragamonedas tragamoneda = new Tragamonedas();
		
				
		tragamoneda.activar();
		
		int esperado=1;
		int obtenido=1;
		
		if(>10 || tambor.girar()<1)
		{obtenido=-1;}
		
		assertEquals(esperado,obtenido);
		
		
		if(tragamoneda.entregarPremio()==true)
			System.out.printf("\n %d | %d | %d  $$$$ GANASTE!! $$$$ \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		else
			System.out.printf("\n %d | %d | %d - PERDISTE! :( Sigue participando!! \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		
		
	}
	
	
	
	@Test
	public void TestQueDanTodosIguales(){
		
		System.out.printf(" \n \n --------- Test en caso de GANADOR: --------- \n");
		
		Tragamonedas tragamoneda = new Tragamonedas();
		
				
		if(tragamoneda.entregarPremio()==true)
			System.out.printf("\n %d | %d | %d  $$$$ GANASTE!! $$$$$ \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		else
			System.out.printf("\n %d | %d | %d - PERDISTE! :( Sigue participando!! \n ",tragamoneda.tambor1.getPosicion(),tragamoneda.tambor2.getPosicion(),tragamoneda.tambor3.getPosicion());
		
		
	}*/
	
	
}
