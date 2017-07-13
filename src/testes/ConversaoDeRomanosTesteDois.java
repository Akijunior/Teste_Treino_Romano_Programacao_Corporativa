package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import modelo.ConversorDeRomanos;

public class ConversaoDeRomanosTestes {
	
	ConversorDeRomanos conversor;
	
	@Test
	public void	deve_converter_letra_pra_numero(){
		assertEquals(1, conversor.converteRomanosPraInteiro("I"), 0.1);
		assertEquals(10, conversor.converteRomanosPraInteiro("X"), 0.1);
		assertEquals(100, conversor.converteRomanosPraInteiro("C"), 0.1);
		
	}
	
	@Test
	public void deve_falhar_com_letras_invalidas(){
		
	}
	
}
