package ro.siit;

import java.util.UUID;

public class SamsungGalaxy6 extends Samsung {

    public SamsungGalaxy6(){
        super((int)(Math.random()*100)+3,"Red","Plastic", UUID.randomUUID());
    }
}
