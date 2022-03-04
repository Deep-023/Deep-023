#include<stdio.h>
int factorial(int a);

int main()
{
    int factorial(int a);
    int b;
    printf("Enter the number: ");
    scanf("%d",&b);
    printf(" The value of %d! is %d",b,factorial(b));
    return 0;
}

int factorial(int a)
{
    if(a>1)
    return (a*(factorial(a-1)));
    else
    return 1;
}