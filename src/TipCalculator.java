public class TipCalculator {
    private int numPeople;
    private double tipPercentage;
    private double totalBillBeforeTip = 0;

    public TipCalculator (int a, double b) {
        numPeople = a;
        tipPercentage = b / 100;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double totalBill() {
        return (totalBillBeforeTip + (totalBillBeforeTip*tipPercentage));
    }

    public double tipAmount() {
        return (totalBillBeforeTip*tipPercentage);
    }

    public double getTipPercentage() {
        return tipPercentage *100;
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}
