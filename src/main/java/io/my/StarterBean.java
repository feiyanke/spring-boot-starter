package io.my;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StarterBean {

    @Autowired
    private StarterProperties properties;

    public void func1() {
        System.out.println("111 StarterBean func1() called: " + properties);
    }


}
