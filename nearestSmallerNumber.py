def nearest(a):
    if not a:
        return []

    stack = []
    result = []

    for i in range(len(a)):
        print(f"Iteration {i}, current element: {a[i]}")
        print(f"Current stack: {stack}")

        # pop elements from the stack until the top element is smaller than a[i]
        while stack and stack[-1] > a[i]:
            print(f"Popping {stack[-1]} from stack")
            stack.pop()

        # if the stack is empty, there is no smaller element to the left of a[i]
        if not stack:
            result.append(-1)
            print("No smaller element found, appending -1")
        else:
            result.append(stack[-1])
            print(f"Nearest smaller element found: {stack[-1]}")

        stack.append(a[i])
        print(f"Appending {a[i]} to stack")
        print(f"Updated stack: {stack}")
        print(f"Current result: {result}\n")

    return result


a = [1, 6, 4, 10, 2, 5]
print(nearest(a))  # Output: [-1, 1, 1, 4, 1, 2]
