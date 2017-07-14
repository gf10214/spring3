package com.wangshuo.spring.chapter6;

public interface IHelloWorldService {
    
    public void sayHello();
    
    public void sayBefore(String param);

    public boolean sayAfterReturning();
    
    public void sayAfterThrowing();

    public boolean sayAfterFinally();
    
    public void sayAround(String param);
    
    public void sayAdvisorBefore(String param);
}
