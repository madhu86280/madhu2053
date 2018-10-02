import java.util.*;
public class Max
{
public static void main(String[] x)
{
Scanner sc=new Scanner(System.in);
int n,max=0;
System.out.println("size:-");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("elements:-");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("max value in array:-" + max);
}
}