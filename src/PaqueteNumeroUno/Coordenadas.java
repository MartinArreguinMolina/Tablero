package PaqueteNumeroUno;

import java.io.IOException;

public class Coordenadas {

    private int x = 1;
    private int y = 1;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[][] izquierda(int[][] mapa) {
        if (validar(mapa)) {
            mapa[getY()][getX()] = 3;
            return mapa;
        } else {
            return mapa;
        }
    }

    public int[][] derecha(int[][] mapa) {
        if (validar(mapa)) {
            mapa[getY()][getX()] = 4;
            return mapa;
        } else {
            return mapa;
        }
    }

    public int[][] arriba(int[][] mapa) {
        if (validar(mapa)) {
            mapa[getY()][getX()] = 5;
            return mapa;
        } else {
            return mapa;
        }
    }

    public int[][] abajo(int[][] mapa) {
        if (validar(mapa)) {
            mapa[getY()][getX()] = 6;
            return mapa;
        } else {
            return mapa;
        }
    }

    private boolean validar(int[][] mapa) {
        if (mapa[getY()][getX()] != 1) {
            return true;
        } else {
            return false;
        }
    }
}
