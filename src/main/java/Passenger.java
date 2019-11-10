public class Passenger {
    private String name ;
    private int numberOfBags;
    private Flight bookedFlight;
    private int seatNumber;
    public Passenger(String name , int numberOfBags) {
        this.name= name ;
        this.numberOfBags=numberOfBags;
        this.bookedFlight=null;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfBags(){
        return numberOfBags;
    }

    public void setBookedFlight(Flight bookedFlight) {
        this.bookedFlight = bookedFlight;
    }

    public String getflightNumber() {
      return  bookedFlight.getflightNumber();
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
