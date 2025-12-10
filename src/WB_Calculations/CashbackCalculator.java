package WB_Calculations;

import java.util.Scanner;

public class CashbackCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод параметров
        System.out.print("Введите salePriceU (в копейках): ");
        long salePriceU = scanner.nextLong();

        System.out.print("Введите saleCondition: ");
        int saleCondition = scanner.nextInt();

        // Расчёт кешбэка
        int cashbackPercent = (saleCondition >> 13) & 31;

        // Расчёт с округлением в большую сторону через Math.ceil
        double cashbackDouble = (double) salePriceU * cashbackPercent / 100;
        long cashbackValue = (long) Math.ceil(cashbackDouble);

        // Вывод результатов
        System.out.println("Процент кешбэка: " + cashbackPercent + "%");
        System.out.println("Размер кешбэка: " + cashbackValue + " ЯГОДОК.");

        scanner.close();
    }
}
