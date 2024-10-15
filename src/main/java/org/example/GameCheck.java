package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GameCheck {
        public void gameConfigCheck() {
            String filePath = "config.txt";
            Map<String, Integer> configValues = new HashMap<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Убираем пробелы в начале и в конце строки
                    line = line.trim();
                    // Пропускаем пустые строки
                    if (line.isEmpty()) {
                        continue;
                    }
                    // Разделяем строку на имя переменной и значение
                    String[] parts = line.split("=");
                    if (parts.length == 2) {
                        String key = parts[0].trim();
                        int value = Integer.parseInt(parts[1].trim());
                        configValues.put(key, value);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Выводим значения, считанные из файла for (Map.Entry<String, Integer> entry : configValues.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        }
}
