package chapter4;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.core.io.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/7/4.
 */
public class ResourceTest {
    @Test
    public void testByteArrayResource() {
        Resource resource = new ByteArrayResource("Hello 我曹!".getBytes());
        if(resource.exists()) {
            dumpStream(resource);
        }
        Assert.assertEquals(false, resource.isOpen());
    }
    @Test
    public void testInputStreamResource() {
        ByteArrayInputStream bis = new ByteArrayInputStream("Hello 我曹!".getBytes());
        Resource resource = new InputStreamResource(bis);
        if(resource.exists()) {
            dumpStream(resource);
        }
        Assert.assertEquals(true, resource.isOpen());
    }

    @Test
    public void testFileResource() {
        File file = new File("d:/test.txt");
        Resource resource = new FileSystemResource(file);
        if(resource.exists()) {
            dumpStream(resource);
        }
        if(resource.exists()) {
            dumpStream(resource);
        }
        Assert.assertEquals(false, resource.isOpen());
    }

    @Test
    public void testClasspathResourceByDefaultClassLoader() throws IOException {
        Resource resource = new ClassPathResource("/chapter4/test1.properties");
        if(resource.exists()) {
            dumpStream(resource);
        }
        System.out.println("path:" + resource.getFile().getAbsolutePath());
        Assert.assertEquals(false, resource.isOpen());
    }

    @Test
    public void testClasspathResourceByClassLoader() throws IOException {
        ClassLoader cl = this.getClass().getClassLoader();
        Resource resource = new ClassPathResource("/chapter4/test1.properties", cl);
        if(resource.exists()) {
            dumpStream(resource);
        }
        System.out.println("path:" + resource.getFile().getAbsolutePath());
        Assert.assertEquals(false, resource.isOpen());
    }
    @Test
    public void testClasspathResourceByClass() throws IOException {
        Class clazz = this.getClass();
        Resource resource1 = new ClassPathResource("/chapter4/test1.properties" , clazz);
        if(resource1.exists()) {
            dumpStream(resource1);
        }
        System.out.println("path:" + resource1.getFile().getAbsolutePath());
        Assert.assertEquals(false, resource1.isOpen());

        Resource resource2 = new ClassPathResource("test1.properties" , this.getClass());
        if(resource2.exists()) {
            dumpStream(resource2);
        }
        System.out.println("path:" + resource2.getFile().getAbsolutePath());
        Assert.assertEquals(false, resource2.isOpen());

    }

    @Test
    public void testClasspathResourceFromJar() throws IOException {
        Resource resource = new ClassPathResource("/notice.txt");
        if(resource.exists()) {
            dumpStream(resource);
        }
        System.out.println("path:" + resource.getURL().getPath());
        Assert.assertEquals(false, resource.isOpen());

    }
    @Test
    public void testUrlResource() throws IOException {
        Resource resource = new UrlResource("file:d:/test.txt");
        if(resource.exists()) {
            dumpStream(resource);
        }
        System.out.println("path:" + resource.getURL().getPath());
        Assert.assertEquals(false, resource.isOpen());

        Resource resource2 = new UrlResource("https://spring.io/");
        if(resource2.exists()) {
            dumpStream(resource2);
        }
        System.out.println("path:" + resource2.getURL().getPath());
        Assert.assertEquals(false, resource2.isOpen());

    }
    private void dumpStream(Resource resource) {
        InputStream is = null;
        try {
            //1.获取文件资源
            is = resource.getInputStream();
            //2.读取资源
            byte[] descBytes = new byte[is.available()];
            is.read(descBytes);
            System.out.println(new String(descBytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                //3.关闭资源
                is.close();
            } catch (IOException e) {
            }
        }
    }
}
