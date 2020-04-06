package ro.siit;

import java.util.UUID;

public class Iphone5 extends Iphone {
    public Iphone5(){
        super((int)(Math.random()*100)+3,"White","Plastic", UUID.randomUUID());
    }
}
