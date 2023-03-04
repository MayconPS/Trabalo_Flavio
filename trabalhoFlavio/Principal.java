package com.trabalhoFlavio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tarefas taskList = new Tarefas();

        System.out.println("Bem-vindo à lista de tarefas!");

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Salvar tarefas em arquivo");
            System.out.println("3. Sair");

            int option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Criar tarefa: ");
                scanner.nextLine();
                String task = scanner.nextLine();
                taskList.addTask(task);
            } else if (option == 2) {
                System.out.print("Digite o nome do arquivo: ");
                scanner.nextLine();
                String fileName = scanner.nextLine();
                taskList.saveTasksToFile(fileName);
            } else if (option == 3) {
                System.out.println("Até mais!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
