import java.util.*;
public class BubbleSort
{
public static void main(String[] x)
{
Scanner sc=new Scanner(System.in);
int n,max=0;
System.out.println("size of array:-");
n=sc.nextInt();
int arr[]=new int[n];
System.out.println("elements:-");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
if(arr[j]>arr[j+1])
{
arr[j]=arr[j]^arr[j+1];
arr[j+1]=arr[j]^arr[j+1];
arr[j]=arr[j]^arr[j+1];

}
}
}
System.out.println("sorted array:-");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
}
}