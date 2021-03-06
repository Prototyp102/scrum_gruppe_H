package dhbw.fowler1.videostore;

abstract class Price {
    public abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class RegularPrice extends Price {
    public double getCharge(int daysRented) {
        double charge = 2.00;
        if (daysRented > 2)
            charge += (daysRented - 2) * 1.50;
        return charge;
    }
}

class NewReleasePrice extends Price {
    public double getCharge(int daysRented) {
        return daysRented * 3.00;
    }
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1)
            return 2;
        else
            return super.getFrequentRenterPoints(
                    daysRented);
    }
}

class ChildrensPrice extends Price {
    public double getCharge(int daysRented) {
        double charge = 1.50;
        if (daysRented > 3)
            charge += (daysRented - 3) * 1.50;
        return charge;
    }
}