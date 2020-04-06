package ro.siit;

import java.util.UUID;

abstract public class Samsung extends Phone {

    public Samsung(int batteryLife, String color, String material, UUID uuid) {
        super(batteryLife,color,material,uuid);
    }
}
