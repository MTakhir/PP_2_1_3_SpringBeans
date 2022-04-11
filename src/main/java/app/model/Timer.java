package app.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Objects;

@Component
public class Timer implements Serializable {

    private Long nanoTime = System.nanoTime();

    public Timer() {
    }

    public Long getTime() {
        return nanoTime;
    }

}
