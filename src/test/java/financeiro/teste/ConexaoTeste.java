package financeiro.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import financeiro.util.Calculo;

public class ConexaoTeste {

	@Test
	public void test() {
		 float passaValor1 = 10;
		 float passaValor2 = 5;
		 float retornoEsperado = 15;
		 
		 float retornoFeito = Calculo.executaCalculo(passaValor1, passaValor2);
		 assertEquals(retornoEsperado, retornoFeito,0);
		
	}

}
