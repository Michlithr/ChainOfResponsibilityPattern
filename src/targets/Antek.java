package targets;

import request.MotherRequest;

public class Antek extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH))
            System.out.println("Antek took a jar from shelf.");
        else
            throw new UnsupportedOperationException("Unsupported request");
    }
}
