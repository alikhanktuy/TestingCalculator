import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator calculator = new Calculator();

    @Test
    public void sumTestLong() {
        long result = calculator.sum(5, 2);
        Assert.assertEquals(result, 7);
    }

    @Test
    public void sumTestDouble() {
        double result = calculator.sum(7, 2);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void subTestLong() {
        long result = calculator.sub(8, 4);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void subTestDouble() {
        double result = calculator.sub(9, 3);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void multTestLong() {
        long result = calculator.mult(5, 4);
        Assert.assertEquals(result, 20);
    }

    @Test
    public void multTestDouble() {
        double result = calculator.mult(3, 2);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void divTestLong() {
        long result = calculator.div(6, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void divTestDouble() {
        double result = calculator.div(8, 4);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void powTestDouble() {
        double result = calculator.pow(2, 3);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void sqrtTest() {
        double result = calculator.sqrt(25);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void tgTest() {
        double result = calculator.tg(45);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void ctgTest() {
        double result = calculator.ctg(45);
        Assert.assertEquals(result, 1);
    }

    @Test
    public void cosTest() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void sinTest() {
        double result = calculator.sin(0);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void isPositiveTest() {
        boolean result = calculator.isPositive(5);
        Assert.assertTrue(result);
    }
    @Test
    public  void isNegativeTest(){
        boolean result = calculator.isNegative(-5);
        Assert.assertTrue(result);
    }
}
