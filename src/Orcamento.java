package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


abstract class Orcamento {
    private String Nome;
    private String Descricao;
    private LocalDate Data;
    private double Valor;

    protected List<Gasto> gastos = new ArrayList<>();
    protected List<Ganho> ganhos = new ArrayList<>();

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

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
            retorno = Nome + " | " + Descricao + " | " + Data.format(formatter) + " | " + Valor + "\n";
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

    public void adicionarGasto(String nome, String descricao, LocalDate data, double valor, String pagamento) {
        Gasto gasto = new Gasto();
        gasto.setOrcamento(nome, descricao, data, valor, pagamento);
        gastos.add(gasto);
        //print the gasto list
        for (Orcamento g : gastos) {
            System.out.println(g);
        }
    }

    public void adicionarGanho(String nome, String descricao, LocalDate data, double valor) {
        Ganho ganho = new Ganho();
        ganho.setOrcamento(nome, descricao, data, valor);
        ganhos.add(ganho);
    }

    public String relatorioGastos(int mes, int ano) {
        StringBuilder relatorio = new StringBuilder();
        for (Orcamento gasto : gastos) {
            relatorio.append(gasto.getOrcamento(mes, ano));
        }
        return relatorio.toString();
    }

    public String relatorioGanhos(int mes, int ano) {
        StringBuilder relatorio = new StringBuilder();
        for (Orcamento ganho : ganhos) {
            relatorio.append(ganho.getOrcamento(mes, ano));
        }
        return relatorio.toString();
    }

    public String relatorioMensal(int mes, int ano) {
        StringBuilder relatorio = new StringBuilder();
        for (Orcamento gasto : gastos) {
            if (gasto.getData().getMonthValue() == mes && gasto.getData().getYear() == ano) {
                relatorio.append(gasto.getOrcamento(mes, ano));
            }
        }
        for (Orcamento ganho : ganhos) {
            if (ganho.getData().getMonthValue() == mes && ganho.getData().getYear() == ano) {
                relatorio.append(ganho.getOrcamento(mes, ano));
            }
        }
        return relatorio.toString();
    }

}
