package com.worldline.interview;

public class Test {
    public static void main(String[] args) {
        // Test Internal Combustion Engine with petrol
        Engine internalCombustionEngine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine widgetMachine1 = new WidgetMachine(internalCombustionEngine);
        System.out.println("Cost of producing 16 widgets: £" + widgetMachine1.produceWidgets(16));

        // Test Steam Engine with wood
        Engine steamEngine = new SteamEngine(SteamFuelType.WOOD,10); // Ensure fuel level > 0
        WidgetMachine widgetMachine2 = new WidgetMachine(steamEngine);
        System.out.println("Cost of producing 5 widgets: £" + widgetMachine2.produceWidgets(5));
    }
}
