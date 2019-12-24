import java.util.*;
class Sum
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int n,sum=0,i;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
float avg=sum/n;
System.out.println("sum is:"+ sum);
System.out.println("Avg is:"+ avg);
}
}