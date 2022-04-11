package app.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Dog extends Animal implements Serializable {

    private String dogSay = "Im a Dog";

    public Dog() {
    }

    public String getDogSay() {
        return dogSay;
    }

    public void setDogSay(String dogSay) {
        this.dogSay = dogSay;
    }

    @Override
    public String toString() { return dogSay; }
}
