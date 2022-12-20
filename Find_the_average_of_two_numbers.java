import java.util.*;
class Average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n,m;
        double avg;
        n=sc.nextInt();
        m=sc.nextInt();
        avg=(n+m)/2;
        System.out.format("%.4f",avg);
        
    }
}