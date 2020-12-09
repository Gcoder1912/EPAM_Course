package EPAM.Dmitriy;


public class Argument_Sum
{
    public static void main(String[] args)
    {
        int sum = 0;
        int i = 0;
        while(i < args.length){
            sum += Integer.parseInt(args[i]);
            i++;
        }
        System.out.println(sum);
    }
}
