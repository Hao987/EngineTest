import com.worldline.interview.*;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class WidgetMachineTest {

    @Test
    public void testProduceWidgetsWithInternalCombustionEngine() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        WidgetMachine machine = new WidgetMachine(engine);
        double cost = machine.produceWidgets(16); // Should produce 2 batches
        System.out.println(cost);
        assertEquals(18.00,cost,"Cost should be £18.00 for 16 widgets using petrol");
    }

    @Test
    public void testProduceWidgetsWithSteamEngine() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        WidgetMachine machine = new WidgetMachine(engine);
        double cost = machine.produceWidgets(5); // Should produce 3 batches
        assertEquals(13.05, cost, "Cost should be £13.05 for 5 widgets using wood");
    }

    @Test
    public void testEngineStartsAndStopsAutomatically() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        WidgetMachine machine = new WidgetMachine(engine);
        machine.produceWidgets(4);
        assertFalse(engine.isRunning(), "Engine should stop after producing widgets");
    }


}