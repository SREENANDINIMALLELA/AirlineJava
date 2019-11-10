public enum PlaneType {
    BOEING747(1000,50),
    BOEING737(3200,40);
//    BOEING787(30000,30),
//    BOEING767(20000,20),
//    CESSNA172(10000,10),
//    CIRRUSSR22(7000,8),
//    PIPERJ3CUB(5000,5),
//    BOEING777(400,3);


    private final double weight;
    private final int capacity;

    PlaneType(double weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public double getWeight(){
        return  this.weight ;
    }
    public int getCapacity(){
        return this.capacity;
    }

}
