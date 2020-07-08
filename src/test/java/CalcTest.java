import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalcTest {


    @DataProvider
    public Object[][] numberProviderForSum(){
        return new Object[][]{
                {5,3,2},
                {3.27,3,0.27},
                {-8.769,-3.040,-5.729}
        };
    }

    @DataProvider
    public Object[][] numberProviderForMinus(){
        return new Object[][]{
                {1,3,2},
                {2.73,3,0.27},
                {8.769,3.040,-5.729}
        };
    }

    @DataProvider
    public Object[][] numberProviderForMulti(){
        return new Object[][]{
                {6,3,2},
                {0.81,3,0.27},
                {17.41616,-3.040,-5.729}
        };
    }

    @DataProvider
    public Object[][] numberProviderForDiv(){
        return new Object[][]{
                {1.5,3.0,2.0},
                {6.0,3,0.5},
                {6.0,-3.6,-0.6}
        };
    }

    @Test(dataProvider = "numberProviderForSum")
    public void testSum(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.sum(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProviderForMinus")
    public void testMinus(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.minus(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProviderForMulti")
    public void testMulti(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.multi(arg1,arg2),result,"Неверный результат");
    }

    @Test(dataProvider = "numberProviderForDiv")
    public void testDiv(Number result,Number arg1, Number arg2){
        Assert.assertEquals(Calc.div(arg1,arg2),result,"Неверный результат");
    }

}
