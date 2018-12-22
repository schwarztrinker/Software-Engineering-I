package Airport.Bulky_Baggage_Desk;

import Airport.Base.*;

public class BulkyBaggage extends Baggage {

    private BulkyBaggageType bulkyBaggageType;
    private BaggageIdentificationTag baggageIdentificationTag;


    public BulkyBaggage(String uuid, String comtent, BaggageSecurityStatus securityStatus, BulkyBaggageType bulkyBaggageType, BaggageIdentificationTag baggageIdentificationTag){
        super();

        this.uuid = uuid;
        this.content = comtent;
        this.securityStatus = securityStatus;

        this.bulkyBaggageType = bulkyBaggageType;
        this.baggageIdentificationTag = baggageIdentificationTag;

    }


    public BulkyBaggageType getBulkyBaggageType() {
        return bulkyBaggageType;
    }

    public void setBaggageIdentificationTag(BaggageIdentificationTag baggageIdentificationTag) {
        this.baggageIdentificationTag = baggageIdentificationTag;
    }

    public BaggageIdentificationTag getBaggageIdentificationTag(){return  baggageIdentificationTag;}


}
