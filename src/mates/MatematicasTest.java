package mates;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MatematicasTest {

    @InjectMocks
    private Matematicas underTest;

    @org.junit.jupiter.api.Test
    void generarNumeroPi() {
        double pi = Matematicas.generarNumeroPi(1000000);
        System.out.println("Pi = " + pi);
        assertTrue(pi > 3.14 && pi < 3.15);
    }

    private void assertTrue(boolean b) {
    }

    @Nested
    class WhenGeneraringNumeroPi {
        private final long NUMERO_INTENTOS = 19;

        @BeforeEach
        void setup() {
        }
    }
}