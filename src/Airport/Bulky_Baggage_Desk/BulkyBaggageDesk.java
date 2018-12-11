package Airport.Bulky_Baggage_Desk;

public class BulkyBaggageDesk {

    private String uuid;
    private SecurityCheckID securityCheckID;
    private Airport airport;
    private List<Employee> employeeList;
    private FederalPoliceOfficer policeOfficer;
    private List<String> scanPatternList;
    private IBaggageScanner baggageScanner;
    private IBodyScanner bodyScanner;
    private IExplosivesDetector explosivesDetector;
    private FederalPolice federalPolice;

}
