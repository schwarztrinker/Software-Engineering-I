package Airport.Checkin_Desk;

import Airport.Airport.Airport;
import Airport.Airport.GateID;
import Airport.Base.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class CheckInDesk implements ICheckInDesk{

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
    private boolean notifiedGroundOperation;


    public CheckInDesk(Airport airport){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        Random random = new Random();
        id = random.nextInt(200) + 1;
        this.airport = airport;
        currentPassenger = airport.loadPassengerBaggageData();
    }


    @Override
    public void open(){
        isOpen = true;
    };

    @Override
    public boolean validatePassport(Passenger passenger){ return false;};

    @Override
    public BoardingPass checkIn(Passenger passenger){
        return currentPassenger.getBoardingPass();}


    @Override
    public void print(BoardingPass boardingPass){

    }

    @Override
    public double weight(Baggage baggage){
        return getRandomDouble(5, 15);
    }


    @Override
    public BaggageIdentificationTag checkIn(Baggage baggage){
        return BaggageIdentificationTag;
    }

    @Override
    public void print(BaggageIdentificationTag baggageIdentificationTag){

    }

    @Override
    public void place(BaggageIdentificationTag baggageIdentificationTag, Baggage baggage){
        currentBaggage.setBaggageIdentificationTag(baggageIdentificationTag);
    }

    @Override
    public void place(Baggage baggage, LuggageTub luggageTub){
        luggageTub.setBaggage(baggage);

    }

    @Override
    public void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub){
        airport.getBaggageSortingUnit().throwOff(luggageTub, airport.getBaggageSortingUnit().getDestinationBox());
    }

    @Override
    public void notifyGroundOperations(CheckInDeskReceipt checkInDeskReceipt){
        this.baggageIdentificationTagList = baggageIdentificationTagList;
        numberOfPassenger = checkInDeskReceipt.getNumberOfPassenger();
        id = checkInDeskReceipt.getCheckInDeskId();

        notifiedGroundOperation = true;
    }


    @Override
    public void close(){
        isOpen = false;
    }

    private double getRandomDouble(int min, int max){
        if(min < max) return  (min + Math.random() * (max - min));
        return  (max + Math.random() * (min - max));
    }

}
