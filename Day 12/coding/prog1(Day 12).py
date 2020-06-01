1.Python Program for Sum of squares of first n natural numbers

def squaresum(n): 
    return (n * (n + 1) / 2) * (2 * n + 1) / 3
  
n=int(input("Enter number"))
print("Sum of squares n  numbers : ",squaresum(n));

output:
Enter number5
Sum of squares n  numbers :  55.0