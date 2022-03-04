#include<stdio.h>
#include<conio.h>

int properdivisors(int a)
{
    int d=1,n=0,i,sum=0,j;
    for(i=1;i<a;i++)
    {
        if(a%i==0)
        {
            j=i;
        }
    }
    for(i=1;i<a;i++)
     {
         if (a%i==0)
         {
           printf("%d",i);
           sum+=i;
             
             if(i<j)
             {
            printf("+");
             }
         }
         
     }
    printf("= %d",sum);
    return 0;
}

int main()
{
    int num;
    printf("enter the number : ");
    scanf("%d",&num);
    printf("num=%d\n",num);
    printf("sum = ");

    properdivisors(num);
    
    return 0;

}