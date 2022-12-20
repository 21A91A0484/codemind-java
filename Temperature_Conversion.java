import java.util.*;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double c,f;
        c=sc.nextDouble();
        f=32+(c*9/5);
        System.out.format("%.2f",f);
    }
}