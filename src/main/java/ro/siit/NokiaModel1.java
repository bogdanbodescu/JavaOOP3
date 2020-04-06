package ro.siit;

import java.util.UUID;

public class NokiaModel1 extends Nokia {

    public NokiaModel1(){
        super((int)(Math.random()*100)+3,"Blue","Glass", UUID.randomUUID());
    }
}
