
## str_format


```python
age = 20
name = 'swaroop'

print('{0} was {1} years old when he wrote this book'.format(name, age))
print('Why is {0} playing with that python?'.format(name))
```

    swaroop was 20 years old when he wrote this book
    Why is swaroop playing with that python?
    


```python
print('{0:.3f}'.format(1.0/3))
# 使用 ^  定义'___hello___' 字符串长度为11
print('{0:_^11}'.format('hello'))
print('{name} wrote {book}'.format(name='Swaroop', book='a byte of pthon'))
```

    0.333
    ___hello___
    Swaroop wrote a byte of pthon
    


```python
print('a', end='')
print('b', end='')
```

    ab


```python
# 或者指定空格结尾
print('a', end=' ')
print('b', end=' ')
print('c')
```

    a b c
    

## var


```python
i = 5
print(i)
i = i + 1
print(i)

s = '''This is a multi-line string.
This is the second line.'''
print(s)
```

    5
    6
    This is a multi-line string.
    This is the second line.
    


```python
i = 5
 print('Value is', i)
print('I repeat, but value is', i)
```


      File "<ipython-input-1-028dc397dcce>", line 2
        print('Value is', i)
        ^
    IndentationError: unexpected indent
    


## expression


```python
length = 5
breath = 2

area = length * breath
print('Area is', area)
print('Perimeter is', 2 * (length + breath))
```

    Area is 10
    Perimeter is 14
    

## if


```python
number = 23
guess = int(input('Enter an integer:'))

if guess == number:
    print('Congratulations, you guessed it.')
    print('(but you do not win any prizes!)')
elif guess < number:
    print('No, it is a little highter than that')
else:
    print('No, it is a little lower than that')
    
print('Done')
```

    Enter an integer:50
    No, it is a little lower than that
    Done
    


```python
if True:
    print('Yes, it is true')
```

    Yes, it is true
    

## while


```python
number = 23
running = True

while running:
    guess = int(input('Enter an integer:'))
    
    if guess == number:
        print('Congratulations, you guessed it.')
        running = False
    elif guess < number:
        print('No, it is a little highter than that.')
    else:
        print('No, it is a little lower than that.')
else:
    print('The while loop is over.')
    
print('Done')
```

    Enter an integer:56
    No, it is a little lower than that.
    Enter an integer:14
    No, it is a little highter than that.
    Enter an integer:23
    Congratulations, you guessed it.
    The while loop is over.
    Done
    

## for


```python
for i in range(1, 5):
    print(i)
else:
    print('The for loop is over')
```

    1
    2
    3
    4
    The for loop is over
    

## break


```python
while True:
    s = input('Enter something:')
    if s == 'quit':
        break
    print('Length of the string is', len(s))
print('Done')
```

    Enter something:5456
    Length of the string is 4
    Enter something:quit
    Done
    

## continue


```python
while True:
    s = input('Enter something:')
    if s == 'quit':
        break
    if len(s) < 3:
        print('Too small')
        continue
    print('Input is of sufficient length')
```

    Enter something:5
    Too small
    Enter something:4
    Too small
    Enter something:123
    Input is of sufficient length
    Enter something:465
    Input is of sufficient length
    Enter something:2
    Too small
    Enter something:quit
    

## functon1


```python
def say_hello():
    print('hello world')
    
say_hello()
say_hello()
```

    hello world
    hello world
    

## function_param


```python
def print_max(a, b):
    if a > b:
        print(a, 'is maximum')
    elif a == b:
        print(a, 'is equal to', b)
    else:
        print(b, 'is maximum')

print_max(3,4)

x = 5
y = 7

print_max(x, y)
```

    4 is maximum
    7 is maximum
    

## function_local


```python
x = 50

def func(x):
    print('x is', x)
    x = 2
    print('Changed local x to', x)
    
func(x)
print('x is still', x)
```

    x is 50
    Changed local x to 2
    x is still 50
    

## function_global


```python
x = 50

def func():
    global x
    
    print('x is', x)
    x = 2
    print('Changed local x to', x)
    
func()
print('x is still', x)
```

    x is 50
    Changed local x to 2
    x is still 2
    

## function_default


```python
def say(message, times = 1):
    print(message * times)
    
say('hello')
say('world', 5)
```

    hello
    worldworldworldworldworld
    

## function_keyword


```python
def func(a, b = 5, c = 10):
    print('a is', a, 'and b is',b,  'and c is', c)
    
func(3, 1)
func(25, c = 24)
func(c = 50, a = 100)
```

    a is 3 and b is 1 and c is 10
    a is 25 and b is 5 and c is 24
    a is 100 and b is 5 and c is 50
    

## function_varargs


```python
# * 为 tuple， ** 为 dictionary
def total(a = 5, *numbers, **phonebook):
    print('a', a)
    
    for single_item in numbers:
        print('single_item', single_item)
        
    for first_part, second_part in phonebook.items():
        print(first_part, second_part)
    
print(total(10, 1, 2, 3, Jack=1123, John=2231, Inge=1560))
```

    a 10
    single_item 1
    single_item 2
    single_item 3
    Jack 1123
    John 2231
    Inge 1560
    None
    

## function_return


```python
def maximum(x, y):
    if x > y:
        return x
    elif x == y:
        return 'The numbers are equals'
    else:
        return y

print(maximum(2,3))
```

    3
    

## function_docstring


```python
def print_max(x, y):
    '''Prints the maximum of two numbers.打印两个数值中的最大数。
    
    The two values must be integers.这两个数都应该是整数'''
    x = int(x)
    y = int(y)
    
    if(x > y):
        print(x, 'is maximum')
    else:
        print(y, 'is maximum')
        
print_max(3, 5)
print(print_max.__doc__)
```

    5 is maximum
    Prints the maximum of two numbers.打印两个数值中的最大数。
        
        The two values must be integers.这两个数都应该是整数
    
