package com.exercicio03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
/**
 * Unit test for simple App.
 */
public class EncomendaTest{

    private Encomenda encomenda;
    /**
     * Rigorous Test :-)
     */
    @BeforeEach
    public void initialize(){
        this.encomenda = new Encomenda();
    }
    
    @Test
    public void testeCom20barras(){
        int[] esperado = {0,4};
        int[] resultado = encomenda.qtdadeBarras(0, 7, 20);
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testeCom23barras(){
        int[] esperado = {3,4};
        int[] resultado = encomenda.qtdadeBarras(20, 20, 23);
        Assertions.assertEquals(esperado, resultado);
    }
}
