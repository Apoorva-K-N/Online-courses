Python program to find digital root of a number.
 
Description:
A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.
digit_root(0)= 0


Answer:
num = input("Enter your number: ")
print(num, "\n")

def droot(num):
    if len(num) == 1:
        return num
    else:
        sum = 0
        for i in num:
            sum += int(i)
        num = str(sum)
        return droot(num)
        
print("The digital root of ", num, " is: ", droot(num))


Output:
Enter your number: 16
16 

The digital root of  16  is:  7