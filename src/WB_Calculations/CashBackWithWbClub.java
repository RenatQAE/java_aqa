package WB_Calculations;

import java.util.Scanner;

public class CashBackWithWbClub {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ввод параметров
                System.out.print("Введите salePriceU (в копейках): ");
                long salePriceU = scanner.nextLong();

                System.out.print("Введите saleCondition: ");
                int saleCondition = scanner.nextInt();

                System.out.print("Введите % скидки по ВБ Клубу: ");
                int clubDiscountPercent = scanner.nextInt();

                System.out.print("Введите количество товаров: ");
                int quantity = scanner.nextInt();

                // Расчёт кешбэка
                int cashbackPercent = (saleCondition >> 13) & 31;

                // Расчёт финальной стоимости по ВБ Клубу
                long productPriceAfterClubDiscount = salePriceU * (100 - clubDiscountPercent) / 100;
                long totalPrice = productPriceAfterClubDiscount * quantity;

                // Расчёт кешбэка с округлением в большую сторону
                long cashbackValue = (salePriceU * quantity * cashbackPercent + 99) / 100;

                // Вывод результатов
                System.out.println("Процент кешбэка: " + cashbackPercent + "%");
                System.out.println("Размер кешбэка: " + cashbackValue + " коп.");
                System.out.println("Цена товара со скидкой клуба: " + productPriceAfterClubDiscount + " коп.");
                System.out.println("Финальная стоимость заказа: " + totalPrice + " Ягодок.");

                scanner.close();
            }
        }

