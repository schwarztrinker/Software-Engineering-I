package Airport.Bulky_Baggage_Desk;

import java.util.UUID;

public class BulkyBaggageDeskReceipt {
    private String uuid;
    private int bulkyBaggageDeskID;
    private int numberOfPassenger;
    private int numberOfBulkyBaggage;
    private int numberOfBaggageIdentificationTag;

    public BulkyBaggageDeskReceipt(int bulkyBaggageDeskId, int numberOfPassenger, int numberOfBulkyBaggage, int numberOfBaggageIdentificationTag){
        UUID uuid = UUID.randomUUID();
        this.uuid = uuid.toString();
        this.bulkyBaggageDeskID = bulkyBaggageDeskId;
        this.numberOfPassenger = numberOfPassenger;
        this.numberOfBulkyBaggage = numberOfBulkyBaggage;
        this.numberOfBaggageIdentificationTag = numberOfBaggageIdentificationTag;
    }

    public String getUuid() {
        return uuid;
    }

    public int getBulkyBaggageDeskID() {
        return bulkyBaggageDeskID;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public int getNumberOfBulkyBaggage() {
        return numberOfBulkyBaggage;
    }

    public int getNumberOfBaggageIdentificationTag() {
        return numberOfBaggageIdentificationTag;
    }
}
