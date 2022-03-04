/* coder: Deepanshu
pupose: fun program c
date: 29 jan 2022 */
#include<stdio.h>
int main()
{
    int a,b=1;
    printf("Enter the number you want multiplication table of ");
    scanf("%d", &a);

    do
    {
        printf(" %d x %d = %d \n",a,b,a*b);
        b=b+1;
    }
    while(b<=10);
    return 0;
}    