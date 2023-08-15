package servicios;

import entidades.Cuenta;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CuentaServicio {

    Scanner sc = new Scanner(System.in);
    DecimalFormat puntosMiles = new DecimalFormat("###,###,###,###,###.##");

    public Cuenta crearCuenta(){

        Cuenta c1 = new Cuenta();

        System.out.println("Ingresa el número de cuenta");
        c1.setNumeroCuenta(sc.nextInt());

        System.out.println("Ingresa el número de DNI del Cliente");
        c1.setDniCliente(sc.nextLong());

        System.out.println("Ingresa el saldo actual del Cliente");
        c1.setSaldoActual(sc.nextInt());

        return c1;

    }

    public void menu(Cuenta c1){
        int opcion;
        boolean salir = false;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1: Ingresar monto");
            System.out.println("2: Retirar monto");
            System.out.println("3: Extracción rápida");
            System.out.println("4: Consultar Saldo");
            System.out.println("5: Consultar Datos");
            System.out.println("6: Salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1: ingresarSaldo(c1);
                salir = false;
                break;
                case 2: retirarDinero(c1);
                break;
                case 3: retirarRapido(c1);
                break;
                case 4: consultarSaldo(c1);
                break;
                case 5: consultarDatos(c1);
                break;
                case 6:  salir = true;
                break;

            }

        } while (!salir);

        System.out.println("Gracias por visitarnos, vuelve pronto.");


    }

    public double ingresarSaldo(Cuenta c1) {

        System.out.println("Ingresa la cantidad que quieres añadir al saldo actual");

        double ingresoSaldo = sc.nextDouble();

        while (ingresoSaldo < 0) {
            System.out.println("La cantidad debe ser un número positivo");
            ingresoSaldo = sc.nextDouble();
        }

        c1.setSaldoActual(ingresoSaldo + c1.getSaldoActual());

        return c1.getSaldoActual();

    }

    public double retirarDinero(Cuenta c1) {

        System.out.println("Ingresa la cantidad de dinero a retirar");

        double cantidadRetiro = sc.nextDouble();

        while (cantidadRetiro < 0) {
            System.out.println("La cantidad debe ser un número positivo");
            cantidadRetiro = sc.nextDouble();
        }

        if (cantidadRetiro > c1.getSaldoActual()) {
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - cantidadRetiro);
        }

        return c1.getSaldoActual();

    }

    public long retirarRapido(Cuenta c1) {

        long retiroRapido = (long) (c1.getSaldoActual() * 0.20);
        String respuestaRetiro;

        System.out.println("Lo que puede retirar rapidamente es USD " + puntosMiles.format(retiroRapido));

        do {
            System.out.println("¿Deseas retirarlo? S/N");
             respuestaRetiro = sc.next();
        }  while (!respuestaRetiro.equalsIgnoreCase("s") && !respuestaRetiro.equalsIgnoreCase("n") );


        if (respuestaRetiro.equalsIgnoreCase("s")) {
            c1.setSaldoActual(c1.getSaldoActual() - retiroRapido);
        } else if (respuestaRetiro.equalsIgnoreCase("n")) {
            c1.setSaldoActual(c1.getSaldoActual());
        }

        return (long) c1.getSaldoActual();
    }

    public void consultarSaldo(Cuenta c1) {

        System.out.println("Su saldo es USD " + (puntosMiles.format(c1.getSaldoActual())));

    }

    public void consultarDatos(Cuenta c1) {

        System.out.println("Los datos de la cuenta son: ");
        System.out.println("Número de cuenta " + c1.getNumeroCuenta());
        System.out.println("Número de DNI: " + c1.getDniCliente());
        System.out.println("Saldo actual: USD " + (puntosMiles.format(c1.getSaldoActual())));

    }

}
