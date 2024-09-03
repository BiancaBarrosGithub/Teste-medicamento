package com.teste.medicamento.entity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MedicamentoTest {
	
	private Medicamento medicamento;

	
	@BeforeEach
	void setUp() {
		//Arrange
		medicamento = new Medicamento(1L,"buscopan", "Este medicamento devera tomar apenas a partir dos 11 anos ", "10/12/2024");
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		medicamento.setId(2L);
		//Assert
		assertEquals(2L,medicamento.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		medicamento.setNome("paracetamol");
		//Assert
		assertEquals("paracetamol", medicamento.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo bula")
	void testEmail() {
		//Act
		medicamento.setBula("Neste medicamento não podera fazer muitos exercicios");
		//Assert
		assertEquals("Neste medicamento não podera fazer muitos exercicios", medicamento.getBula());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo data de validade")
	void testDataValidade() {
		//Act
		medicamento.setDataValidade("28/04/2025");
		//Assert
		assertEquals("28/04/2025", medicamento.getDataValidade());
	}
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testContrutorAll() {
		//Act
		Medicamento novoMedicamento = new Medicamento(3L,"Advil","Este medicamento é forte", "12/07/2025");
		//Assertion
		assertAll("novoMedicamento",
				()-> assertEquals(3L, novoMedicamento.getId()),
				()-> assertEquals("Advil", novoMedicamento.getNome()),
				()-> assertEquals("Este medicamento é forte", novoMedicamento.getBula()),
				()-> assertEquals("12/07/2025", novoMedicamento.getDataValidade()));
	}
}


