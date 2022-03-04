#include<stdio.h> 
#include<conio.h> 
void main() 
{ 
   int k,n=0,r,sqr,sum1=0,sum2=0,c,temp,a,sum;  
    printf("Enter number: "); 
    scanf("%d",&k); 
    a=1;
  
     temp = k; 
     sqr = k*k; 
     
   do
    {
      ++n; 
     temp=temp/ 10; 
    } 
   while(temp>0); 
 
    for(c = 0; c < n; c++)
     { 
        r = sqr % 10; 
        sqr = sqr/10; 
        sum1 = sum1 + r*a; 
        a*=10; 
     } 
    a=1;
 
    while(sqr>0)
    { 
       r = sqr %10; 
       sqr = sqr/10; 
       sum2 = sum2 +r*a; 
       a*=10;
    } 
 sum = sum1 + sum2; 
 if(sum == k){ 
 printf("Kaprekar Number"); 
 } 
 else{ 
 printf("Not a Kaprekar Number"); 
 } 
}