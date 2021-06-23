/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author Pc
 */
public class Computadora {
    private String marca;
    private int modelo;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private CPU cpu;

    public Computadora() {
    }

    public Computadora(String marca, int modelo, Monitor monitor, Teclado teclado, Mouse mouse, CPU cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
        this.cpu = cpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + ", teclado=" + teclado + ", mouse=" + mouse + ", cpu=" + cpu + '}';
    }


}
