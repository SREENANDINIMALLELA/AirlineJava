public enum FlightNumber {
    FR756("GSW","FRC"),
    BA2491("GSW","RUS"),
    BA1243("GSW","NWY"),
    BA1242("GSW","HYD"),
    BA1296("GSW","LDN"),
    BA1245("GSW","PRS");
    private final String destination;
    private final String departure;

    FlightNumber(String destination, String departure) {
        this.destination =destination;
        this.departure = departure;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }
}
