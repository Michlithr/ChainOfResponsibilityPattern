package targets;

import request.MotherRequest;

public class Ania extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.LOW))
            System.out.println("Ania took a jar from shelf.");
        else
            getTallerChild().processRequest(motherRequest);
    }
}
