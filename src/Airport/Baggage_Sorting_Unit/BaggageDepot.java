package src.Airport.Baggage_Sorting_Unit;

import Airport.Base.Baggage;

import java.util.ArrayList;
import java.util.Collection;

public class BaggageDepot {

  private String uuid;

  private ArrayList<Baggage> baggageList;

  void store(Baggage baggage) {
    baggageList.add(baggage);
  }

  void storeAll(Collection<Baggage> baggage) {
    for (Baggage b : baggage) {
      store(b);
    }
  }

  /**
   * TODO: Definition normal vs Bulky
   *
   * @param ticketClassString What does this do?
   */
  ArrayList<Baggage> selectNormalBaggage(String ticketClassString) {

    return null;
  }

  /**
   * TODO: IDK
   */
  ArrayList<Baggage> selectBulkyBaggage() {

    return null;
  }
}
