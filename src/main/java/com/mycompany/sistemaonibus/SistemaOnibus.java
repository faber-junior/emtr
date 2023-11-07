/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemaonibus;

/**
 *
 * @author pedro
 */
import java.util.Scanner;

public class SistemaOnibus {

    static String[] lugaresItaSp = new String[46];
    static String[] clientesItaSp = new String[46];
    static String[] lugaresItaJ = new String[46];
    static String[] clientesItaJ = new String[46];
    static String[] lugaresItaM = new String[46];
    static String[] clientesItaM = new String[46];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 -- Itatiba com destino a São Paulo -> 01/12 as 12h00");
            System.out.println("2 -- Itatiba com destino a Jundiaí -> 01/12 as 13h00");
            System.out.println("3 -- Itatiba com destino a Morungaba -> 01/12 as 10h00");
            System.out.println("4 -- Mostrar clientes");
            System.out.println("5 -- Encerrar programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    reservarLugar(1, "Itatiba -> São Paulo");
                    break;
                case 2:
                    reservarLugar2(2, "Itatiba -> Jundiaí");
                    break;
                case 3:
                    reservarLugar3(3, "Itatiba -> Morungaba");
                    break;
                case 4:
                    mostrarClientes();
                    break;
                case 5:
                    encerrarPrograma();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void reservarLugar(int onibus, String rota) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lugares disponíveis no ônibus " + rota + ":");
        for (int i = 0; i < lugaresItaSp.length; i++) {
            if (lugaresItaSp[i] == null) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print("X ");
            }
        }

        System.out.print("\nEscolha um lugar vago: ");
        int lugar = scanner.nextInt();

        if (lugar < 1 || lugar > lugaresItaSp.length || lugaresItaSp[lugar - 1] != null) {
            System.out.println("Lugar inválido ou ocupado. Tente novamente.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String nome = scanner.next();

        System.out.print("CPF do cliente: ");
        String cpf = scanner.next();

        if (validarCPF(cpf)) {
            lugaresItaSp[lugar - 1] = cpf;
            clientesItaSp[lugar - 1] = nome;
            System.out.println("Reserva efetuada com sucesso!");
        } else {
            System.out.println("CPF inválido. A reserva não pôde ser concluída.");
        }
    }

    public static void reservarLugar2(int onibus, String rota) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lugares disponíveis no ônibus " + rota + ":");
        for (int i = 0; i < lugaresItaJ.length; i++) {
            if (lugaresItaJ[i] == null) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print("X ");
            }
        }

        System.out.print("\nEscolha um lugar vago: ");
        int lugar = scanner.nextInt();

        if (lugar < 1 || lugar > lugaresItaJ.length || lugaresItaJ[lugar - 1] != null) {
            System.out.println("Lugar inválido ou ocupado. Tente novamente.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String nome = scanner.next();

        System.out.print("CPF do cliente: ");
        String cpf = scanner.next();

        if (validarCPF(cpf)) {
            lugaresItaJ[lugar - 1] = cpf;
            clientesItaJ[lugar - 1] = nome;
            System.out.println("Reserva efetuada com sucesso!");
        } else {
            System.out.println("CPF inválido. A reserva não pôde ser concluída.");
        }
    }

    public static void reservarLugar3(int onibus, String rota) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lugares disponíveis no ônibus " + rota + ":");
        for (int i = 0; i < lugaresItaM.length; i++) {
            if (lugaresItaM[i] == null) {
                System.out.print(i + 1 + " ");
            } else {
                System.out.print("X ");
            }
        }

        System.out.print("\nEscolha um lugar vago: ");
        int lugar = scanner.nextInt();

        if (lugar < 1 || lugar > lugaresItaM.length || lugaresItaM[lugar - 1] != null) {
            System.out.println("Lugar inválido ou ocupado. Tente novamente.");
            return;
        }

        System.out.print("Nome do cliente: ");
        String nome = scanner.next();

        System.out.print("CPF do cliente: ");
        String cpf = scanner.next();

        if (validarCPF(cpf)) {
            lugaresItaM[lugar - 1] = cpf;
            clientesItaM[lugar - 1] = nome;
            System.out.println("Reserva efetuada com sucesso!");
        } else {
            System.out.println("CPF inválido. A reserva não pôde ser concluída.");
        }
    }

    public static void mostrarClientes() {
        System.out.println("Clientes e lugares reservados Ônibus Itatiba -> São Paulo:");
        for (int i = 0; i < lugaresItaSp.length; i++) {
            if (lugaresItaSp[i] != null) {
                System.out.println("Ônibus " + (i / 15 + 1) + ", Lugar " + (i % 15 + 1) + ": " + clientesItaSp[i] + " (CPF: " + lugaresItaSp[i] + ")");
            }
        }
        System.out.println("Clientes e lugares reservados Ônibus Itatiba -> Jundiaí:");
        for (int i = 0; i < lugaresItaJ.length; i++) {
            if (lugaresItaJ[i] != null) {
                System.out.println("Ônibus " + (i / 15 + 1) + ", Lugar " + (i % 15 + 1) + ": " + clientesItaJ[i] + " (CPF: " + lugaresItaJ[i] + ")");
            }
        }
        System.out.println("Clientes e lugares reservados Ônibus Itatiba -> Morungaba:");
        for (int i = 0; i < lugaresItaM.length; i++) {
            if (lugaresItaM[i] != null) {
                System.out.println("Ônibus " + (i / 15 + 1) + ", Lugar " + (i % 15 + 1) + ": " + clientesItaM[i] + " (CPF: " + lugaresItaM[i] + ")");
            }
        }
    }

    public static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
    }

    public static boolean validarCPF(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Verifica o primeiro dígito verificador
        if (primeiroDigito != (cpf.charAt(9) - '0')) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica o segundo dígito verificador
        if (segundoDigito != (cpf.charAt(10) - '0')) {
            return false;
        }

        return true;
    }
}
