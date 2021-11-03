import core.*;
import core.Camera;

import java.util.Scanner;
//присвоение переменных
public class RoadController {
    private static double passengerCarMaxWeight = 3500.0; // kg   дробная переменная
    private static int passengerCarMaxHeight = 2000; // mm        целочисленная переменная
    private static int controllerMaxHeight = 4000; // mm          целочисленная переменная

    private static int passengerCarPrice = 100; // RUB            целочисленная переменная
    private static int cargoCarPrice = 250; // RUB                целочисленная переменная
    private static int vehicleAdditionalPrice = 200; // RUB       целочисленная переменная

// создаём метод main  и выводим запрос на количество авто
    public static void main(String[] args) {                    //переменная строка для ввода количества авто
        System.out.println("Сколько автомобилей сгенерировать?");
//называем сканер и созаём переменную
        Scanner scanner = new Scanner(System.in);              //переменная сканера
        int carsCount = scanner.nextInt();                     //целочисленная переменная
//делаем условие, задаём переменную и выводим на экран
        for (int i = 0; i < carsCount; i++) {                  //целочисленная переменная
            Car car = Camera.getNextCar();                     // переменная авто
            System.out.println(car);
//если переменная авто - специальная то "открыть путь" и продолжаем дальше
            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {                              //переменная
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
//присваеваем переменные и делаем условие
            int price = calculatePrice(car);                  //целочисленная переменная  и переменная авто
            if (price == -1)                                  // переменная цены
            {
                continue;
            }
            //выводим на экран строку с ценой  если условие выполнено
            System.out.println("Общая сумма к оплате: " + price + " руб.");  // тоже переменная цены
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
//задаём метод рассчёта калькулятора авто, присваиваем переменные и ставим условие
    private static int calculatePrice(Car car) {            //переменная калькулятора  авто
        int carHeight = car.height;                         //целочисленная переменная
        int price = 0;                                      //целочисленная переменная
//если высота авто больше заданной то "блокируем" и выдаём причину в консоль, и делает возврат на 1 шаг.
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!"); //переменная запрета проезда
            return -1;
            // иначе если высота авто больше высоты пассажирского авто , (присваевается переменная)
        } else if (carHeight > passengerCarMaxHeight)      //переменная высоты
        {
            double weight = car.weight;                    //дробная переменная
            //Грузовой автомобиль
            // проверка  если высота больше пассажирского авто
            if (weight > passengerCarMaxWeight)            //переменная высоты
            {
                price = passengerCarPrice;                // переменная  цена
                //и если авто с прицепом  то идёт прибавление надбавки
                if (car.hasVehicle) {                     //переменная авто
                    price = price + vehicleAdditionalPrice; // переменные цен
                }
            }
            //Легковой автомобиль
            //иначе переменная цены равна грузовому тарифу
            else {
                price = cargoCarPrice;                   //переменная цена
            }
        } else {
            price = passengerCarPrice;                   //переменная цена
        }
        //возврат к цене
        return price;                                    //перемнная цена
    }

    /**
     * Открытие шлагбаума
     */
    //дальше идёт метод открытия шлагбаума    при открытии   вывод сообщения в консоль
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    //шлагбаум закрыт    и вывод причины в консоль
    private static void blockWay(String reason)            //переменная причины
    {
        //вывод сообщения
        System.out.println("Проезд невозможен: " + reason); //переменная причина
    }
}