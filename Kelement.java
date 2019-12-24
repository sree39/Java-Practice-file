import java.util.*;
class Kelement
{
public static void main(String[] args)throws Exception
{
Scanner sc=new Scanner(System.in);
int i,c=0;
int a[]={1,4,34,56,7};
int k;
System.out.println("enter search element:");
k=sc.nextInt();
for(i=0;i<a.length;i++)
{
if(a[i]==k){
System.out.println("The element present at:"+ (i+1));
c=c+1;
}
}
if(c==0)
System.out.println("-1");
}
}