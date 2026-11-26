public class Guitar extends StringInstrument {
    private String guitarType;

    public Guitar(double price, boolean onSale,
                  int numberOfStrings, String guitarType) {
        super(price, onSale, numberOfStrings);
        this.guitarType = guitarType;
    }
}