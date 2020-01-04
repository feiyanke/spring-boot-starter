package io.my;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StarterBean {

    private final StarterProperties properties;
    private final StarterInfo info;

    public void func1() {
        System.out.println("info: " + info.getA());
        System.out.println("666 StarterBean func1() called: " + properties);
    }


}
