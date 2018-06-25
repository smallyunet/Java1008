
## module_using_sys


```python
import sys

print('The command line arguments are:')
for i in sys.argv:
    print(i)
    
print('\n\nThe PYTHONPATH is', sys.path, '\n')
```

    The command line arguments are:
    d:\application\python3\lib\site-packages\ipykernel_launcher.py
    -f
    C:\Users\Administrator\AppData\Roaming\jupyter\runtime\kernel-bebb5422-cf5a-46cf-aafc-8ac1880eac47.json
    
    
    The PYTHONPATH is ['', 'd:\\application\\python3\\python36.zip', 'd:\\application\\python3\\DLLs', 'd:\\application\\python3\\lib', 'd:\\application\\python3', 'd:\\application\\python3\\lib\\site-packages', 'd:\\application\\python3\\lib\\site-packages\\IPython\\extensions', 'C:\\Users\\Administrator\\.ipython'] 
    
    


```python
from math import sqrt
print("Square root of 16 is", sqrt(16))
```

    Square root of 16 is 4.0
    

## module_using_name


```python
if __name__ == '__main__':
    print('This program is being run by itself')
else:
    print('I am being imported from another module')
```

    This program is being run by itself
    

## mymodule


```python
def say_hi():
    print('Hi, this. is mymodule speaking.')
    
__version__ = '0.1'
```

## mymodule_demo


```python
import mymodule

mymodule.say_ui()
print('Version', mymodule.__version__)
```


    ---------------------------------------------------------------------------

    ModuleNotFoundError                       Traceback (most recent call last)

    <ipython-input-7-c20aef57fe24> in <module>()
    ----> 1 import mymodule
          2 
          3 mymodule.say_ui()
          4 print('Version', mymodule.__version__)
    

    ModuleNotFoundError: No module named 'mymodule'


## mymodule_demo2


```python
from mymodule import say_hi, __version__

say_hi()
print('Version', __version__)
```


    ---------------------------------------------------------------------------

    ModuleNotFoundError                       Traceback (most recent call last)

    <ipython-input-8-855b2b47ed3c> in <module>()
    ----> 1 from mymodule import say_hi, __version__
          2 
          3 say_hi()
          4 print('Version', __version__)
    

    ModuleNotFoundError: No module named 'mymodule'



```python
import sys
```


```python
dir(sys)
```




    ['__displayhook__',
     '__doc__',
     '__excepthook__',
     '__interactivehook__',
     '__loader__',
     '__name__',
     '__package__',
     '__spec__',
     '__stderr__',
     '__stdin__',
     '__stdout__',
     '_clear_type_cache',
     '_current_frames',
     '_debugmallocstats',
     '_enablelegacywindowsfsencoding',
     '_getframe',
     '_git',
     '_home',
     '_xoptions',
     'api_version',
     'argv',
     'base_exec_prefix',
     'base_prefix',
     'builtin_module_names',
     'byteorder',
     'call_tracing',
     'callstats',
     'copyright',
     'displayhook',
     'dllhandle',
     'dont_write_bytecode',
     'exc_info',
     'excepthook',
     'exec_prefix',
     'executable',
     'exit',
     'flags',
     'float_info',
     'float_repr_style',
     'get_asyncgen_hooks',
     'get_coroutine_wrapper',
     'getallocatedblocks',
     'getcheckinterval',
     'getdefaultencoding',
     'getfilesystemencodeerrors',
     'getfilesystemencoding',
     'getprofile',
     'getrecursionlimit',
     'getrefcount',
     'getsizeof',
     'getswitchinterval',
     'gettrace',
     'getwindowsversion',
     'hash_info',
     'hexversion',
     'implementation',
     'int_info',
     'intern',
     'is_finalizing',
     'last_traceback',
     'last_type',
     'last_value',
     'maxsize',
     'maxunicode',
     'meta_path',
     'modules',
     'path',
     'path_hooks',
     'path_importer_cache',
     'platform',
     'prefix',
     'ps1',
     'ps2',
     'ps3',
     'set_asyncgen_hooks',
     'set_coroutine_wrapper',
     'setcheckinterval',
     'setprofile',
     'setrecursionlimit',
     'setswitchinterval',
     'settrace',
     'stderr',
     'stdin',
     'stdout',
     'thread_info',
     'version',
     'version_info',
     'warnoptions',
     'winver']


