import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmpleadoBRTest {

    @BeforeEach
    public void mensaje(){
        System.out.println("EJECUTO PRUEBA");
    }

    @Test
    public void testCalcularSalarioBruto1(){
        //ARRANGE
                float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.VENDEDOR, 2000, 8);
                float resultadoEsperado = 1360;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto2(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.VENDEDOR, 1500, 3);
        float resultadoEsperado = 1260;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }
    @Test
    public void testCalcularSalarioBruto3(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.VENDEDOR, 1499.99f, 0);
        float resultadoEsperado = 1100;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }
    @Test
    public void testCalcularSalarioBruto4(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.ENCARGADO, 1250, 8);
        float resultadoEsperado = 1760;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }
    @Test
    public void testCalcularSalarioBruto5(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.ENCARGADO, 1000, 0);
        float resultadoEsperado = 1600;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto6(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3);
        float resultadoEsperado = 1560;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto7(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.ENCARGADO, 500, 0);
        float resultadoEsperado = 1500;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto8(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.ENCARGADO, 0, 8);
        float resultadoEsperado = 1660;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto9(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.VENDEDOR, -1, 8);
        float resultadoEsperado = -1;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto10(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(TipoEmpleado.VENDEDOR, 1500, -1);
        float resultadoEsperado = -1;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioBruto11(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioBruto(null, 1500, 8);
        float resultadoEsperado = -1;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto1(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(2000);
        float resultadoEsperado = 1640;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto2(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1500);
        float resultadoEsperado = 1230;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto3(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto4(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1250);
        float resultadoEsperado = 1050;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto5(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(1000);
        float resultadoEsperado = 840;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto6(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto7(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(500);
        float resultadoEsperado = 500;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto8(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(0);
        float resultadoEsperado = 0;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }

    @Test
    public void testCalcularSalarioNeto9(){
        //ARRANGE
        float resultadoReal = EmpleadoBR.calcularSalarioNeto(-1);
        float resultadoEsperado = -1;
        //ASSERT
        assertEquals(resultadoEsperado, resultadoReal,0.01);
    }
}
