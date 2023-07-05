package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //AdicionaGanho aGanho = new AdicionaGanho();
        //AdicionaGasto aGasto = new AdicionaGasto();
        int opcao = 0;
        int indexGanho = 0;
        int indexGasto = 0;
        Scanner entrada = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println("----- Gestão Financeira 2.0 -----");
            System.out.println("1- Adicionar Gastos");
            System.out.println("2- Adicionar src.Ganho");
            System.out.println("3- Relatório de Gastos");
            System.out.println("4- Relatório de Ganhos");
            System.out.println("5- Relatório Mensal");
            System.out.println("6- Sair");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    //indexGasto = aGasto.MainAdicionarGasto(indexGasto);
                    break;
                case 2:
                    //indexGanho = aGanho.MainAdicionarGanho(indexGanho);
                    break;
                case 3:
                    //GastosView relGastos = new GastosView();
                    //relGastos.RelatorioGanhos(aGasto.g, indexGasto);
                    break;
                case 4:
                    //GanhosView relGanhos = new GanhosView();
                    //relGanhos.RelatorioGanhos(aGanho.g, indexGanho);
                    break;
                case 5:
                    //SaldoView saldo = new SaldoView();
                    //saldo.RelatorioSaldoMensal(aGanho.g,indexGanho, aGasto.g, indexGasto);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
        //src.TesteArquivo.criarArquivo("C:\\Users\\Richard Melo\\Documents\\Faculdade\\arquivo.txt");
}