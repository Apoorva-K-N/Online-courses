Python program to combine the strings.

Description:
Take two strings, return a string of the form short+long+short, with the shorter string on the outsides and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).

program:

str1=input('Enter first string:')
str2=input('Enter second string:')
a=len(str1)
b=len(str2)
if(a<b):
    print(str1+str2+str1)
else:
    print(str2+str1+str2)

Output:
Enter first string:hello
Enter second string:hi
hihellohi