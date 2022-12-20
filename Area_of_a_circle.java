import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double area,pi=3.14;
        r=sc.nextInt();
        area=pi*r*r;
        System.out.printf("%.2f",area);
        
    }
}