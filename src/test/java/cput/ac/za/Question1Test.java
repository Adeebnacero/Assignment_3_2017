package cput.ac.za;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Question1Test {

    @Test
    public void testListNames() throws Exception {

        Question1 q1 = new Question1();

        String result = q1.listNames();
        String expected = "Nacerodien";

        Assert.assertEquals(expected,result);
    }

    @Test
    public void testMapNames() throws Exception {

        Question1 q2 = new Question1();

        String result = q2.mapNames();
        String expected = "Asia";

        Assert.assertEquals(expected,result);
    }

    @Test
    public void testSetNames() throws Exception {

        Question1 q3 = new Question1();

        String result = q3.setNames();
        String expected = "[Hollywood, Bollywood]";

        Assert.assertEquals(expected,result);

    }
}