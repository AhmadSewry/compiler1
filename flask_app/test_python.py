a = 3
b = 7
def process(x, y):
    value = x * y
    print(value)
    if value >= 20:
        t = value + 5
        print(t)
    else:
        s = value - 2
        print(s)
    for n in numbers:
        r = n * value
        print(r)
    while value < 40:
        value = value + 4
