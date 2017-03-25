package cput.ac.za;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Question2ImplTest {

    @Test
    public void testDescription() throws Exception {

        Question2Impl q1 = new Question2Impl();

        String result = q1.description("Alfa","Giulia");
        String expected = "Alfa Giulia";

        Assert.assertEquals(expected,result);
        System.out.println("Result: " + result + "\n" + "Expected: " + expected);
    }

    @Test
    public void testValue() throws Exception {

        Question2Impl q2 = new Question2Impl();

        double result = q2.value(120000.0,14.0);
        double expected = 136800.0;

        Assert.assertEquals(expected,result);
        System.out.println("Result: " + result + "\n" + "Expected: " + expected);

    }
}