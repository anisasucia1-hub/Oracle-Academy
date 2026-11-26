public class Instrument {
    protected double price;
    protected boolean onSale;

    public Instrument(double price, boolean onSale) {
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        double result = price * 0.75;

        if (onSale) {
            result *= 0.85;
        }

        return result;
    }
}