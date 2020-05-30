Python program to read a number and print the pattern.

Answer:

rows = int(input("enter number of rows "))
for i in range(0, rows + 1):
    for j in range(rows - i, 0, -1):
        print('*', end=' ')
    print()


Output:
enter number of rows 6
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 