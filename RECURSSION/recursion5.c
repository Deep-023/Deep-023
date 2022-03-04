#include<stdio.h>
#include<math.h>
int tiles( int a , int b);

int main()
{
    int c, d;
    printf(" Enter length: ");
    scanf("%d",&c);
    printf(" Enter breadth: ");
    scanf("%d",&d);
    printf("Minimum tiles required = %d\n",tiles(c,d));
    return 0;

}

int tiles(int a , int b )
{  
     if(a==0 || b==0)
    return 0;

     else if(a%2==0 && b%2==0)
    return tiles(a/2 , b/2);
    
    else if(a%2==0 && b%2!=0)
    return (a+(tiles(a/2 , b/2)));
    
    else if(a%2!=0 && b%2==0)
    return (b+(tiles(a/2 , b/2)));

    else 
    return (a+b-1+(tiles(a/2,b/2)));
} 


