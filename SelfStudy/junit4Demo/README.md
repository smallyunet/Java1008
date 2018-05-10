## JUnit

JUnit是xUnit家族中的一员。

## 使用

### 引入jar包

hamcrest-core-1.3.jar

junit-4.12.jar

### 编写程序

> Calcualte.java

``` java
package com.imooc.util;

public class Calculate {
	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}
}

```

简单的计算类，包含四个方法：加减乘除。

### 测试程序

> CalculateTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	/*
	 * 1.测试方法必须使用@Test进行修饰
	 * 2.测试方法必须使用public void进行修饰，不能带任何参数
	 * 3.新建一个源代码目录来存放我们的测试代码
	 * 4.测试类的包应该和被测试类保持一致
	 * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的联系
	 * 6.测试类使用Test作为类名的后缀（不是必须）
	 * 7.测试方法使用test作为方法名的前缀（不是必须）
	 */
	@Test
	public void testAdd() {
		assertEquals(6, new Calculate().add(3, 3));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(3, new Calculate().substract(5, 2));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(4, new Calculate().multiply(2, 2));
	}
	
	@Test
	public void testDivide() {
		assertEquals(3, new Calculate().divide(6, 2));
	}
}
```

运行测试，如果程序正常通过，eclipse显示条是绿色的。

### 失败的测试

> ErrorAndFailureTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {
	/*
	 * 1.Failure一般由单元测试使用的断言方法判断失败所引起的，这表示 测试点发现了问题，就是说程序输出的结果和我们预期的不一样。
	 * 2.error是由代码异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个隐藏的bug
	 * 3.测试用例不是用来证明你是对的，而是用来证明你没有错
	 */
	@Test
	public void testAdd() {
		assertEquals(5, new Calculate().add(3, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(3, new Calculate().divide(6, 0));
	}
}
```

### 各种注解

> AnotationTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	/*
	 * @Test：将一各普通的方法修饰成为一个测试方法
	 * 
	 * 		@Test(expected=XX.class)
	 * 
	 * 		@Test(timeout=毫秒)
	 * 
	 * @Before：它会在所有的方法运行前被执行，static修饰
	 * 
	 * @AfterClass：它会在所有的方法运行结束后被执行，static修饰
	 * 
	 * @Before：会在每一个测试方法被运行前执行一次
	 * 
	 * @After：会在每一个测试方法运行后被执行一次
	 * 
	 * @Ignore:所修饰的测试方法会被测试运行器忽略
	 * 
	 * @RunWith:可以更改测试运行器 org.junit.runner.Runner
	 */

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		assertEquals(3, new Calculate().divide(6, 0));
	}

	@Ignore
	@Test(timeout = 2000)
	public void testWhile() {
		while (true) {
			System.out.println("fun forever...");
		}
	}

	@Test(timeout = 3000)
	public void testReadFile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
```

### Junit的生命周期

> JunitFlowTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {

	/*
	 * 1.@BeforeClass修饰的方法会在所有方法被调用前执行，
	 * 而且该方法是静态的，所以当测试类被加载后接着就会运行它，
	 * 而且在内存中它只会存在一份实例，它比较适合加载配置文件。
	 * 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的连接
	 * 3.@Before和@After会在每个测试方法的前后各执行一次。
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is Before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is After...");
	}
	
	@Test
	public void test1() {
		System.out.println("this is test1...");
	}
	
	@Test
	public void test2() {
		System.out.println("this is test2...");
	}

}
```

### 测试套件

如果想要一次运行多个测试程序，就要使用测试套件。新建三个测试类：

> TaskTest1.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest1 {

	@Test
	public void test() {
		System.out.println("this is TaskTest1...");
	}

}
```

假装新建了三个类似这样的测试类，然后是测试套件的类：

> SuiteTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {
	/*
	 * 1.测试套件就是组织测试类一起运行的
	 * 
	 * 写一个作为测试套件的入口类，这个类里不包含其他的方法
	 * 更改测试运行器Suite.class
	 * 将要测试的类作为数组传入到Suite.Suite.Class({})
	 */
}
```

### 参数化设置

> ParameterTest.java

``` java
package com.imooc.util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	/*
	 * 1.更改默认的测试运行器为RunWith(Parameterized.class)
	 * 2.声明变量来存放预期值和结果值
	 * 3.声明一个返回值为Collection的公共静态方法，并使用@Patameters进行修饰
	 * 4.为测试类声明一个带有参数的公共构造函数，并在其中为之声明变量赋值
	 */
	int expected = 0;
	int input1 = 0;
	int input2 = 0;

	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][] {
			{3,1,2},
			{4,2,2}
		});
	}
	
	public ParameterTest(int expected, int input1, int input2) {
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}
	
	@Test
	public void testAdd() {
		assertEquals(expected, new Calculate().add(input1, input2));
	}
}
```

参数化设置提供了一次性测试多组数据的方法。
