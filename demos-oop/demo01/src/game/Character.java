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

         public Character(String string, char elfo, int i, int j, Role mago, boolean b) {
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

         public void showCharacter() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'showCharacter'");
         }

         public void renameInvalidCharacters(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'renameInvalidCharacters'");
         }

         public static void showList() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'showList'");
         }


    
}
