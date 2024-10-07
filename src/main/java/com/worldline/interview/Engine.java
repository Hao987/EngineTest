package com.worldline.interview;

public interface Engine {

    void start();
    void stop();
    double calculateBatchCost();
    int getBatchSize();
    boolean isRunning();
}
