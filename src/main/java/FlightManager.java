public class FlightManager {
    public FlightManager() {
    }

    public double getBaggageWeightOfEachPassenger(Flight flight) {

        double  totalBaggageWeight = flight.getPlaneWeight()/2;
       double  capacityOfFlight = flight.getPlaneCapacity();
        double  baggageWeightPerPerson = totalBaggageWeight/capacityOfFlight;
      return  baggageWeightPerPerson;
    }
}
