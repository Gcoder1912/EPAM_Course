package EPAM.Dmitriy; //первая строчка программы
//вторая строчка программы(она пустая)
import java.util.Random;//третья строка
import java.util.Scanner;//четвертая строка перед пятой идущая, за третьей следующая

public class Two_Dimensional_Arrays {
    public static void main(String[] args){

        int[][] dim_array;

        Scanner new_scanner = new Scanner(System.in);
        System.out.println("Please, enter number of a value range: ");
        int number_for_range = new_scanner.nextInt();

        System.out.println("Pleas, enter number of an array value: ");
        int n = new_scanner.nextInt();
        dim_array = new int[n][n]; //обьявляем двумерный массив с заданным размером матрицы
        Random rnd = new Random();
        for (int i=0; i<dim_array.length;i++) {
            for (int j=0; j<dim_array[i].length;j++) {
                dim_array[i][j] = (rnd.nextInt((number_for_range*2+2))) - (number_for_range+1);
            }
        }

        for(int i = n-1; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( dim_array[0][j] > dim_array[0][j+1] ){
                int tmp = dim_array[0][j];
                dim_array[0][j] = dim_array[0][j+1];
                dim_array[0][j+1] = tmp;
            }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(dim_array[0][i]);
        }
    }

//между следующей строкой и предыдущим комментарием, находятся другие строки кода. Некоторые из них даже работают
}//последняя строчка программы