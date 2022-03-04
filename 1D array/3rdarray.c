#include<stdio.h>

int main()
{
    int no;
    printf("Enter no. values for array : ");
    scanf("%d",&no);
    int arr[no],amy[no],num,j=1,temp,count=1;
    printf("Enter no. in arrays : ");
      for(int i=0;i<no;i++)
       scanf("%d",&arr[i]);
      amy[0]=arr[0];
    
        for(int i=0;i<no;i++,j++)
        { 
            for(int k=0;k<i;k++)
            {
                if(arr[i]!=amy[k])
                temp=1;
                else
                {
                    temp=0;
                    break;
                }
            } 
         if(temp==1)
         {
          amy[count]=arr[i];
          count++;
         }

        }    
    
    printf("Following are the unique numbers in the array :  ");
     for(int l =0 ; l<count ; l++)
     printf("%d  ",amy[l]);
    return 0;
}

    