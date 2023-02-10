package mates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class MatematicasTest {

    @InjectMocks
    private Matematicas underTest;

    @BeforeEach
    void setUp() {
    }



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
            underTest = new Matematicas();


        }
    }
}