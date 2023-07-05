package src;

import java.time.LocalDate;

public class Gasto extends Orcamento{
    private String pagamento;

    public void setOrcamento(String nome, String descricao, LocalDate data, double valor, String pagamento){
        setOrcamento(nome, descricao, data, valor);
        this.pagamento = pagamento;
    }

    public String getOrcamento(int mes, int ano){
        String retorno = "";
        if (Data.getMonthValue() == mes && Data.getYear() == ano) {
            retorno = Nome + " | " + Descricao + " | " + formatter.format(Data) + " | " + Valor + " | " + pagamento + "\n";
        }
        return retorno;
    }
}