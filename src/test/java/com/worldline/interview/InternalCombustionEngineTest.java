import com.worldline.interview.*;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class InternalCombustionEngineTest {


    @Test
    public void testStartAndStopEngine() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        engine.start();
        assertTrue(engine.isRunning(), "Engine should be running after start");
        engine.stop();
        assertFalse(engine.isRunning(), "Engine should not be running after stop");
    }

    @Test
    public void testPetrolBatchCost() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        assertEquals(9.00, engine.calculateBatchCost(), "Cost should be 9.00 for petrol");
    }

    @Test
    public void testDieselBatchCost() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.DIESEL);
        assertEquals(12.00, engine.calculateBatchCost(), "Cost should be 12.00 for diesel");
    }

    @Test
    public void testBatchSize() {
        InternalCombustionEngine engine = new InternalCombustionEngine(FuelType.PETROL);
        assertEquals(8, engine.getBatchSize(), "Batch size should be 8 for internal combustion engine");
    }
}


