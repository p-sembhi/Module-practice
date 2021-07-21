package com.practice.main;
import com.practice.capability2.Capablilty2;
import com.practice.goodbyeworld.GoodbyeWorld;
import com.practice.goodbyeYoutube.GoodbyeYoutube;
import com.practice.goodbye.Goodbye;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public class main2 {

    public static void main(String[] args){
        ServiceLoader<Goodbye> goodbyeService = ServiceLoader.load(Goodbye.class);
        Iterator<Goodbye> iterate = goodbyeService.iterator();
        while(iterate.hasNext()){
            Goodbye loader = iterate.next();
            Annotation[] result = loader.getClass().getAnnotatons();
            for (Annotation b : result){
                System.out.println(b);
                Capability2 d = (Capability2) b;
                if (d.name().equals("goodbye youtube")){
                    loader.print();
                }
            }
        }
    }
}
