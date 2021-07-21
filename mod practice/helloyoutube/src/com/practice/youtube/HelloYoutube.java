package com.practice.youtube;
import com.practice.capability.Capability;
import com.practice.hello.Hello;

@Capability (name = "youtube")
public class HelloYoutube implements Hello{

    public void print() {
     System.out.println("Hello Youtube");
    }
}
