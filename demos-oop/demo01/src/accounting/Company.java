package accounting;

public class Company {
     private String nif;
    private String name;

    public Company(String nif, String name) {
        this.nif = nif;
        this.name = name;
    }

    String getNif() {
        return this.nif.toUpperCase();
    }

    String getName() {
        return name;
    }

    public Object renderHeader() {
        
        throw new UnsupportedOperationException("Unimplemented method 'renderHeader'");
    }

    public Object renderClient() {
     
        throw new UnsupportedOperationException("Unimplemented method 'renderClient'");
    }

}
