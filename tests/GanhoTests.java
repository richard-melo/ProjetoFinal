package tests;

import org.junit.jupiter.api.Test;
import src.Ganho;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class GanhoTests {
    public void testSetOrcamentoGanho(){
        Ganho ganho = new Ganho();
        ganho.setOrcamento("Trabalho", "8 horas trabalhadas", LocalDate.now(), 1133.13);
    }
}
