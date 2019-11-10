public class FlightManager {
   private double  totalBaggageWeight;
    private double  capacityOfFlight;
    double  passengersFilledBaggage;

    public FlightManager() {
    }

    public double getBaggageWeightOfEachPassenger(Flight flight) {

          this.totalBaggageWeight = flight.getPlaneWeight()/2;
          this.capacityOfFlight = flight.getPlaneCapacity();
          double  baggageWeightPerPerson = totalBaggageWeight/capacityOfFlight;
      return  baggageWeightPerPerson;
    }

    public double getRemainingBaggageWeight(Flight flight) {
        passengersFilledBaggage = getFilledPassengersBaggageWeight(flight);
         double remainingBaggageWeight = totalBaggageWeight-passengersFilledBaggage;
        return remainingBaggageWeight;
    }

    public double  getFilledPassengersBaggageWeight(Flight flight) {
        getBaggageWeightOfEachPassenger(flight);
        passengersFilledBaggage = (totalBaggageWeight/capacityOfFlight) * flight.getPassengers().size();
        return passengersFilledBaggage ;
    }
}
