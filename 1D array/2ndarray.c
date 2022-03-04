#include<stdio.h>
#include<math.h>

int interchange( int arr[],int a , int b )
{
    int temp;
        temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
}

int main()
{
    int n;
    printf("Enter Array size : ");
       scanf("%d",&n);

    int arr[n],amy[n],num, binarymiddle;
    printf("Enter the array elements: ");
      for(int i=0;i<n;i++)
     { 
         scanf("%d",&arr[i]);
     }    
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(arr[j]>arr[i])
            {
                interchange(arr,i,j);
            }
          }  
      }
    printf("\n");
    for(int h=0; h<n ; h++)
    printf("%d  ",arr[h]);
  
    printf("\n\nEnter the value to be searched: ");
    scanf("%d",&num);

    int min , max , p , q;
    min= 0;
    max= n-1;
    binarymiddle = arr[min+((max-min)/2)];
    for( int  i=min ; i<=max ; )
    {
      if(num== binarymiddle)
       {
         printf(" The number has %d index number", (min+((max-min)/2)));
         break;
       }
      else if(num <= binarymiddle)
      {
        max= min+((max-min)/2)-1; 
      }
      else if(num >= binarymiddle)
      {
        min = min+((max-min)/2)+1; 
      }
       binarymiddle = arr[min+((max-min)/2)];
    }
    return 0;
}
      
