import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ip-адреса через пробел: ");
        Scanner in = new Scanner(System.in);
        String ips = in.nextLine();
        String[] Ips = ips.split(" ");
        for (String ip: Ips) {
            if (ip.matches("(\\b([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\b")){
                System.out.println("Корректный ip-адрес: " + ip);
            }
            else System.out.println("Не корректный ip-адрес: " + ip);

        }
    }
}
