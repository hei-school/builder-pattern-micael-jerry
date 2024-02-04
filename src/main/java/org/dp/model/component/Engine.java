package org.dp.model.component;

public class Engine {
    private int cylinderNumber;
    private boolean isStarted;

    public Engine(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
        this.isStarted = false;
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
