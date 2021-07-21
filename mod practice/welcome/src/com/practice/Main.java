package com.practice;

import com.practice.capability.Capability;
import com.practice.world.HelloWorld;
import com.practice.youtube.HelloYoutube;
import com.practice.hello.Hello;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;


public class Main {

    public static void main(String[] args) {
       ServiceLoader<Hello> helloService = ServiceLoader.load(Hello.class);
        Iterator<Hello> iter = helloService.iterator();
        while(iter.hasNext()){
            Hello loader = iter.next();
            Annotation[] result = loader.getClass().getAnnotations();
            for ( Annotation a : result){
                System.out.println(a);
                Capability c = (Capability) a;
                if (c.name().equals("youtube")){
                    loader.print();
                }
            }
        }

    }
}
