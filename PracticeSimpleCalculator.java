import java.util.Scanner;

/**
 * Написать простой калькулятор, использующий оператор `switch` для выполнения базовых арифметических операций:
 * сложение, вычитание, умножение и деление.
 * <p>
 * Описание Задачи: Разработайте программу, которая запрашивает у пользователя выбор операции (сложение, вычитание,
 * умножение, деление) и два числа, а затем выполняет выбранную операцию с этими числами.
 * <p>
 * Шаги Решения: 1. Используйте `Scanner` для считывания введенной пользователем операции и двух чисел. 2. Используйте
 * `switch` для выбора операции в зависимости от введенной команды. 3. Выполните выбранную операцию и выведите
 * результат. 4. Убедитесь, что ваша программа корректно обрабатывает деление на ноль и выводит соответствующее
 * сообщение об ошибке.
 */
public class PracticeSimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию (сложение, вычитание, умножение, деление):");
        String operation = scanner.next().toLowerCase();

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        double result = 0;
        switch (operation) {
            case "сложение":
               result = num1+num2;
               break;
            case "вычитание":
                result = num1 - num2;
                break;
            case "умножение":
                result = num1 * num2;
                break;
            case "деление":
                result = num1 / num2;
                break;
            default:
                System.err.println("System Error");
        }

        System.out.printf("Результат: %.2f\n", result);
    }
    enum operation{

    }
}
