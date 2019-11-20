/**
 **nombre: Gerardo Ayala, Aldo Morales
 * tema del prgrama: Proyecto Final
 * descripci�n: Juego de Ajedrez en Java
 * fecha: 17/11/2019
 */


// PAQUETES E IMPORTES

package PF_Ajedrez;


public class Rey extends Ficha{
    // ATRIBUTOS
    // CONSTRUCTORES:
 
    // CONSTRUCTOR POR DEFAULT

    // CONSTRUCTOR INICIALIZADOR

    // MÉTODOS DE ACCESO

    // MÉTODOS
    @Override
    public void Comer(int X, int Y){
        System.out.println("Esta madre cambia");
    }
   
    @Override
    public String Mover(int X, int Y){
        return "Esta madre cambia";
    }
    
    public boolean sentidoAracnido(){
        
        boolean SA = false;
        return SA;
    }
    
    public void Enroque(){
        
    }

    @Override
    public boolean canMove(int X, int Y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

} // End class
