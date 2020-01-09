import model.TransportGraph;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StationTest {
    protected TransportGraph.Builder builder;

    @BeforeEach
    public void setup() {
        builder = new TransportGraph.Builder();
    }

    @Test
    public void addLineTest() {
        String[] redLine = {"red", "metro", "A", "B", "C", "D"};
        builder.addLine(redLine);
    }
}
