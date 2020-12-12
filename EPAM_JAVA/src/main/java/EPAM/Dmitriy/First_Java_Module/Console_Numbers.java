package EPAM.Dmitriy.First_Java_Module;


import java.util.Scanner;

public class Console_Numbers {
    public static void main(String[] args) {
        int n = 5;
        int[] numbers;
        numbers = new int[n]; //массив куда мы будем записывать числа

        Scanner number_scanner = new Scanner(System.in); //обьявление сканнера
        System.out.println("Please, enter " + n + " " + " numbers");//сообщение

        for (int i = 0; i < n; i++) //цикл, в котором каждому элементу массива numbers присваивается очередной ввод
        {
            numbers[i] = number_scanner.nextInt();
            System.out.println(numbers[i]);
        }

        boolean isSorted = false; //обьявление флага, который говорит о состоянии массива
        int buf;
        while (!isSorted) { //пока флаг не равен True, выполнять сортировку. Я не мог догнать,что именно его надо сюда влепить часов 6
            isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    isSorted = false;

                    buf = numbers[i];
                    numbers[i] = numbers[i + 1]; //Свап значений при необходиости
                    numbers[i + 1] = buf;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);

        }
         /* Так как у нас уже есть цикл сортирующий числа в порядке возрастания, масимальная длина
         будет у последнего элемента, а минимальная у первого.
         Конечно есть ситуации, когда есть несколько одинаковых по длине чисел, но это уже другая задача */
        int max = numbers[n-1];
        int min = numbers[0];
        System.out.println("Max length in this numbers is: " + max + " with length " + Integer.toString(max).length());
        System.out.println("Min length in this numbers is: " + min + " with length " + Integer.toString(min).length());
    }
}
