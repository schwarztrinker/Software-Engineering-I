package Airport.Bulky_Baggage_Desk;

import Airport.Airport.Airport;
import Airport.Base.*;


import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class BulkyBaggageDesk implements IBulkyBaggageDesk{
    private String uuid;
    private int id;
    private Airport airport;
    private Employee employee;
    private ReadingDevice readingDevice;
    private Passenger currentPassenger;
    private BulkyBaggage currentBaggage;
    private int numberOfPassenger = 0;
    private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList = new ArrayList<>();
    private ArrayList<LuggageTub> luggageTubList = new ArrayList<>();
    private boolean isOpen = false;
    private boolean notifiedGroundOperation = false;


    public BulkyBaggageDesk(Airport airport){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        Random random = new Random();
        id = random.nextInt(200) + 1;
        this.airport = airport;

        for(int x = 0; x < 5000; x++){
            luggageTubList.add(new LuggageTub(getRandomString(50), getRandomString(20), null));
        }
    }

    @Override
    public void open(){
        employee = airport.getResourcePool().takeResource("Employee");
        isOpen = true;
    }

    @Override
    public void close(){
        airport.getResourcePool().returnResource(employee);
        employee = null;
        isOpen = false;
    }

    @Override
    public boolean scan(Passport passport){
        return readingDevice.scan(passport);
    }

    @Override
    public boolean scan(BoardingPass boardingPass){
        return readingDevice.scan(boardingPass);
    }

    @Override
    public double weight(Baggage baggage){
        return getRandomDouble(5, 15);
    }

    @Override
    public Airport.Base.BaggageIdentificationTag checkIn(BoardingPass boardingPass, Baggage baggage){
        if(!isOpen || !scan(boardingPass) || !notifiedGroundOperation) return null;

        baggage.setWeight(weight(baggage));
        currentBaggage = (BulkyBaggage) baggage;

        BaggageIdentificationTag baggageIdentificationTag = printBaggageIdentificationTag();

        currentPassenger = boardingPass.getPassenger();
        numberOfPassenger--;
        baggageIdentificationTagList.add(baggageIdentificationTag);
        place(baggageIdentificationTag);
        sendLuggageTubToBaggageSortingUnit(prepareLuggageTub());

        if(numberOfPassenger <= 0){
            notifiedGroundOperation = false;
            if (baggageIdentificationTagList.size() > 0) {
                baggageIdentificationTagList.subList(0, baggageIdentificationTagList.size()).clear();
            }
        }

        return baggageIdentificationTag;
    }

    @Override
    public BaggageIdentificationTag printBaggageIdentificationTag(){
        BoardingPass currentPassangerBoardingPass = currentPassenger.getBoardingPass();
        return new BaggageIdentificationTag(currentPassangerBoardingPass, currentPassangerBoardingPass.getFlight(), getRandomInteger(0, 500), currentBaggage, getRandomString(20) );
    }

    @Override
    public void place(BaggageIdentificationTag baggageIdentificationTag){
        currentBaggage.setBaggageIdentificationTag(baggageIdentificationTag);
    }

    @Override
    public void place(Baggage baggage, LuggageTub luggageTub){
        luggageTub.setBaggage(baggage);
    }

    @Override
    public void notifyGroundOperations(BulkyBaggageDeskReceipt bulkyBaggageDeskReceipt, ArrayList<BaggageIdentificationTag> baggageIdentificationTagList){
        this.baggageIdentificationTagList = baggageIdentificationTagList;
        numberOfPassenger = bulkyBaggageDeskReceipt.getNumberOfPassenger();
        id = bulkyBaggageDeskReceipt.getBulkyBaggageDeskID();

        notifiedGroundOperation = true;
    }

    @Override
    public void sendLuggageTubToBaggageSortingUnit(LuggageTub luggageTub){
        airport.getBaggageSortingUnit().throwOff(luggageTub, airport.getBaggageSortingUnit().getDestinationBox());

    }

    private LuggageTub prepareLuggageTub(){
        LuggageTub currentLuggageTub = luggageTubList.get(0);
        luggageTubList.remove(0);
        currentLuggageTub.setBaggage(currentBaggage);
        return currentLuggageTub;
    }

    private int getRandomInteger(int min, int max){
        return (int) Math.round(getRandomDouble(min, max));
    }

    private double getRandomDouble(int min, int max){
        if(min < max) return  (min + Math.random() * (max - min));
        return  (max + Math.random() * (min - max));
    }

    private String getRandomString(int length){
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));

        return generatedString;
    }
}
