

public class Main {
    public static void main(String[] args) {
// debes asignar el nombre parecido al de fichero 
//
    
       
//java no reconoce al personaje,para corregirlo debes 
       Character character1;
       character1 = new Character("Zelda", "F");
      Character character2;     
       character2 = new character ("Gorko", "M");
       character2.isZombi = true;

System.out.println(character1.name);
System.out.println("is zombi?: " + character1.isZombi);
System.out.println(character2.name);
System.out.println("is zombi? " + character2.isZombi);
        
    }
    
}
