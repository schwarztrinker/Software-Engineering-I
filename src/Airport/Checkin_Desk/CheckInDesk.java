package Airport.Checkin_Desk;

import Airport.Airport.GateID;
import Airport.Base.*;

import java.util.ArrayList;

public class CheckInDesk {

    private String uuid;
    private int id;
    private Airport airport;
    private TicketClass ticketClass;
    private String flight;
    private Destination destination;
    private String date;
    private String boardingTime;
    private GateID gate;
    private Employee employee;
    private IReadingDevice readingDevice;
    private ArrayList<LuggageTub> luggageTubList;
    private Passenger currentPassenger;
    private int numberOgPassenger;
    private int numberOfNormalBaggage;
    private ArrayList<BoardingPass> boardingPassList;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;
    private boolean isOpen;






}
