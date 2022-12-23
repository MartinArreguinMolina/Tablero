package PaqueteNumeroUno;

import java.io.*;

public class Main {

    public static void main(String... args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Main ob1 = new Main();
        String entrada;
        int[][] mapa;

        mapa = ob1.pedirDatos();

        ob1.menu(mapa);
    }

    public int[][] pedirDatos() throws IOException {
        int[][] mapa;

        Mapa ob1 = new Mapa();
        ob1.mapa();
        mapa = ob1.mapaConBordes();

        return mapa;
    }

    public void menu(int[][] mapa) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Coordenadas ob1 = new Coordenadas();

        int n = 0;
        int x = 1;
        int y = 1;

        String entrada;
        boolean v = false;

        System.out.println("ACTUALMENTE TE ENCUNTRAS EN LA POSICION NUMERO (1,1)");
        mapa[1][1] = 3;

        do {
            do {
                System.out.println("::::::::::Digita una opcion::::::::::"
                        + "\n1.Derecha"
                        + "\n2.Izquierda"
                        + "\n3.Abajo"
                        + "\n4.Arriba");
                System.err.print("R= ");
                try {
                    n = Integer.parseInt(entrada = bufer.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Debes de digitar un numero");
                }
            } while (n < 1 || n > 5);

            switch (n) {
                case 1:
                    x++;
                    x = validarDerecha(x, mapa.length);
                    ob1.setX(x);
                    mapa = ob1.izquierda(mapa);
                    break;
                case 2:
                    x--;
                    x = validarIzquierda(x);
                    ob1.setX(x);
                    mapa = ob1.derecha(mapa);
                    break;
                case 3:
                    y++;
                    y = validarAbajo(y , mapa.length);
                    ob1.setY(y);
                    mapa = ob1.arriba(mapa);
                    break;
                case 4:
                    y--;
                    y = validarArriba(y);
                    ob1.setY(y);
                    mapa = ob1.abajo(mapa);
                    break;
                case 5:
                    v = true;
                    break;
            }
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa.length; j++) {
                    System.out.print(mapa[i][j] + " ");
                }
                System.out.println("");
            }

        } while (v == false);

    }

    private int validarDerecha(int n, int m) {
        Main ob1 = new Main();

        if (n < m - 1) {
            return n;
        } else if (n == m - 1) {
            n--;
            return n;
        }

        return 0;
    }

    private int validarIzquierda(int n) {
        Main ob1 = new Main();

        if (n > 0) {
            return n;
        } else if (n == 0) {
            n++;
            return n;
        }

        return 0;
    }

    private int validarAbajo(int n, int m) {
        Main ob1 = new Main();

        if (n < m - 1) {
            return n;
        } else if (n == m - 1) {
            n--;
            return n;
        }

        return 0;
    }

    private int validarArriba(int n) {
        Main ob1 = new Main();

        if (n > 0) {
            return n;
        } else if (n == 0) {
            n++;
            return n;
        }

        return 0;
    }

}
