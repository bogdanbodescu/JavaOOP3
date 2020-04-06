package ro.siit;

import java.util.UUID;

public class Iphone6 extends Iphone {

    public Iphone6(){
        super((int)(Math.random()*100)+3,"Gold","Metal", UUID.randomUUID());
    }
}
