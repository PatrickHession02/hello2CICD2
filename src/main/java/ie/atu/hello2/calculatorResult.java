package ie.atu.hello2;

public class calculatorResult {
    private String Operation;
    private double TOTAL;

    public calculatorResult(String Operation, double total) {
        this.Operation = Operation;
        this.TOTAL = TOTAL;
    }
    public double getTotal() {
        return TOTAL;
    }
    public String getOperation() {
        return Operation;
    }
}
