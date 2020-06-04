1.Python Program to Find the Largest Number in a List without using sorting algorithm.

program:
list1 = [] 
num = int(input("Enter number of elements in list: ")) 
for i in range(1, num + 1): 
    ele = int(input("Enter elements: ")) 
    list1.append(ele) 
print("Largest element is:", max(list1)) 

Output:
Enter number of elements in list: 3
Enter elements: 89
Enter elements: 45
Enter elements: 36
Largest element is: 89
