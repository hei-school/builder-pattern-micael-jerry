package org.dp.model.component;

import java.util.Objects;

public class Engine {
    private int cylinderNumber;
    private boolean isStarted;

    public Engine(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
        this.isStarted = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine engine)) return false;
        return getCylinderNumber() == engine.getCylinderNumber() && isStarted() == engine.isStarted();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCylinderNumber(), isStarted());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinderNumber=" + cylinderNumber +
                ", isStarted=" + isStarted +
                '}';
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted() {
        isStarted = !isStarted;
    }
}
