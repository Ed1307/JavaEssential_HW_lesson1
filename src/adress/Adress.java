package adress;

public class Adress {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int appartement;

    public void setCity(String city) {
        this.city = city;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setAppartement(int appartement) {
        this.appartement = appartement;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAppartement() {
        return appartement;
    }

    public int getHouse() {
        return house;
    }

    public int getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }
}


