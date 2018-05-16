package net.smallyu.corejava.ct;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    /**
     * 测试add方法，正确情况
     */
    @Test
    public void addTest() {
        assertEquals(3, new net.smallyu.corejava.ct.Calculator().add(1, 2));
    }

    /**
     * 测试div方法，错误情况
     */
    @Test
    public void divTest() {
        assertEquals(1, new Calculator().div(4, 2));
    }

    /**
     * 测试div方法，报错情况
     */
    @Test
    public void divTest2() {
        assertEquals(1, new Calculator().div(4, 0));
    }

    /**
     * 参数化测试add方法
     */
    @ParameterizedTest
    @MethodSource("intsPovider")
    public void addTest2(int result, int a, int b) {
        assertEquals(result, new Calculator().add(a, b));
    }

    public static Stream<Arguments> intsPovider() {
        return Stream.of(
                Arguments.of(5, 2, 3),
                Arguments.of(3, 2, 1),
                Arguments.of(6, 2, 2),
                Arguments.of(9, 5, 1)
        );
    }
}
