package com.example.ejercicio11;

public class Operacion {
    private double n1;
    private double n2;
    private int signo;
    private double resultado;

    public Operacion(double n1, int signo, double n2){
        this.n1 = n1;
        this.n2 = n2;
        this.signo = signo;
        switch(this.signo){
            case 1:
                this.resultado = this.n1 + this.n2;
                break;
            case 2:
                this.resultado = this.n1 - this.n2;
                break;
            case 3:
                this.resultado = this.n1 / this.n2;
                break;
            case 4:
                this.resultado = this.n1 * this.n2;
                break;
        }
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int signo) {
        this.signo = signo;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
