package org.example;

import java.io.*;
import java.util.Scanner;

public class Menu {
    public void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("——————————————————————————————————————————————————");
            System.out.println("МЕНЮ:)\n");
            System.out.println("1. Начать игру\n" +
                    "2. Настройка сложности\n" +
                    "3. Описание игры\n" +
                    "4. Выход");
            System.out.println("——————————————————————————————————————————————————");
            System.out.print("Выберете пункт меню: ");
            if (scan.hasNextInt()) {
                int m = scan.nextInt();
                if (m <= 4 && m >= 1) {
                    switch (m) {
                        case 1:
                            startGame();
                            break;
                        case 2:
                            difficultChoise();
                            break;
                        case 3:
                            description();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                    }
                }else{
                    System.out.println("Неверное число.");
                }
            } else {
                System.out.println("Это не число.");
                scan.next();
            }
        }
    }
    public void startGame() {
        Game game = new Game();
        game.Start();
    }
    public void difficultChoise() {
        DifficultyLevel dif = new DifficultyLevel();
        dif.writeDifficult();
    }
    public void description() {
        try(FileReader reader = new FileReader("description.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        System.out.print("\nНажмите любую клавишу чтобы продолжить");
        new Scanner(System.in).nextLine();
    }
}
