package dhbw.fowler1.videostore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private Price price;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        switch (_priceCode){
            case CHILDRENS:
                setPrice(new ChildrensPrice());
                break;
            case REGULAR:
                setPrice(new RegularPrice());
                break;
            case NEW_RELEASE:
                setPrice(new NewReleasePrice());
                break;
        }
    }


    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
    void setPrice(Price newPrice) {
        price = newPrice;
    }



    public int getPriceCode() {
        return _priceCode;
    }


    public String getTitle() {
        return _title;
    }
}
