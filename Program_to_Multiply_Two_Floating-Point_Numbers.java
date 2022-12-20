import java.util.Scanner;
class Multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a;
        float b;
        float c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=a*b;
        System.out.printf("%.2f",c);
    }
}