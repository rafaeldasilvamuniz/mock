package br.com.rpires;

import org.junit.Assert;
import org.junit.Test;
import java.*;

import br.com.rpires.TesteCliente;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Ribeiro");
		cli.adicionarNome1("Ribeiro");

		Assert.assertEquals("Ribeiro", cli.getNome());
	}
}
