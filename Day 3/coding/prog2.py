Write Python Program to Reverse a Given Number This is a Python Program to reverse a given number. Problem Description The program takes a number and reverses it and store it in another variable and show it

Program:

a=int(input("enter Digit :"))
rev=0
while(a > 0):
    rem=a%10
    rev=rev*10+rem
    a=a//10
print("Reversed number: ",rev)
