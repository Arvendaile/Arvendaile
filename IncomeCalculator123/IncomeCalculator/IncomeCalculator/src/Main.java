import java.util.Scanner;
//создали класс
public class Main {
    private static int minIncome = 200000;   //задали минимальное значение прибыли, целое число
    private static int maxIncome = 900000;   //задали максимальное значение прибыли, целое число

    private static int officeRentCharge = 140000;    // задали плату за аренду офиса, целое число
    private static int telephonyCharge = 12000;      // задали плату за телефонию, целое число
    private static int internetAccessCharge = 7200;  // задали плату за интернет, целое число

    private static int assistantSalary = 45000;      // задали плату асистентам, целое число
    private static int financeManagerSalary = 90000; // задали плату финансовому менеджеру, целое число

    private static double mainTaxPercent = 0.24;     // задали основной налог в процентах, дробное числа
    private static double managerPercent = 0.15;     // задали процент менеджера, дробное числа

    private static double minInvestmentsAmount = 100000; // задали сумму минимальной инвестиции, дробное число

    //создали класс, использовали цикл While
    public static void main(String[] args) {

        minIncome = (int) ((minInvestmentsAmount + calculateFixedCharges() * (1 - mainTaxPercent))/
                ((1 - mainTaxPercent) * (1 - managerPercent)) + 1);
        System.out.println("Минимальный доход для инвестиций: " + minIncome);

        double minimumIn;
        for (minimumIn = minIncome; minimumIn < maxIncome; minimumIn++) {
            double managerSalary = minimumIn * managerPercent;
            double pureIncome = minimumIn - managerSalary - calculateFixedCharges();
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;
            if (minimumIn == pureIncomeAfterTax) {
                System.out.println("минимальное " + pureIncomeAfterTax);
            }
        }

        while (true) {
            //при true выводится сообщение
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): ");
  //обозначается переменная income = которая будет содержать данные от сканера, необходимо ввести значение суммы
            int income = (new Scanner(System.in)).nextInt();
// если не checkIncomeRange(income)  то продолжаем
            if (!checkIncomeRange(income)) {
                continue;
            }

            //формула расчета платы менеджеру = сумма введенная пользователем * процент менеджера, дробное число
            double managerSalary = income * managerPercent;
            //формула расчета чистого остатка = введённая сумма - плата менеджеру - число из блока calculateFixedCharges()
            double pureIncome = income - managerSalary -
                calculateFixedCharges();
            //формула количество налога = процент основного налога * pureIncome, дробное число
            double taxAmount = mainTaxPercent * pureIncome;
            //формула чистой прибыли после уплаты налога = чистая прибыль - налог, дробное число
            double pureIncomeAfterTax = pureIncome - taxAmount;



            // использование оператора для вычисления, можно ли инвестировать, если чистая прибыль после выплаты налогов
            // больше или равно минимальному значению инвестиций, то выводим сообщения: ЗП менеджера, общая сумма налогов
            //сколько компания может инвестировать(да или нет)
            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary);
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0));
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            // если чистый доход меньше 0, то выводится сообщение
            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    //создали метод расчета прибыли
    private static boolean checkIncomeRange(int income) {

        //если прибыль меньше минимальной прибыли, то выводится сообщение, с возвращением ошибки
        if (income < minIncome) {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        // если прибыль больше максимальной прибыли, то выводится сообщение, с возвратом ошибки
        if (income > maxIncome) {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        //при верном  возвращаемся
        return true;
    }

    //создали метод где складываются все платы
    private static int calculateFixedCharges() {
        return officeRentCharge +
            telephonyCharge +
            internetAccessCharge +
            assistantSalary +
            financeManagerSalary;
    }
}
