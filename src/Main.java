import java.util.Scanner;

public class Main {
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        opcionesdeElmenu();
    }

    public static void opcionesdeElmenu() {
        int opcion;
        do {
            util.Elmenu();
            opcion = util.validaInt();

            switch (opcion) {
                case 1 -> Ejercicio1();
                case 2 -> Ejercicio2();
                case 3 -> Ejercicio3();
                case 4 -> Ejercicio4();
                case 5 -> Ejercicio1();

                default -> System.out.println("Opción no válida. Introduce un número del 1 al 5.");
            }

        } while (opcion != 0);
    }


    public static void Ejercicio1() {
        int opcion;
        do {
            System.out.println("Introduce un número: ");
            opcion = util.validaInt();

            if (ayu.numerosPrimos(opcion))
                System.out.println("El número no es primo");
            else {
                System.out.println("El número es primo");
            }

        } while (opcion != 0);
    }

    public static void Ejercicio2() {
        System.out.println("Introduce los dígitos del DNI a verificar");
        String a = sc.next();
        String b = a.substring(0, 8);
        String letra = String.valueOf(a.charAt(a.length() - 1));

        String letraValidada = ayu.calcularVerificacionDNI(Integer.parseInt(b));

        if (letra.equals(letraValidada)) {
            System.out.println("El DNI es correcto y la letra se corresponde con los números");
        } else {
            System.out.println("La letra no coincide con los números");
        }

    }

    public static void Ejercicio3() {
        System.out.println("Introduce X");
        int x = util.validaInt();
        System.out.println("Introduce Y");
        int y = util.validaInt();
        System.out.println("Introduce Z");
        int z = util.validaInt();

        if (ayu.calculoPitagoras(x, y, z))
            System.out.println("Los números sí se ajustan a la ecuación de Pitágoras");
        else if (!ayu.calculoPitagoras(x, y, z)) {
            System.out.println("Los números no se ajustan a la ecuación de Pitágoras");
        }
    }

    public static void Ejercicio4() {
        System.out.println("Introduce hasta que tabla de multiplicar imprimir");
        int num = util.validaInt();
        for (int i = 1; i <= num; i++) {
            ayu.tablasdeMultiplicar(i);
        }
    }

    public static void Ejercicio5() {
        ayu.menu();
    }

}