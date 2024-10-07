package com.worldline.interview;

public class SteamEngine implements Engine{

    private boolean running = false;
    private SteamFuelType requiredFuelType;
    private static final int BATCH_SIZE = 2;
    private static final double WOOD_COST = 4.35;
    private static final double COAL_COST = 5.65;
    private double fuelLevel = 0;

    public SteamEngine(SteamFuelType fuelType,double fuelLevel) {
        this.requiredFuelType = fuelType;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        if (fuelLevel > 0) {
            running = true;
            System.out.println("Steam engine started with " + requiredFuelType);
        } else {
            throw new IllegalStateException("Fuel level must be greater than zero to start the steam engine.");
        }
    }

    @Override
    public void stop() {
        if (running) {
            running = false;
            System.out.println("Steam engine stopped.");
        }
    }

    @Override
    public double calculateBatchCost() {
        return requiredFuelType.equals(SteamFuelType.WOOD) ? WOOD_COST : COAL_COST;
    }

    @Override
    public int getBatchSize() {
        return BATCH_SIZE;
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}
