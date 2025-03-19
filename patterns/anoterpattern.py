"""
     A
    A A
   A B A
  A C C A
 A D D D A
A E E E E A

"""

n = 6

for i in range(n):
    # Print spaces for left padding
    print(" " * (n - i - 1), end=" ")

    # Print 'A' at the start of the row
    print("A", end=" ")

    # Print the increasing characters in the middle
    if i > 0:
        for j in range(i - 1):
            print(chr(65 + j + 1), end=" ")  # Print B, C, D, etc.

        # Print the same character as the last one
        print(chr(65 + i - 1), end=" ")  # Repeat the last character

    # Print 'A' at the end of the row if it's not the first row
    if i > 0:
        print("A", end=" ")

    print()  # Move to the next line
