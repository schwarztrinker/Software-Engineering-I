package src.Airport.Baggage_Sorting_Unit;

import java.util.ArrayList;

public class ContainerLifterReceipt {
    private String uuid;
    private String id;
    private String type;
    private IBaggageSortingUnit baggageSortingUnit;
    private ArrayList<Airport.Base.Baggage> selectedBaggageList;

    public ContainerLifterReceipt(String uuid,String id, String type,IBaggageSortingUnit baggageSortingUnit,ArrayList<Airport.Base.Baggage> selectedBaggageList){
        this.uuid=uuid;
        this.id=id;
        this.type=type;
        this.baggageSortingUnit=baggageSortingUnit;
        this.selectedBaggageList=selectedBaggageList;
    }
}
