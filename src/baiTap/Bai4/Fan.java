package baiTap.Bai4;

import java.util.Arrays;

public class Fan {
    private String color;
    private boolean isOn;
    private int speed;
    private double radius;
    public Fan() {
        this.color = "blue";
        this.isOn = false;
        this.speed = 0;
        this.radius = 5;
    }
    public void turnOn() {
        isOn = true;
        speed = 1;
    }

    public void turnOff() {
        isOn = false;
        speed = 0;
    }

    public void increaseSpeed() {
        if (isOn && speed < 3) {
            speed++;
        }
    }

    public void decreaseSpeed() {
        if (isOn && speed > 0) {
            speed--;
        }
    }

    public String getColor() {
        return color;
    }

    // Getter và Setter
    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

}
