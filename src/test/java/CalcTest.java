import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {


    @DataProvider
    public Object[][] numberProvider(){
        return new Object[][]{
                {5,3,2}
        };
    }

    @Test(dataProvider = "numberProvider")
    public void testSum(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.sum(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProvider")
    public void testMinus(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.minus(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProvider")
    public void testMulti(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.multi(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProvider")
    public void testDiv(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.div(arg1,arg2),result,"Неверный результат");
    }

}
