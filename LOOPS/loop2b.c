#include<stdio.h>
#include<conio.h>

void main()
{
    int a, b, d=1, lcm, hcf;
     printf("Enter the numbers: ");
     scanf("%d %d",&a,&b);

      lcm = ( a>b )? a : b;

      for( ; d ; ++lcm)
      {
           if( lcm%a==0 && lcm%b==0)
          {
              printf( "LCM of %d and %d is %d \n", a,b,lcm );
              d= 0;
          }
      }

      hcf= a*b/(lcm-1);
      printf("HCF of %d and %d is %d", a,b,hcf);
}

