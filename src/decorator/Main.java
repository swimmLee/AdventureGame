package decorator;

public class Main {

    public static void main(String[] args) {
        new Main();
    }
    
    public Main(){
        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Might: " + basicCharacter.getMight());
        
        System.out.println("\n");
        
        Character basicLee = new Spear(new Sword(new BasicCharacter("TidalWave")));
        System.out.println("Name: " + basicLee.getName());
        System.out.println("Might: " + basicLee.getMight());
        
        System.out.println("\n");
        
        String name = "BigWave";
        Character secondLee = new Spear(new Sword(
                new Shield(new Starving(new BasicCharacter(name)))));
        System.out.println("Name: " + secondLee.getName());
        System.out.println("Might: " + secondLee.getMight());
        
    }
}
