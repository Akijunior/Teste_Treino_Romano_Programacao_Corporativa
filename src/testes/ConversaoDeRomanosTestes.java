package testes;
import modelo.ConversorDeRomanos;

public class ConversaoDeRomanosTestes implements TestCase{
	
	ConversorDeRomanos conversor;
	@Test
	public void	deve_converter_letra_pra_numero()  throws Exception {
		assertEquals(1, conversor.converteRomanosPraInteiro("I"), 0.1);
		assertEquals(10, conversor.converteRomanosPraInteiro("X"), 0.1);
		assertEquals(100, conversor.converteRomanosPraInteiro("C"), 0.1);
	}
	
	@Test
	public void deve_falhar_com_letras_invalidas(){
		
	}
	
	@Test
	public void nao_deve_conter_mais_repeticoes_de_letra_do_que_o_permitido(){
		
	}
	
}
