import java.util.*;
public class saddlematrix
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the size of matix:");
int n=in.nextInt();
int a[][]=new int[n][n];
System.out.println("Enter the matrix:");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=in.nextInt();
}
}
int min=0,index=0,max=0;
for(int i=0;i<n;i++)
{
    min=a[i][0];
for(int j=0;j<n;j++)
{
if(a[i][j]<min)
{
min=a[i][j];
index=j;
}
}
max=a[0][index];
for(int k=0;k<n;k++)
{
if(a[k][index]>max)
{
max=a[k][index];
}
}
}
if(min==max)
System.out.println("Saddle point:"+max);
else 
System.out.println("No saddle point is found");
}
}