package cput.ac.za;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Question2ImplSpringframeworkTest {

    private Question2Interface q2;
    private ApplicationContext appcon;

    @BeforeMethod
    public void setUp() throws Exception {

        appcon = new AnnotationConfigApplicationContext((AppConfig.class));
        q2 = (Question2Interface)appcon.getBean("description");

    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testDescription() throws Exception {

        String result = q2.description("Alfa","Giulia");

        Assert.assertEquals(result,"Alfa Giulia");
    }

    @Test
    public void testValue() throws Exception {

        double result = q2.value(120000,14);

        Assert.assertEquals(result,136800,0);

    }
}