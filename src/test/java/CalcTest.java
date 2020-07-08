import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {


    @Test
    public void testSum(Number result,Number arg1, Number arg2){
        Assert.assertEquals(result,Calc.sum(arg1,arg2),"Неверный результат");
    }

    @Test
    public void testMinus(Number result,Number arg1, Number arg2){
        Assert.assertEquals(result,Calc.minus(arg1,arg2),"Неверный результат");
    }

    @Test
    public void testMulti(Number result,Number arg1, Number arg2){
        Assert.assertEquals(result,Calc.multi(arg1,arg2),"Неверный результат");
    }

    @Test
    public void testDiv(Number result,Number arg1, Number arg2){
        Assert.assertEquals(result,Calc.div(arg1,arg2),"Неверный результат");
    }

}
