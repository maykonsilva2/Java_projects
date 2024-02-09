package Enum;

public class Pizza {

    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED,
        READY,
        DELIVERED;

        private int timeToDelivery;
        public void setTimeToDelivery(int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }


    // Set and Get methods
    public void setStatus(PizzaStatus status) {
        this.status = status;
    }
    public PizzaStatus getStatus() {
        return this.status;
    }
}
