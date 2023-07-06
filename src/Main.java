package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
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
                    Adiciona adicionaGasto = new Adiciona("gastos");
                    break;
                case 2:
                    Adiciona adicionaGanho = new Adiciona("ganhos");
                    break;
                // case 3: relatorioGastos();
                // case 4: relatorioGanhos();
                // case 5: relatorioMensal();
                case 6: System.out.println("Encerrando o programa. Até logo!");
                default: System.out.println("Opção Inválida");
            }
        }
    }

        //src.TesteArquivo.criarArquivo("C:\\Users\\Richard Melo\\Documents\\Faculdade\\arquivo.txt");
}