package chapter3;

import com.wangshuo.spring.chapter3.bean.DependentBean;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class MoreDependencyInjectTest {
    
    @Test
    public void testDependOn() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chapter3/depends-on.xml");
        context.registerShutdownHook();
        DependentBean dependentBean = context.getBean("dependentBean", DependentBean.class);
        dependentBean.write("aaa");
    }
    
   
}

