package com.worldline.interview;

public class WidgetMachine {
//    private InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
    private Engine engine;

    public WidgetMachine(Engine engine) {
        this.engine = engine;
    }

    public double produceWidgets(int quantity) {
        if (!engine.isRunning()) {
            engine.start();
        }

        int batches = (int) Math.ceil((double) quantity / engine.getBatchSize());
        double cost = batches * engine.calculateBatchCost();

        engine.stop();
        return cost;
    }
}
