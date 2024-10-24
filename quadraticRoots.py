import math

def find_roots(a, b, c):
    # Calculate the discriminant
    discriminant = b**2 - 4*a*c
    
    # Check the nature of the roots
    if discriminant > 0:
        # Two distinct real roots
        root1 = (-b + math.sqrt(discriminant)) / (2*a)
        root2 = (-b - math.sqrt(discriminant)) / (2*a)
        return f"Two distinct real roots: {round(root1, 2)} and {round(root2, 2)}"
    elif discriminant == 0:
        # One real root (repeated root)
        root = -b / (2*a)
        return f"One repeated real root: {round(root, 2)}"
    else:
        # Complex roots
        real_part = -b / (2*a)
        imaginary_part = math.sqrt(-discriminant) / (2*a)
        return f"Two complex roots: {round(real_part, 2)} + {round(imaginary_part, 2)}i and {round(real_part, 2)} - {round(imaginary_part, 2)}i"

# Example usage:
a = 1
b = -7
c = 10
print(find_roots(a, b, c))  # Output: Two distinct real roots: 5.0 and 2.0
