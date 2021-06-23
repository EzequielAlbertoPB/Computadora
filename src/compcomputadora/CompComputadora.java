/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compcomputadora;

import Componentes.CPU;
import Componentes.Computadora;
import Componentes.Monitor;
import Componentes.Mouse;
import Componentes.Teclado;

/**
 *
 * @author Pc
 */
public class CompComputadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora Gamer = new Computadora("HP", (int) 54673,
        new Monitor("LG", "QLED", (int) 32), 
        new Teclado("Logitech", "Escritorio", (int) 45, true), 
        new Mouse("Logitech", "Laser", "Inalambrico" ), 
        new CPU("Intel", "i7", (int) 32452626));
        
        System.out.println(Gamer);
        System.out.println("\nCARACTERISTICAS:\n"+"Marca:"+Gamer.getMarca()+"\tModelo:"+Gamer.getModelo()+"\n\nCOMPONENTES:\n.-.-.-.-.-Monitor:.-.-.-.-.-\n"+Gamer.getMonitor()+"\n.-.-.-.-.-Teclado:.-.-.-.-.-\n"+Gamer.getTeclado()+"\n.-.-.-.-.-Mouse:.-.-.-.-.-.-\n"+Gamer.getMouse()+"\n.-.-.-.-.-CPU:.-.-.-.-.-.-.-\n"+Gamer.getCpu());
       
        
    }
    
}
