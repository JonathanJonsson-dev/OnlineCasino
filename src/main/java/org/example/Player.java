package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private double balance = 1000;
    private double betSize;
    private Color betType;

    public void lost(double amount) {
        balance -= amount;
    }
    public void won(double amount) {
        balance += amount;
    }
}
