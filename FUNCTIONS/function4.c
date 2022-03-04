#include<stdio.h>

int factorial(int a)
{
    int i,j,sum=0,temp=1,fact;
    for(i=1;i<=a;i++)
    {
        for(j=1;j<=i;j++)
        {
            temp=temp*j;
          
        }
    fact=temp/i;
    temp=1;
    sum+=fact;
    }
    return sum;
}

int main()
{
    int d;
    printf("Enter the number: ");
    scanf("%d",&d);
    printf("The sum is %d",factorial(d));
    return 0;
}



