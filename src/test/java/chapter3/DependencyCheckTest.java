package chapter3;

import org.junit.Test;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class DependencyCheckTest {
    
    @Test(expected = UnsatisfiedDependencyException.class)
    public void testDependencyCheckByObject() throws IOException {
        //将抛出异常
        new ClassPathXmlApplicationContext("chapter3/dependency-check-object.xml");
    }

    @Test(expected = UnsatisfiedDependencyException.class)
    public void testDependencyCheckBySimple() throws IOException {
        //将抛出异常
        new ClassPathXmlApplicationContext("chapter3/dependency-check-simple.xml");
    }
   
    @Test(expected = UnsatisfiedDependencyException.class)
    public void testDependencyCheckByAll() throws IOException {
        //将抛出异常
        new ClassPathXmlApplicationContext("chapter3/dependency-check-all.xml");
    }
    @Test
    public void testDependencyCheckByNone() {
        //将抛出异常
        new ClassPathXmlApplicationContext("chapter3/dependency-check-none.xml");
    }
    
}

