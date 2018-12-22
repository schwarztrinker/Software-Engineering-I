package Airport.Checkin_Desk;

import Airport.Base.*;
import Airport.Bulky_Baggage_Desk.BulkyBaggageDeskReceipt;

import java.util.ArrayList;

public interface ICheckInDesk {
    void open();
    boolean validatePassport(Passenger passenger);
    BoardingPass checkIn(Passenger passenger);
    void print(BoardingPass boardingPass);
    double weight(Baggage baggage);
    BaggageIdentificationTag checkIn(Baggage baggage);
    void print(BaggageIdentificationTag baggageIdentificationTag);
    void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage);
    void place(Baggage baggage, LuggageTub luggageTub);
    void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub);
    void notifyGroundOperations(CheckInDeskReceipt checkInDeskReceipt);
    void close();
}
