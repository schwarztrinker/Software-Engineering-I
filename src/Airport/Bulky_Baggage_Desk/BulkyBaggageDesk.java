package Airport.Bulky_Baggage_Desk;

import Airport.Airport.Airport;
import Airport.Base.*;

import java.util.ArrayList;

public class BulkyBaggageDesk {

    private String uuid;
    private int id;
    private Airport airport;
    private Employee employee;
    private IReadingDevice readingDevice;
    private ArrayList<LuggageTub> luggageTubList;
    private Passenger currentPassenger;
    private int numberOfPassenger;
    private int numberOfBulkyBaggage;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;
    private boolean isOpen;


//    public BulkyBaggageDesk(String uuid, int id, Airport airport, Employee employee, IReadingDevice readingDevice, ArrayList<LuggageTub> luggageTubList, Passenger currentPassenger, int numberOfPassenger, int numberOfBulkyBaggage, ArrayList<BaggageIdentificationTag> baggageIdentificationTagList, boolean isOpen){
//        this.uuid = uuid;
//        this.id = id;
//        this.airport = airport;
//        this.employee = employee;
//        this.readingDevice = readingDevice;
//        this.luggageTubList = luggageTubList;
//        this.currentPassenger = currentPassenger;
//        this.numberOfPassenger = numberOfPassenger;
//        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
//        this.baggageIdentificationTagList = baggageIdentificationTagList;
//        this.isOpen =isOpen;
//    }

    void open(){};

    boolean scan(Passport passport){
        return false;
    }

    boolean scan(BoardingPass boardingPass){
        return false;
    }

    double weight(Baggage baggage){
        return 0;
    }

    BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage){ return BaggageIdentificationTag;  }

    BaggageIdentificationTag printBaggageIdentificationTag(){ return BaggageIdentificationTag;}

    void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage){};

    void place(Baggage baggage, LuggageTub luggageTub){};

    void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub){};

    void refillLuggageTubListFromCheckInDesk(){};

    void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt){};

    void close(){};
}
