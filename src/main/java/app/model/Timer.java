package app.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Timer implements Serializable {

    private Long nanoTime = System.nanoTime();

    public Timer() {
    }

    public Long getTime() {
        return nanoTime;
    }

    public Long getNanoTime() {
        return nanoTime;
    }

    public void setNanoTime(Long nanoTime) {
        this.nanoTime = nanoTime;
    }
}
