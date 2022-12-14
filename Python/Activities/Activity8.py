myList = list(input("Enter numbers separated by , : ").split(", "))
size = len(myList)
lastNum = int(myList[size-1])
if(int(myList[0])==lastNum):
    print("True")
else:
    print("False")