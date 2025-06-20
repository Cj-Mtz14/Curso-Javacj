package game;

public class Character {

    private String name;
    private char specie;
    private int number;
    private String roll;
    private boolean isZombi;

    public Character(String name, char specie, int number, String roll, boolean isZombi) {
        

        this.name = name;
        this.specie = specie;
        this.number = number;
        this.roll = roll;
        this.isZombi = false;

        } 

         public Character() {
            String zombiMessage = isZombi ? "Es un zombi" : "No es zombi";
            String message =  """
                    ===================
                    ficha del %s
                    ===================
                    specie %s
                    number %s
                    roll %s
                    isZombi %s
                    """;

                    


         }


    
}
