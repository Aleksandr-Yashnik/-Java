public class Lesson02Part2 {
    public static void main(String[] args) {
        // int - тип переменной. Указывается лишь единожды при ее создании
        // x - имя переменной. Имя переменно должно быть уникальным в рамках блока (класса, метода или дургого блока)
        // = - символ присвоения значения
        // 23 - значение, которое будет храниться в переменно "х" до того момента, пока мы не изменим его
        // ; - обязательный атрибут, характеризующий завершение логического блока

        int x = 23; // объявление переменной х и присвоение ей значения в одной строке
        x = 45; // изменение значения переменной x


        double d; // объявление переменной d
        d = 12.4; // присвоение ей значения в другой строке


        // копилка = 568.15;
        // спонтанные_траты = 200.00;
        // основной_кошелек = 100_000.00;

        double coinBox = 0.0;
        double spendings = 0.0;

        // символ _ - используется в качестве визуального разделителя для больших чисел. Не обязательно к применению
        double income = 10_000.00;

        // 2% - значение, которое откладываем с каждой зарплаты в копилочку
        double percentForCoinBox = 0.02; // 1.00 - соответствуют 100%, следовательно 0.02 - 2%

        // 10% - значение, которое откладываем с каждой зарплаты на различные траты
        double percentForSpendings = 0.1;


        // * - символ математического умножения
        // таким образом, переменна я coinBox имеет значение, равное результату умножения переменных
        // income (общая зарплата) и percentForCoinBox (процент, который фиксированно выделяем в копилку)
        // это неверно! потому что наша копилка всегда будет равна 2% от зарплаты, но все накопления будут сгорать:
        // coinBox = income * percentForCoinBox; // закомментировано, чтобы не хранить не верные значения

        // верным будет прибавить к уже имеющимся средствам 2% от поступлений:
        coinBox = coinBox + income * percentForCoinBox;



        // значение переменно изменится лишь в операции присвоения, то есть: "income = ..."
        System.out.println(income);
        System.out.println(coinBox);
        spendings = income * percentForSpendings; // 10_000.0 * 0.1 = 1000.0
        System.out.println(spendings);

        // 10000.0
        income = income - income * percentForSpendings - income * percentForCoinBox;
        System.out.println(income);

        // математические операции по уменьшению приоритета от высокого приоритета к низкому:
        // (операции в скобках имеют более высокий приоритет)
        // * / % - сначала выполнятся эти операции, затем все остальные.
        // Если есть операции с одинаковы приоритетом, то выполняться будут в порядке появления слева на право

        double exampleOne = 10 / 5 * 2; // 4
        System.out.println(exampleOne);

        exampleOne = 10 / (5 * 2); // 1
        System.out.println(exampleOne);

    }
    }