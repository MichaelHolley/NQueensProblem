package NQueensSolver;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NQueensSolverTest {

    @Test
    public void solve() {
        NQueensSolver solver_2 = new NQueensSolver(2);
        assertEquals(0, solver_2.getSolutions());

        NQueensSolver solver_3 = new NQueensSolver(3);
        assertEquals(0, solver_3.getSolutions());

        NQueensSolver solver_4 = new NQueensSolver(4);
        assertEquals(2, solver_4.getSolutions());

        NQueensSolver solver_5 = new NQueensSolver(5);
        assertEquals(10, solver_5.getSolutions());

        NQueensSolver solver_8 = new NQueensSolver(8);
        assertEquals(92, solver_8.getSolutions());

        NQueensSolver solver_13 = new NQueensSolver(13);
        assertEquals(73712, solver_13.getSolutions());
    }
}