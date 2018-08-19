import request.MotherRequest;
import targets.*;

public class Main {
    public static void main(String[] argv){
        MotherRequest motherRequest = new MotherRequest(Shelf.LOW);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(antek);
        ania.setTallerChild(tomek);
        ania.processRequest(motherRequest);
    }
}
