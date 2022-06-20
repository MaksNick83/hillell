package com.nikitchyn.homework15;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    //****************Тести ділення**************************//

    @Test
    public void testCalculateDiv() { // ділення позитивних
        Double actual = calculator.calculate(4, "/", 2);
        Assert.assertEquals(2.0, actual, 0.0);
    }

    @Test
    public void testCalculateDivWhenMembersAreNegative() { // ділення негативних
        Double actual = calculator.calculate(-4, "/", -2);
        Assert.assertEquals(2.0, actual, 0.0);
    }


    @Test
    public void testCalculateDivWhenNegativeOneMember() { // ділення з одним негативним
        Double actual = calculator.calculate(-4, "/", 2);
        Assert.assertEquals(-2.0, actual, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDivByZeroWhenMemberAreNegative() {// ділення на 0 негативних
        Double actual = calculator.calculate(-4, "/", 0);
        Assert.assertEquals(0.0, actual, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalculateDivByZeroWhenMemberArePlus() {// ділення на 0 позитивних
        Double actual = calculator.calculate(4, "/", 0);
        Assert.assertEquals(0.0, actual, 0.0);
    }


    //****************Тести множення **************************//
    @Test
    public void testCalculateMulti() {//множення позитивних
        Double actual = calculator.calculate(4, "*", 2);
        Assert.assertEquals(8.0, actual, 0.0);
    }

    @Test
    public void testCalculateMultiWhenMembersAreNegative() {//множення негативних
        Double actual = calculator.calculate(-4, "*", -2);
        Assert.assertEquals(8.0, actual, 0.0);
    }

    @Test
    public void testCalculateMultiWhenNegativeOneMembers() {//множення один негативний
        Double actual = calculator.calculate(4, "*", -2);
        Assert.assertEquals(-8.0, actual, 0.0);
    }

    //****************Тести віднімання **************************//
    @Test
    public void testCalculateSub() {//віднімання позитивних
        Double actual = calculator.calculate(4, "-", 2);
        Assert.assertEquals(2.0, actual, 0.0);
    }

    @Test
    public void testCalculateSubWhenMembersAreNegative() {//віднімання негативних
        Double actual = calculator.calculate(-4, "-", -2);
        Assert.assertEquals(-2.0, actual, 0.0);
    }

    //****************Тести додавання **************************//
    @Test
    public void testCalculateAdd() {//Додавання позитивних
        Double actual = calculator.calculate(2, "+", 2);
        Assert.assertEquals(4.0, actual, 0.0);
    }

    @Test
    public void testCalculateAddWhenMembersAreNegative() {//Додавання негативних
        Double actual = calculator.calculate(-2, "+", -2);
        Assert.assertEquals(-4.0, actual, 0.0);
    }

    //****************Тести перевірки операції **************************//
    @Test(expected = UnsupportedOperationException.class)
    public void testCalculateOperationSupported() {  // Перевірити чи операція підтримується.
        Double actual = calculator.calculate(4, "/+", 2);
        Assert.assertEquals(-1.0, actual, 0.0);

    }

    //Допишіть тести на новий метод
    @Test
    public void testCalculateStringArgAdd() {//Додавання негативних
        Double actual = calculator.calculate("-2", "+", "-2");
        Assert.assertEquals(-4.0, actual, 0.0);
    }

    @Test

    public void testCalculateStringArgSub() {//віднімання позитивних
        Double actual = calculator.calculate("4", "-", "2");
        Assert.assertEquals(2.0, actual, 0.0);
    }

    @Test
    public void testCalculateStringArgMulti() {//множення позитивних
        Double actual = calculator.calculate("4", "*", "2");
        Assert.assertEquals(8.0, actual, 0.0);
    }

    @Test
    public void testCalculateStringArgDiv() { // ділення позитивних
        Double actual = calculator.calculate("4", "/", "2");
        Assert.assertEquals(2.0, actual, 0.0);
    }
    @Test(expected = ArithmeticException.class)
    public void testCalculateStringArgDivByZero() { // ділення на 0
        Double actual = calculator.calculate("4", "/", "0");
        Assert.assertEquals(2.0, actual, 0.0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCalculateStringArgOperationSupported() {  // Перевірити чи операція підтримується.
        Double actual = calculator.calculate("4", "/+", "2");
        Assert.assertEquals(-1.0, actual, 0.0);

    }

    @Test(expected = CalculatorException.class)
    public void testCalculateStringArgOneIsDigits() {  // Проверка a на число
        Double actual = calculator.calculate("l", "/+", "2");
        Assert.assertEquals(-1.0, actual, 0.0);

    }

    @Test(expected = CalculatorException.class)
    public void testCalculateStringArgTwoIsDigits() {  // Проверка b на число
        Double actual = calculator.calculate("2", "/+", "L");
        Assert.assertEquals(-1.0, actual, 0.0);

    }

}