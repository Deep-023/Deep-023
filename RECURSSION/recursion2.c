#include<stdio.h>
int fibonacci(int a);

int main()
{
    int fibonacci(int a);
    int b,k;
    printf("Enter the number: ");
    scanf("%d",&b);
    for(k=0;k<=b-1;k++)
   {
       if(k<b-1)
        printf("%d,",fibonacci(k));
       if(k==b-1)
        printf("%d",fibonacci(k));
   }
    return 0;
}

int fibonacci(int a)
{
    int i;
    if(a==0)
   {   
    return 0;
   }
   if(a==1)
   return 1;

   else
   return (fibonacci(a-1)+fibonacci(a-2));
}



