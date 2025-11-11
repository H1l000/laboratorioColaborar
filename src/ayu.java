public class ayu {

    public static boolean numerosPrimos(int a) {
        int contador = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                contador++;
            }
            if (contador > 1)
                return true;
        }
        return false;
    }

    public static String calcularVerificacionDNI(int numero) {

        String letrasValida = "TRWAGMYFPDXBNJZSQVHLCKE";

        return letrasValida.substring(numero % 23, (numero % 23 + 1));
    }

    public static boolean calculoPitagoras(int x, int y, int z) {
        int sumaCuadrados = (int) (Math.pow(x, 2) + Math.pow(y, 2));

        return sumaCuadrados == Math.pow(z, 2);

    }

    public static void tablasdeMultiplicar(int a) {
        int resultado;
        for (int j = 1; j <= 10; j++) {
            resultado = a * j;
            System.out.println(a + " * " + j + " = " + resultado);
        }
    }

    public static void menu() {
        int opcion;
        double radiou = 0;
        do {
            System.out.println("1. Circunferencia");
            System.out.println("2. Área");
            System.out.println("3. Volumen");
            System.out.println("4. Todas");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opción:");

            opcion = util.validaReal();

            switch (opcion) {
                case 1:
                    radiou = pideRadio();
                    System.out.println("La circunferencia es: " + Circunferencia(radiou));
                    break;
                case 2:
                    radiou = pideRadio();
                    System.out.println("El área es: " + Area(radiou));
                    break;
                case 3:
                    radiou = pideRadio();
                    System.out.println("El volumen es: " + Volumen(radiou));
                case 4:
                    radiou = pideRadio();
                    System.out.println("Circunferencia: " + Circunferencia(radiou)
                            + "\tVolumen: " + Volumen(radiou) + "\tÁrea: " + Area(radiou));

            }
        } while (opcion != 5);
    }


    public static double pideRadio() {
        System.out.println("Introduce un radio: ");
        return util.validaRDouble();
    }

    public static double Area(double radio) {

        return Math.PI * Math.pow(radio, 2);
    }

    public static double Circunferencia(double radio) {

        return 2 * Math.PI * radio;
    }

    public static double Volumen(double radio) {

        return ((double) 4 / 3) * Math.PI * Math.pow(radio, 3);
    }
}