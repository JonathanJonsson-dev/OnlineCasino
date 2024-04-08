package org.example;
import java.util.Random;

import static org.example.Color.BLACK;
import static org.example.Color.RED;

public class WheelOfFortune {
    public Color spin(){
        Random r = new Random();
        int result = r.nextInt(100);
        if (result <= 50){
            return RED;
        }
        else {
            return BLACK;
        }
    }
}
