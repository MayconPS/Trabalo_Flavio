package com.trabalhoFlavio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tarefas {
    private List<String> tasks;

    public Tarefas() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Tarefa adicionada: " + task);
    }

    public void saveTasksToFile(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            writer.close();
            System.out.println("Tarefas salvas em " + fileName);
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar as tarefas em " + fileName);
            e.printStackTrace();
        }
    }
}
