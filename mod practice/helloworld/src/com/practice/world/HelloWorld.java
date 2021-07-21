package com.practice.world;

import com.practice.capability.Capability;
import com.practice.hello.Hello;
@Capability()
public class HelloWorld implements Hello {
    public void print() {
        System.out.println("Hello World");
    }
}
