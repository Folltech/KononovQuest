package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class DifficultyLevel {
    public void writeDifficult() {
        try (FileWriter writer = new FileWriter("config.txt", false)) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество комнат: ");
            if (scan.hasNextInt()) {
                int rooms = scan.nextInt();
                if (rooms > 30 || rooms < 10) {
                    int rnd = (int) (Math.random() * 2);
                    System.out.println("Некорректное число. Значение заменено на случайное число умолчанию!");
                    writer.write("Number_of_rooms = " + (rnd + 1) * 10 + "\n");
                } else {
                    writer.write("Number_of_rooms = " + rooms + "\n");
                }
            } else {
                scan.next();
                int rnd = (int) (Math.random() * 2);
                System.out.println("Ошибка распознования числа. Значение заменено на случайное число умолчанию!");
                writer.write("Number_of_rooms = " + (rnd + 1) * 10 + "\n");
            }
            System.out.println("Введите время сна монстра(сек.): ");
            if (scan.hasNextInt()) {
                int monster_time = scan.nextInt();
                if (monster_time > 60 || monster_time < 30) {
                    int rnd = (int) (Math.random() * 2);
                    System.out.println("Некорректное число. Значение заменено на случайное число умолчанию!");
                    writer.write("The_Monster_Dream = " + (rnd + 2) * 15 + "\n");
                } else {
                    writer.write("The_Monster_Dream = " + monster_time + "\n");
                }
            } else {
                scan.next();
                int rnd = (int) (Math.random() * 2);
                System.out.println("Ошибка распознования числа. Значение заменено на случайное число умолчанию!");
                writer.write("The_Monster_Dream = " + (rnd + 1) * 15 + "\n");
            }
            System.out.println("Введите количество жизней: ");

            if (scan.hasNextInt()) {
                int live = scan.nextInt();
                if (live > 3 || live < 1) {
                    int rnd = (int) (Math.random() * 2);
                    System.out.println("Некорректное число. Значение заменено на случайное число умолчанию!");
                    writer.write("Lives = " + (rnd + 1) + "\n");
                } else {
                    writer.write("Lives = " + live + "\n");
                }
            } else {
                scan.next();
                int rnd = (int) (Math.random() * 2);
                System.out.println("Ошибка распознования числа. Значение заменено на случайное число умолчанию!");
                writer.write("Lives = " + (rnd + 1) + "\n");
            }
        }
        catch(IOException ex){
                System.out.println(ex.getMessage());
        }
    }
}

