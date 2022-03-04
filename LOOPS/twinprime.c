/* coder: Deepanshu
pupose: lab program c
date: 28 jan 2022 */
#include<stdio.h>
#include<conio.h>

void main()
{
    int a,b,i,j,temp_a,temp_b,temp;
    printf("Enter the two numbers between which twin prime numbers to be find");
    scanf("%d %d",&a,&b);
    temp_a=a;
    temp_b=(temp_a +2);
    while(temp_b <= b)
    {  
      i=0;
      j=0;
     for(temp=1 ;temp<=temp_a ; temp++)
       {
         if(temp_a%temp == 0)
         i++;
       }
     for(temp=1; temp<=temp_b; temp++ )
       {
         if(temp_b%temp == 0)
         j++;
       }
      if(i==2 && j==2)
      {
      printf("%d and %d\n",temp_a,temp_b);
      }
      temp_a++;
      temp_b=temp_a + 2;
    }

}