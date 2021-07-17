package br.edu.infnet.domain.requerimento;

import org.junit.Assert;
import org.junit.Test;

public class RequerimentoTest {

	@Test
	public void test() {
		
		Requerimento r1 = new Requerimento();
		r1.setId(1);
		r1.setNome("Lista de Tarefas");
		
		
		Assert.assertEquals(r1.getId(), new Integer(1));
		Assert.assertEquals(r1.getNome(), "Lista de Tarefas");
	}

}
