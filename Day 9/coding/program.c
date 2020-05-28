Write a C Program to sort an array of integers in ascending order and display the sorted array and Number of passes performed for sorting.

Answer:
#include <stdio.h>
#define MAXSIZE 10
 void main()
{
    int array[MAXSIZE];
    int i, j, num, temp;
    printf("Enter the value of num \n");
    scanf("%d", &num);
    printf("Enter the elements one by one \n");
    for (i = 0; i < num; i++)
    {
        scanf("%d", &array[i]);
    }
    printf("Input array is \n");
    for (i = 0; i < num; i++)
    {
        printf("%d\n", array[i]);
    }
     for (i = 0; i < num; i++)
    {
        for (j = 0; j < (num - i - 1); j++)
        {
            if (array[j] > array[j + 1])
            {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
    printf("Sorted array is...\n");
    for (i = 0; i < num; i++)
    {
        printf("%d\n", array[i]);
    }
}

Output:
Enter the value of num                                                                                                                                                         
4                                                                                                                                                                              
Enter the elements one by one                                                                                                                                                  
45                                                                                                                                                                             
36                                                                                                                                                                             
3                                                                                                                                                                              
6                                                                                                                                                                              
Input array is                                                                                                                                                                 
45                                                                                                                                                                             
36                                                                                                                                                                             
3                                                                                                                                                                              
6                                                                                                                                                                              
Sorted array is...                                                                                                                                                             
3                                                                                                                                                                              
6                                                                                                                                                                              
36                                                                                                                                                                             
45                   