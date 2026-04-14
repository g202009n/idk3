package app;

import java.util.Scanner;
import models.Personagem;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Personagem personagem = new Personagem("v1", 50, 25, 50);

        int opcao;

        do {
            System.out.println("\n1 - mostrar personagem");
            System.out.println("2 - alterar nome");
            System.out.println("3 - alterar velocidade");
            System.out.println("4 - alterar quantidade de armas");
            System.out.println("5 - alterar quantidade de combos");
            System.out.println("0 - sair");
            System.out.print("\nEscolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n");
                    System.out.println(personagem);
                    break;

                case 2:
                    System.out.print("\nnovo nome: ");
                    String novoNome = scanner.nextLine();
                    personagem.setNome(novoNome);
                    break;

                case 3:
                    System.out.print("\nnova velocidade: ");
                    int v = scanner.nextInt();
                    personagem.setVelocidade(v);
                    break;

                case 4:
                    System.out.print("\nnova quantidade de armas: ");
                    int a = scanner.nextInt();
                    personagem.setQuantidadeDeArmas(a);
                    break;

                case 5:
                    System.out.print("\nnova quantidade de combos: ");
                    int c = scanner.nextInt();
                    personagem.setQuantidadeDeCombos(c);
                    break;

                case 0:
                    System.out.println("\nsaindo...");
                    break;

                default:
                    System.out.println("\nopcao invalida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}