def find_differences(x, y):
    """Count the number of differing positions between two strings."""
    c = 0
    for i in range(len(x)):
        if x[i] != y[i]:
            c += 1
    return c


def check_length(x, y):
    """Check if the lengths of two strings are equal."""
    return len(x) == len(y)


def check_characters(x, y):
    """Check if all characters in y are present in x."""
    h1 = {}
    for char in x:
        h1[char] = 0

    for char in y:
        if char not in h1:
            return False
    return True


def main():
    a = 5
    x = "hello"
    y = "hollo"

    if not check_length(x, y):
        print(-1)
        return

    if not check_characters(x, y):
        print(-1)
        return

    difference_count = find_differences(x, y)
    print(difference_count)


if __name__ == "__main__":
    main()
