package Airport.Bulky_Baggage_Desk;

import Airport.Base.*;

import java.util.ArrayList;

public interface IBulkyBaggageDesk {
    void open();
    boolean scan(Passport passport);
    boolean scan(BoardingPass boardingPass);
    double weight(Baggage baggage);
    BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage);
    BaggageIdentificationTag printBaggageIdentificationTag();
    void place(Baggage baggage, LuggageTub luggageTub);
    void place(BaggageIdentificationTag baggageIdentificationTag);
    void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt, ArrayList<BaggageIdentificationTag> baggageIdentificationTagList);
    void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub);
    void close();
    
}
