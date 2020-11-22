package adress;

public class Main {
    public static void main(String[] args) {
        Adress a = new Adress();
        a.setAppartement(50);
        a.setCity("Zp");
        a.setCountry("Ua");
        a.setHouse(15);
        a.setIndex(69000);
        a.setStreet("Mayakovskogo");

        System.out.println(a.getIndex());
        System.out.println(a.getAppartement());
        System.out.println(a.getCity());
        System.out.println(a.getCountry());
        System.out.println(a.getHouse());
        System.out.println(a.getStreet());
    }
}
