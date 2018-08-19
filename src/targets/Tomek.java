package targets;

import request.MotherRequest;

public class Tomek extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM))
            System.out.println("Tomek took a jar from shelf.");
        else
            getTallerChild().processRequest(motherRequest);
    }
}
