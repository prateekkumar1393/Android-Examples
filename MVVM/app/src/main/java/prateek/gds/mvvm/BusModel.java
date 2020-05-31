package prateek.gds.mvvm;

public class BusModel {
    private String operator;
    private int fare;

    public BusModel(String operator, int fare) {
        this.operator = operator;
        this.fare = fare;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
