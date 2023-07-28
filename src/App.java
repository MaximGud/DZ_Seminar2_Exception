import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Задача 1:
        // Напишите программу, которая запрашивает у пользователя число и проверяет,
        // является ли оно положительным.
        // Если число отрицательное или равно нулю, программа должна выбрасывать
        // исключение InvalidNumberException
        // с сообщением "Некорректное число". В противном случае, программа должна
        // выводить сообщение "Число корректно".
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        try {
            int number = scanner.nextInt();
            if (number < 0 || number == 0) {
                throw new InvalidNumberException("Некорректное число");
            } else {
                System.out.println("Число корректно");
            }
        } catch (InvalidNumberException e) {
            System.err.println(e.getMessage());
        }

        // Задача 2:
        // Напишите программу, которая запрашивает у пользователя два числа и выполняет
        // их деление. Если второе число равно нулю,
        // программа должна выбрасывать исключение DivisionByZeroException с сообщением
        // "Деление на ноль недопустимо". В противном случае,
        // программа должна выводить результат деления.

        // Обратите внимание, что в обоих задачах используются собственные исключения,
        // которые наследуются от класса Exception. Это позволяет
        // нам определить специфическую причину ошибки и передать информацию об ошибке
        // для последующей обработки.
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner1.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner1.nextInt();

        try {
            double res = (double) num1 / (double) num2;
            if (num2 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо");
            }

            else {
                System.out.println("Результат деления равен: " + res);
            }
        } catch (DivisionByZeroException e) {
            System.err.println(e);
        }

    }
}
