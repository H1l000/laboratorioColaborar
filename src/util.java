public class util {
    public static void Elmenu() {
        System.out.println("Escoge un ejercicio");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t " + (i + 1) + ". Ejercicio " + (i + 1));
        }
    }

    public static int validaReal() {
        while (true) {
            if (Main.sc.hasNextInt()) {
                int num = Main.sc.nextInt();
                if (num >= 0) {
                    return num;
                } else {
                    System.out.println("El número debe ser mayor o igual a 0. Vuelve a intentarlo.");
                }
            } else {
                System.out.println("Eso no es un número real válido, vuelve a intentarlo");
                Main.sc.next();
            }
        }
    }

    public static double validaRDouble() {
        while (true) {
            if (Main.sc.hasNextDouble()) {
                double num = Main.sc.nextDouble();
                if (num >= 0) {
                    return num;
                } else {
                    System.out.println("El número debe ser mayor o igual a 0. Vuelve a intentarlo.");
                }
            } else {
                System.out.println("Eso no es un número válido, vuelve a intentarlo");
                Main.sc.next();
            }
        }
    }

    public static int validaInt() {
        while (!Main.sc.hasNextInt()) {
            System.out.println("Eso no es un número válido!");
            Main.sc.next();
        }
        return Main.sc.nextInt();
    }
}