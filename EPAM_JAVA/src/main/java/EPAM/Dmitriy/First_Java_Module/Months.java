package EPAM.Dmitriy.First_Java_Module;

import java.util.HashMap;
import java.util.Scanner;


public class Months {
    public static void main(String[] args)
    {
        HashMap<Integer, String> months = new HashMap<>(); //Обьявляем словарь
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");                //помещаем в словарь "Ключ/Значение
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        Scanner month_scanner = new Scanner(System.in); //Сканируем число месяца

        System.out.println("Please, enter month's number: ");

        int key = month_scanner.nextInt(); //Обьявляем переменную, значение которой будет служить ключом

        if(key < 13 && key > 0) { //условие на валидность введенного номера месяца
            System.out.println(months.get(key)); //В случае если условие пройдено, вывести месяц соответствующий ключу
        } else
        {
            System.out.println("Please, enter a correct month's number"); //В противном случае вывести сообщение
        }

    }
}
