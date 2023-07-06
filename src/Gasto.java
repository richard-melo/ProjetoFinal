package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gasto extends Orcamento{
    private String pagamento;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public void setOrcamento(String nome, String descricao, LocalDate data, double valor, String pagamento){
        setOrcamento(nome, descricao, data, valor);
        this.pagamento = pagamento;
    }

    public String getOrcamento(int mes, int ano){
        String retorno = "";
        LocalDate data = getData();
        String nome = getNome();
        String descricao = getDescricao();
        double valor = getValor();

        if (data.getMonthValue() == mes && data.getYear() == ano) {
            retorno = nome + " | " + descricao + " | " + data.format(formatter) + " | " + valor + " | " + pagamento + "\n";
        }
        return retorno;
    }


}