list1=[64, 34, 25, 12, 22, 11, 90]
temp = 0
for k in range(len(list1)):
    for j in range(k+1, len(list1)):
        if list1[k] > list1[j]:
            temp = list1[k]
            list1[k] = list1[j]
            list1[j] = temp
print("Sorted list is:", list1)