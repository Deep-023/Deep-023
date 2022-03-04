#include<stdio.h>
#include<math.h>
int main()
{
    int row,column;
    printf("\nEnter the number of rows for matrix 1 :  "); //for 1st matrix input
    scanf("%d",&row);
    printf("Enter the number of columns for matrix 1 :  ");
    scanf("%d",&column);
    printf("you entered a %dX%d array matrix (1) ",row,column);
    int arr[row][column];
    printf("\n\nEnter the elemnts in matrix 1:  ");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<column; j++)
        scanf("%d",&arr[i][j]);
    }
    printf("\n");
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<column; j++)
         printf("%d  ",arr[i][j]);
        printf("\n");
    }
     int row2,column2;
    printf("Enter the number of rows for matrix 2 :  ");  //for 2nd matrix input
    scanf("%d",&row2);
    printf("Enter the number of columns for matrix 2 :  ");
    scanf("%d",&column2);
    printf("you entered a %dX%d array matrix (1) ",row2,column2);
    int amy[row2][column2];
    printf("\n\nEnter the elemnts in matrix 2:  ");
    for(int i=0; i<row2; i++)
    {
        for(int j=0; j<column2; j++)
        scanf("%d",&amy[i][j]);
    }
    printf("\n");
    for(int i=0; i<row2; i++)
    {
        for(int j=0; j<column2; j++)
        printf("%d  ",amy[i][j]);
        printf("\n");
    }
    int add[row][column], sub[row][column], mul[row][column]; // initialisation 
    if(row==row2 && column==column2)
    {
             for(int i=0; i<row; i++) // for addition
         {
             for(int j=0; j<column; j++)
             add[i][j]= arr[i][j]+amy[i][j];   
         }
         printf("\n");
         printf("Addition of matrix 1 & matrix 2 =\n");
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             printf("%d  ",add[i][j]); // print addition of matrix
             printf("\n");
         }
    }
    else
    printf("\nMatrix doesn't satisfy condition for matrix addition\n" );

    if(row==row2 && column==column2)
    {
         for(int i=0; i<row; i++)    //for subtraction
         {
             for(int j=0; j<column; j++)
             sub[i][j]= arr[i][j]-amy[i][j];   
         }
         printf("\n");
         printf("Subtraction of matrix 1 & matrix 2 =\n");
         for(int i=0; i<row; i++)
         {
             for(int j=0; j<column; j++)
             printf("%d  ",sub[i][j]);  // print subtraction of matrix
             printf("\n");
         }
    }
    else    
    printf("\nMatrix doesn't satisfy condition for matrix subtraction\n" );
    
    int a,b,c;
    if( (row==row2 && column==column2) || (column==row2) )
    {
        if(row>row2) 
        a=row2,b=row;
        else
        b=row2,a=row;
        
        for(int i=0; i<row; i++) // for multiplication
        {
            for(int j=0; j<column2; j++)
            {
                int p ;
                 mul[i][j]=0;
                for(int q=i,w=0; w<b ; w++)
               {
                p = (arr[q][w]*amy[w][j]); 
                mul[i][j]+=p;
               }
            }      
        }
        printf("\n");
        printf("MULTIPLICATION of matrix 1 & matrix 2 =\n"); // print multiplication of matrix
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column2; j++)
            printf("%d  ",mul[i][j]);
            printf("\n");
        }
    }
    else    
    printf("Matrix doesn't satisfy condition for matrix multiplication" );

    int trans[column][row];   // for transpose of matrix 1 
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<column; j++)
        trans[j][i] = arr[i][j];
    }
    printf("\n"); 
    printf("Transpose of matrix 1 is :\n");  // print transpose of matrix 1
    for(int i=0; i<column; i++)
    {
        for(int j=0; j<row; j++)
        printf("%d  ",trans[i][j]);
        printf("\n");
    }    

     int trans2[column2][row2];   // for transpose of matrix 2
    for(int i=0; i<row2; i++)
    {
        for(int j=0; j<column2; j++)
        trans2[j][i] = amy[i][j];
    }
    printf("\n"); 
    printf("Transpose of matrix 2 is :\n");  // print transpose of matrix 2
    for(int i=0; i<column2; i++)
    {
        for(int j=0; j<row2; j++)
        printf("%d  ",trans2[i][j]);
        printf("\n");
    }    
    
    float norm=0;          // for norm of matrix 1
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<column; j++)
        norm+= arr[i][j]*arr[i][j];
    }
    norm= sqrt(norm);
    printf("\n Forbenius Norm of matrix 1 is %f ",norm);

    float norm2=0;          // for norm of matrix 2
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<column; j++)
        norm2+= amy[i][j]*amy[i][j];
    }
    norm2= sqrt(norm2);
    printf("\n Frobenius Norm of matrix 2 is %f ",norm2);

return 0;
}