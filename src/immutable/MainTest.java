package immutable;

public class MainTest {

    public static void main(String[] args) {
        Employe e = new Employe(1, "san",new Address(12,"Hyd","Tel"));

        System.out.println(e.toString());

        e.getAddress().setCity("Blr");

        System.out.println(e.toString());

        Employe e1 = new Employe(1, "san",new Address(12,"Hyd","Tel"));







    }
}
