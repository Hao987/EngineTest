package com.worldline.interview;

public class InternalCombustionEngine implements Engine{

    private boolean running;
    private FuelType requiredFuelType;
    private static final int BATCH_SIZE = 8;
    private static final double PETROL_COST = 9.00;
    private static final double DIESEL_COST = 12.00;

    public InternalCombustionEngine(FuelType requiredFuelType) {
        this.requiredFuelType = requiredFuelType;
        running = false;
    }

    public void start() {
        if (requiredFuelType.equals(FuelType.PETROL) || requiredFuelType.equals(FuelType.DIESEL)) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    public void stop() {
        if(running) {running = false;}
    }

    @Override
    public double calculateBatchCost() {
        return requiredFuelType.equals(FuelType.PETROL) ? PETROL_COST : DIESEL_COST;
    }

    @Override
    public int getBatchSize() {
        return BATCH_SIZE;
    }

    public boolean isRunning() {
        return running;
    }

//    public void fill(FuelType fuelType, int fuelLevel) {
//        if (fuelLevel >= 0 && fuelLevel <= 100) {
//            this.fuelLevel = fuelLevel;
//        }
//        else if (fuelLevel > 100) {
//            this.fuelLevel = 100;
//        }
//        else {
//            this.fuelLevel = 0;
//        }
//
//        this.fuelType = fuelType;
//    }
}
