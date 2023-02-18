package HW03;

import java.awt.desktop.SystemSleepListener;

public class Task01 {
    public static void main(String[] args) {

        //С некоторого момента прошло 234 дня. Сколько полных недель прошло за этотпериод? А месяцев? Выведите полученные значения в консоль
        int x = 234;
        int week = x / 7;
        int month = x / 30;
        System.out.println("недель = " + week);
        System.out.println("месяцев = " + month);

        //Дано двузначное число 57. Найти:
        // a.число десятков в нем;
        // b.число единиц в нем;
        // c.сумму его цифр;
        // d.произведение его цифр
        int number = 57;
        int integer = number / 10;
        int remainder = number % 10;
        int sum = 5 + 7;
        int composition = 5 * 7;
        System.out.println("число десятков в числе 57 = " + integer);
        System.out.println("число единиц в числе 57 = " + remainder);
        System.out.println("сумма  цифрв в числе 57 = " + sum);
        System.out.println("произведение цифр в числе 57 = " + composition);

        //Найдите возраст человека, если известно, что год его рождения 1991. Выведитеполученный результат в виде “Возраст = ...”
        int age = 1991;
        System.out.println("Возраст = " + (2023 - age));

    }
}


