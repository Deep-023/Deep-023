#include<stdio.h>
#include<conio.h>

int amicable(int a, int b)
{
    int i,sum1=0,sum2=0,j;
   
    for(i=1;i<a;i++)
     {
         if (a%i==0)
         {
           sum1+=i;
         }
     }
     for(j=1;j<b;j++)
     {
         if (b%j==0)
         {
           sum2+=j;
         }
     }
    if(sum1==b && sum2==a)
    printf("True , %d and %d are amicable",a,b);
    else
    printf("False , %d and %d are not amicable",a,b);
    return 0;
}

int main()
{
    int k,l;
    printf("enter the first number : ");
    scanf("%d",&k);
    printf("enter the second number: ");
    scanf("%d",&l);

    amicable(k,l);
    
    return 0;

}