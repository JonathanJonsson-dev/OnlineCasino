package org.example;

public class Roulette {
    public Color bet(double betSize, Color betType) {
        WheelOfFortune wheel = new WheelOfFortune();
        return wheel.spin();
    }
}
