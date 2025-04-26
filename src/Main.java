import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,us;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabanı giriniz : ");
        taban= sc.nextInt();
        System.out.println("Üssü giriniz : ");
        us = sc.nextInt();
        int total = 1;
        for (int i =1; i<=us; i++) {
            total *= taban;

        }

        System.out.println("Sonuç : " + total);













    }
}