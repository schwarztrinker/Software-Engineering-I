package Airport.Checkin_Desk;

import Airport.Base.BaggageIdentificationTag;
import Airport.Base.BoardingPass;
import Airport.Base.Passenger;
import Airport.Base.Passport;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class ReadingDevice implements IReadingDevice {
    private String uuid;
    private String type;
    private String id;
    private ArrayList<BoardingPass> boardingPassList;

    public ReadingDevice(String type, ArrayList<BaggageIdentificationTag> baggageIdentificationTagList){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.type = type;
        Random random = new Random();
        id = "" + (random.nextInt(100) + 1);
    }

    public String version(){
        return type + "   " + id;
    }

    public boolean scan(Passport passport){
        for (BoardingPass boardingPass : boardingPassList) {
            if(boardingPass.getPassenger().getPassport().equals(passport)) return true;
        }
        return false;
    }

}
