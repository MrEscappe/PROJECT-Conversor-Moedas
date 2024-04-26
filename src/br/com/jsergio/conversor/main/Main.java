package br.com.jsergio.conversor.main;

import br.com.jsergio.conversor.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha;
        do {
            System.out.println("Conversor de moedas");
            System.out.println("**********************************");
            System.out.println("1 - Dólar para Real");
            System.out.println("2 - Real para Dólar");
            System.out.println("3 - Euro para Real");
            System.out.println("4 - Real para Euro");
            System.out.println("5 - Libra para Real");
            System.out.println("6 - Real para Libra");
            System.out.println("7 - Sair");
            System.out.println("**********************************");
            System.out.println("Digite a opção desejada:");

            escolha = scanner.nextLine();
            switch (escolha){
                case "1":
                    System.out.println("Digite o valor em dólar que deseja converter para real:");
                    String valorDolar = scanner.nextLine();
                    DolarToReal dolarToReal = new DolarToReal(valorDolar);
                    try {
                        System.out.println(dolarToReal.convertToReal());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case "2":
                    System.out.println("Digite o valor em real que deseja converter para dólar:");
                    String valorReal = scanner.nextLine();
                    RealToDolar realToDolar = new RealToDolar(valorReal);
                    try {
                        System.out.println(realToDolar.convertToDolar());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "3":
                    System.out.println("Digite o valor em euro que deseja converter para real:");
                    String valorEuro = scanner.nextLine();
                    EuroToReal euroToReal = new EuroToReal(valorEuro);
                    try {
                        System.out.println(euroToReal.convertToReal());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "4":
                    System.out.println("Digite o valor em real que deseja converter para euro:");
                    String valorRealParaEuro = scanner.nextLine();
                    RealToEuro realToEuro = new RealToEuro(valorRealParaEuro);
                    try {
                        System.out.println(realToEuro.convertToEuro());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "5":
                    System.out.println("Digite o valor em libra que deseja converter para real:");
                    String valorLibra = scanner.nextLine();
                    LibraToReal libraToReal = new LibraToReal(valorLibra);
                    try {
                        System.out.println(libraToReal.convertToReal());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "6":
                    System.out.println("Digite o valor em real que deseja converter para libra:");
                    String valorRealParaLibra = scanner.nextLine();
                    RealToLibra realToLibra = new RealToLibra(valorRealParaLibra);
                    try {
                        System.out.println(realToLibra.convertToLibra());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "7":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (!escolha.equals("7"));
    }
}
