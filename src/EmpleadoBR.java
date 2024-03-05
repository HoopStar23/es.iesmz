public class EmpleadoBR {

    private static float salarioBase;

    public static float calcularSalarioBruto(TipoEmpleado tipo, float ventaMes, float horasExtras){
        if (tipo != null && ventaMes >= 0 && horasExtras >= 0) {
            if (tipo.name() == "VENDEDOR") {
                salarioBase = 1000;
            }else if (tipo.name() == "ENCARGADO"){
                salarioBase = 1500;
            }

            if (ventaMes >= 1500) {
                salarioBase += 200;
            }else if (ventaMes >= 1000){
                salarioBase += 100;
            }


            for (int i = 0; i < horasExtras; i++) {
                salarioBase += 20;
            }

            return salarioBase;
        }else{
            return -1;
        }
    }

    public static float calcularSalarioNeto(float salarioBruto){
        if (salarioBruto >= 0) {
            float retencion = 0;
            if (salarioBruto >= 1000 && salarioBruto < 1500) {
                retencion = 16f;
            }else if (salarioBruto >= 1500){
                retencion = 18f;
            }
            return (salarioBruto*(1-(retencion/100)));
        }else{
            return -1;
        }
    }
}
