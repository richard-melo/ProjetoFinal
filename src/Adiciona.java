package src;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Adiciona extends Orcamento {
    int opcao = 0;
    public Scanner entrada = new Scanner(System.in);
    String Nome;
    double Valor;
    String Metodo;
    LocalDate Data;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Adiciona(String Metodo){
        this.Metodo = Metodo;
        try {
            adicionarPorTipo(Metodo);
        } catch (Exception e) {
            System.out.println("Erro ao adicionar " + Metodo);
        }
    }

    protected void adicionarPorTipo(String Metodo) {
        String Tipo = "";

        if (Metodo.equals("gasto")){
            Tipo = definirTipoGasto();
        } else if (Metodo.equals("ganho")){
            Tipo = definirTipoGanho();
        } else {
            System.out.println("Tipo inválido");
        }

        System.out.println("Informe o título do " + Metodo);
        Nome = entrada.next();
        System.out.println("Informe o valor do " + Metodo);
        Valor = entrada.nextDouble();
        System.out.println("Informe a data do " + Metodo + " no formato dd/MM/yyyy");
        String dataTemp = entrada.next();
        Data = LocalDate.parse(dataTemp, formatter);

        if (Metodo.equals("gasto")) {
            System.out.println("Informe a forma de pagamento do gasto");
            String pagamento = entrada.next();

            Gasto gasto = new Gasto();
            gasto.adicionarGasto(Nome, Tipo, Data, Valor, pagamento);
        } else if (Metodo.equals("ganho")){
            Ganho ganho = new Ganho();
            ganho.adicionarGanho(Nome, Tipo, Data, Valor);
        } else {
            System.out.println("Tipo inválido");
        }
    }

    private String definirTipoGanho() {
        String Tipo = "";
        System.out.println("----- Menu de Ganhos -----");
        System.out.println("1- Salário");
        System.out.println("2- Freelancer");
        System.out.println("3- Dividendos");
        System.out.println("99- Sair");

        opcao = entrada.nextInt();
        switch (opcao) {

            case 1:
                Tipo = "Salário";
                break;
            case 2:
                Tipo = "Freelancer";
                break;
            case 3:
                Tipo = "Dividendos";
                break;
            case 99:
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        return Tipo;
    }

    private String definirTipoGasto() {
        String Tipo = "";
        System.out.println("----- Menu de Gastos -----");
        System.out.println("1- Alimentação");
        System.out.println("2- Moradia");
        System.out.println("3- Transporte");
        System.out.println("4- Saúde");
        System.out.println("5- Lazer");
        System.out.println("6- Outros");
        System.out.println("99- Sair");

        opcao = entrada.nextInt();
        switch (opcao) {

            case 1:
                Tipo = "Alimentação";
                break;
            case 2:
                Tipo = "Moradia";
                break;
            case 3:
                Tipo = "Transporte";
                break;
            case 4:
                Tipo = "Saúde";
                break;
            case 5:
                Tipo = "Lazer";
                break;
            case 6:
                Tipo = "Outros";
                break;
            case 99:
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        return Tipo;
    }
}