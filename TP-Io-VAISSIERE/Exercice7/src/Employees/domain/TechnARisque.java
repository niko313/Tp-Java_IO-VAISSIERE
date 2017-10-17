package Employees.domain;

public class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String firstname, String lastname, int age, String entryYear, Double base) {
        super(firstname, lastname, age, entryYear, base);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + getPrime();
    }

    @Override
    public double getPrime() {
        return 200;
    }
}
