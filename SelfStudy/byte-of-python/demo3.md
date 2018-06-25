
## ds_using_list


```python
shoplist = ['apple', 'mango', 'carrot', 'banana']

print('I have', len(shoplist), 'items to purchase.')

print('These items are:', end=' ')
for item in shoplist:
    print(item, end=' ')
    
print('\nI also have to buy rice.')
shoplist.append('rice')
print('My shopping list is now', shoplist)

print('I will sort my list now')
shoplist.sort()
print('Sorted shopping list is', shoplist)

print('The first item I will buy is', shoplist[0])
olditem = shoplist[0]
del shoplist[0]
print('I bought the', olditem)
print('My shoping list is now ', shoplist)
```

    I have 4 items to purchase.
    These items are: apple mango carrot banana 
    I also have to buy rice.
    My shopping list is now ['apple', 'mango', 'carrot', 'banana', 'rice']
    I will sort my list now
    Sorted shopping list is ['apple', 'banana', 'carrot', 'mango', 'rice']
    The first item I will buy is apple
    I bought the apple
    My shoping list is now  ['banana', 'carrot', 'mango', 'rice']
    

## ds_using_tuple


```python
zoo = ('python', 'elephant', 'penguin')
print('Number of animals in the zoo is', len(zoo))

new_zoo = 'monkey', 'camel', zoo
print('Number of cages in the new zoo is', len(new_zoo))
print('All animals in new zoo are', new_zoo)
print('Animals brought fromo old zoo are', new_zoo[2])
print('Last animal brought from old zoo is', new_zoo[2][2])
print('Number of animals in the new zoo is', len(new_zoo) - 1 + len(new_zoo[2]))
```

    Number of animals in the zoo is 3
    Number of cages in the new zoo is 3
    All animals in new zoo are ('monkey', 'camel', ('python', 'elephant', 'penguin'))
    Animals brought fromo old zoo are ('python', 'elephant', 'penguin')
    Last animal brought from old zoo is penguin
    Number of animals in the new zoo is 5
    

## ds_using_dict


```python
ab = {
    'Swaroop': 'swaroop@swaroopch.com',
    'Larry': 'larry@wall.org',
    'Matsumoto': 'matz@ruby-lang.org',
    'Spammer': 'spammer@hotmail.com'
}

print("Swaroop's address is", ab['Swaroop'])

del ab['Spammer']

print('\nThere are {} contacts in the address-book\n'.format(len(ab)))

for name, address in ab.items():
    print('Contact {} at {}'.format(name,address))
    
ab['Guido'] = 'guido@python.org'

if 'Guido' in ab:
    print("\nGudio's address is", ab['Guido'])
```

    Swaroop's address is swaroop@swaroopch.com
    
    There are 3 contacts in the address-book
    
    Contact Swaroop at swaroop@swaroopch.com
    Contact Larry at larry@wall.org
    Contact Matsumoto at matz@ruby-lang.org
    
    Gudio's address is guido@python.org
    

## ds_seq


```python
shoplist = ['apple', 'mango', 'carrot', 'banana']
name = 'swaroop'

print('Item 0 is', shoplist[0])

print('Item 1 to 3 is',shoplist[1:3])

print('characters 1 to 3 is', name[1:3])
```

    Item 0 is apple
    Item 1 to 3 is ['mango', 'carrot']
    characters 1 to 3 is wa
    

## ds_reference


```python
print('Simple Assignment')
shoplist = ['apple', 'mango', 'carrot', 'banana']
mylist = shoplist

del shoplist[0]

print('shoplist is', shoplist)
print('mylist is', mylist)

print('Copy by making a full slice')
mylist = shoplist[:]
del mylist[0]

print('shoplist is', shoplist)
print('mylist is ', mylist)
```

    Simple Assignment
    shoplist is ['mango', 'carrot', 'banana']
    mylist is ['mango', 'carrot', 'banana']
    Copy by making a full slice
    shoplist is ['mango', 'carrot', 'banana']
    mylist is  ['carrot', 'banana']
    

## ds_str_methods


```python
name = 'Swaroop'

if name.startswith('Swa'):
    print('yes')
    
if 'a' in name:
    print('Yes')
    
if name.find('war') != -1:
    print('yes')
    
delimiter = '_*_'
mylist = ['Brazil', 'Russia', 'India', 'China']
print(delimiter.join(mylist))
```

    yes
    Yes
    yes
    Brazil_*_Russia_*_India_*_China
    
