#Python Program to print the pattern Input:

def  contalpha(n):     
    num = 65
    for i in range(0, n): 
      
        for j in range(0, i+1): 
          
            ch = chr(num) 
            
            print(ch, end=" ") 
          
            num = num +1
        
        print("\r") 

n=int(input("enter the n value"))
contalpha(n)

output:
enter the n value5
A 

B C 

D E F 

G H I J 

K L M N O 