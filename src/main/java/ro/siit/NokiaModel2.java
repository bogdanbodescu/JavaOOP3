package ro.siit;

import java.util.UUID;

public class NokiaModel2 extends Nokia {

    public NokiaModel2(){
        super((int)(Math.random()*100)+3,"Pink","Metal", UUID.randomUUID());
    }
}
