#include<stdio.h>
int interchange( int arr[][3],int a , int b )
{
    int temp , cont;
        temp=arr[b][2];
        arr[b][2]=arr[a][2];
        arr[a][2]=temp;

        cont=arr[b][0];
        arr[b][0]=arr[a][0];
        arr[a][0]=cont;
}

int main()
{
    int cy,n;
    printf("\nEnter current year: ");
    scanf("%d",&cy);

    printf("\nEnter number of employes: ");
    scanf("%d",&n);
    printf("\n");
    int arr[n][3];
   
   for(int i=0; i<n ;i++)
   {
       printf("Enter employee ID: ");
       scanf("%d",&arr[i][0]);
       printf("Enter employee age: ");
       scanf("%d",&arr[i][1]);
       printf("\n");
   }

 for(int i=0; i<n ;i++)  
 {
    arr[i][2] = cy + (65 - arr[i][1]);
 }

  printf("\n%d is current year\n",cy);
  printf("N employees // N = %d\n\n",n);
  printf("Employee id\t age\n");
  
  for(int i=0; i<n ;i++)
  printf(" %d    \t%d is current age     65 is retirement age     %d retirement year\n",arr[i][0],arr[i][1],arr[i][2]);  
  printf("\n");

      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(arr[j][2]>arr[i][2])
            {
                interchange(arr,i,j);
            }
          }  
      }
    int temp=0,k=0;  
    for(temp;temp<n;)   
    {
       printf("Employees retiring year %d\n",arr[temp][2]);
       printf("ID of employees:- ");
       printf("%d   ",arr[temp][0]);
       temp++;
       
       while(arr[k][2]==arr[k+1][2])
       {
           printf("%d   ",arr[k+1][0]);
           temp++;
           k++;
       }
       k=temp;
       printf("\n\n");
    } 
    printf("\n");
    return 0;  
}