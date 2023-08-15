import entidades.Cuenta;
import servicios.CuentaServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CuentaServicio cs = new CuentaServicio();

        Cuenta c1 = cs.crearCuenta();

        cs.menu(c1);

    }

}