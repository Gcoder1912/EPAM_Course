package EPAM.Dmitriy;
import java.util.Scanner;


public class Random_Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number of numbers: ");

        int number_of_numbers = scanner.nextInt();
        System.out.print("Integer between 0 and 1000:\n");
        /*пишем print() или println в зависимости от того,
         нужен нам перевод каретки или нет. И соответственно выносим или заносим функцию из цикла
         */
        while(number_of_numbers > 0){
            System.out.print((Math.random()) * 1000 + ",\t");
            number_of_numbers--;
        /*
        вывод рандомных чисел с плавающей точкой.
        Можно сделать без остатка, но я хочу спать
        */
        }

    }
}
