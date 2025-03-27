package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом:");
        String input = scanner.nextLine();
        scanner.close();

        // Регулярное выражение для поиска корректного IPv4-адреса
        String ipPattern = "\\b((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\b";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Найден корректный IP-адрес: " + matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("Корректный IP-адрес не найден.");
        }
    }
}
