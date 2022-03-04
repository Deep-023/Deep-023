#include<stdio.h>
int series(int a);

int main()
{
    int b,c,i,n;
    printf("Enter the number:");
    scanf("%d",&b);
    series(b);
return 0;
}

int series(int a)
{
  if(a<=0)
  {
      printf("%d ",a);
      return 0;
  }
  printf("%d ",a);
  series(a-5);
  printf("%d ",a);

}



