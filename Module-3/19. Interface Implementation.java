interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar");
    }
}
class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        Playable myPiano = new Piano();

        myGuitar.play();  
        myPiano.play();   
    }
}
