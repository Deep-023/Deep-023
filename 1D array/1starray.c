#include<stdio.h>
#include<math.h>

int interchange( int*arr,int a , int b )
{
    int temp;
        temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
}

int main()
{
    int arr[5];
    printf("Enter the 5 numbers: ");
      for(int i=0;i<5;i++)
       scanf("%d",&arr[i]);
      for(int i=0;i<5;i++)
      {
          for(int j=0;j<5;j++)
          {
            if(arr[j]>arr[i])
            {
                interchange(arr,i,j);
            }
          }  
      }
    printf(" %d  %d  %d  %d  %d",arr[0],arr[1],arr[2],arr[3],arr[4]);
    return 0;
}