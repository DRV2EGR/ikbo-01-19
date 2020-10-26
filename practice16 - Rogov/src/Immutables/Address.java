package Immutables;

public final class Address {
    private String cityName;;
    private int zipCode;
    private String streetName;
    private int buildingNomber;
    private char buildingLetter;
    private int apartmentNomber;

    public Address EMPTY_ADDRESS;

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNomber() {
        return buildingNomber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNomber() {
        return apartmentNomber;
    }
}
