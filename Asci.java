import java.util.*;
import java.util.Scanner;
class Asci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
 for(i=1;i<=n;i++){
            char str = (char)a[i];
            System.out.println(str);
}
}
}