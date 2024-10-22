def pushZeros(a):
    n = len(a)
    count = 0

    # Move non-zero elements to the front
    for i in range(n):
        if a[i] != 0:
            a[count] = a[i]
            count += 1

    # Fill the rest of the array with zeros
    while count < n:
        a[count] = 0
        count += 1

    return a


def anotherWay(l):
    # n = len(l)
    c = 0

    # Move non-zero elements to the front
    for i in range(len(l)):
        if l[i] != 0:
            l[c] = l[i]
            c += 1

    # Fill the rest of the list with zeros
    for i in range(c, len(l)):
        l[i] = 0

    return l


# Test for pushZeros
a = [0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9]
pushZeros(a)
print("Result from pushZeros:", end=" ")
for i in a:
    print(i, end=" ")  # Output: 1 9 8 4 2 7 6 9 0 0 0 0 0
print()  # Newline for better output formatting

# Test for anotherWay
l1 = [0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9]
anotherWay(l1)
print("Result from anotherWay:", end=" ")
for i in l1:
    print(i, end=" ")  # Output: 1 9 8 4 2 7 6 9 0 0 0 0 0
print()  # Newline for better output formatting
