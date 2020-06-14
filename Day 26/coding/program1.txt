#Python Program to Remove the Characters of Odd Index Values in a String

def odd(str):
  result = "" 
  for i in range(len(str)):
    if i % 2 == 0:
      result = result + str[i]
  return result
s=str(input("enter the string"))
print(odd(s))

output:
enter the stringpython
pto