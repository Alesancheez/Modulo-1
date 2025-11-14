package test;

import entity.Guia;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GuiaTest {

    private static Guia guiaprueba;


    @BeforeAll
    static void iniciar() {
    guiaprueba=new Guia(200,25147854,"pedro");
    }
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setDniGuia() {
        guiaprueba.setDniGuia(6255555);
        assertEquals(guiaprueba.getDniGuia(),6255555);
    }
}