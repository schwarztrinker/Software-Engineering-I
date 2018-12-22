package Airport.Checkin_Desk;

import Airport.Base.BoardingPass;
import Airport.Base.Passport;

public interface IReadingDevice {
    String version();
    boolean scan(Passport passport);
}
