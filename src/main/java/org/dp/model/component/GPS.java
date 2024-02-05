package org.dp.model.component;

import java.util.Objects;

public class GPS {
    private String destination;

    public GPS() {
    }

    @Override
    public String toString() {
        return "GPS{" +
                "destination='" + destination + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GPS gps)) return false;
        return Objects.equals(getDestination(), gps.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination());
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
