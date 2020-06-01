#Python Program to remove duplicate elements from a list


lst = []  
n = int(input("Enter number of elements : "))  
for i in range(0, n): 
    ele = int(input()) 
    lst.append(ele)
lst1=[]
for i in lst:
    if i not in lst1:
        lst1.append(i)
print(lst1)



output:
Enter number of elements : 5
1
2
1
4
3
[1, 2, 4, 3]
