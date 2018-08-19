package com.bags.simulacrum;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void simulate()
    {
        Weapon ignis = new Weapon();
        ignis.setAccuracy(5.0);
        System.out.println(ignis.toString());
    }

}
