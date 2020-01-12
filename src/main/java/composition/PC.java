package main.java.composition;

public class PC {
    private Case_carcasa theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case_carcasa theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case_carcasa getTheCase() {
        return theCase;
    }

    public void setTheCase(Case_carcasa theCase) {
        this.theCase = theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
