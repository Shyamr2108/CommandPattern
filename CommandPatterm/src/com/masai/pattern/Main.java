package com.masai.pattern;

public class Main {

    public static void main(String[] args) {

        Light l=new Light();
        Command lightOn=new LightOn(l);
        RemoteControl onButton=new RemoteControl(lightOn);
        onButton.buttonPress();

        Light l1=new Light();
        Command lightOff=new LightOff(l1);
        RemoteControl offButton=new RemoteControl(lightOff);
        offButton.buttonPress();


    }
}
