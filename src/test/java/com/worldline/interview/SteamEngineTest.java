import com.worldline.interview.*;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class SteamEngineTest {

    @Test
    public void testStartEngineWithFuel() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        engine.start();
        assertTrue(engine.isRunning(), "Engine should be running after start");
    }

    @Test
    public void testStopEngine() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        engine.start();
        engine.stop();
        assertFalse(engine.isRunning(), "Engine should not be running after stop");
    }

    @Test
    public void testWoodBatchCost() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        assertEquals(4.35, engine.calculateBatchCost(), "Cost should be 4.35 for wood");
    }

    @Test
    public void testCoalBatchCost() {
        SteamEngine engine = new SteamEngine(SteamFuelType.COAL, 5);
        assertEquals(5.65, engine.calculateBatchCost(), "Cost should be 5.65 for coal");
    }

    @Test
    public void testBatchSize() {
        SteamEngine engine = new SteamEngine(SteamFuelType.WOOD, 5);
        assertEquals(2, engine.getBatchSize(), "Batch size should be 2 for steam engine");
    }

    @Test
    public void testStartEngineWithoutFuelThrowsException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            new SteamEngine(SteamFuelType.WOOD, 0).start();
        });
        assertEquals("Fuel level must be greater than zero to start the steam engine.", exception.getMessage());
    }
}

