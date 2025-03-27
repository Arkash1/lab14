package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ � IP-�������:");
        String input = scanner.nextLine();
        scanner.close();

        // ���������� ��������� ��� ������ ����������� IPv4-������
        String ipPattern = "\\b((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\b";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(input);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("������ ���������� IP-�����: " + matcher.group());
            found = true;
        }

        if (!found) {
            System.out.println("���������� IP-����� �� ������.");
        }
    }
}
