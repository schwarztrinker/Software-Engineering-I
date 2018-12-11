package Airport.Bulky_Baggage_Desk;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;

public class ReadingDevice {

    private String uuid;
    private String type;
    private String id;



    String version(){ return "Version";}

    boolean scan(Passport passport){return false; }

    boolean scan(BoardingPass boardingPass) {return false; }


}
