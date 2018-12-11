package Airport.Bulky_Baggage_Desk;

import Airport.Airport.Airport;
import Airport.Base.BaggageIdentificationTag;
import Airport.Base.Employee;
import Airport.Base.LuggageTub;
import Airport.Base.Passenger;

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


    

}
