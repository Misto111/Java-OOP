package command;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lamp lampInKitchen = new Lamp();
        Lamp lampInBedroom = new Lamp();
        Lamp lampInBathroom = new Lamp();


        Switch invoker =  new Switch();
invoker.storeAndExecute(new TurnAllLightsOn(Arrays.asList(lampInBedroom, lampInBathroom, lampInKitchen)));

    }
}
