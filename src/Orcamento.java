package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class Orcamento {
    private String Nome;
    private String Descricao;
    private LocalDate Data;
    private double Valor;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void setOrcamento(String nome, String descricao, LocalDate data, double valor){
        this.Nome = nome;
        this.Descricao = descricao;
        this.Data = data;
        this.Valor = valor;
    }
    public String getOrcamento (int mes, int ano){
        String retorno = "";
        if (Data.getMonthValue() == mes && Data.getYear() == ano) {
            retorno = Nome + " | " + Descricao + " | " + formatter.format(Data) + " | " + Valor + "\n";
        }
        return retorno;
    }
    public double getValor(int mes, int ano){
        double valor = 0;
        if (Data.getMonthValue() == mes && Data.getYear() == ano){
            valor = this.Valor;
        }
        return valor;
    }
}
