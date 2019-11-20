/**
 **nombre: Gerardo Ayala, Aldo Morales
 * tema del prgrama: Proyecto Final
 * descripci�n: Juego de Ajedrez en Java
 * fecha: 17/11/2019
 */


// PAQUETES E IMPORTES

package PF_Ajedrez;


public class Caballo extends Ficha{
    // ATRIBUTOS
    // CONSTRUCTORES:
    public Caballo(){
    }

    // CONSTRUCTOR POR DEFAULT
    public Caballo(String C, int X, int Y) {    
        super(C, X, Y);
    }
    // CONSTRUCTOR INICIALIZADOR
    // MÉTODOS DE ACCESO
    // MÉTODOS
    @Override
    public void Comer(int X, int Y) {
        if(this.canMove(X, Y)){//Verificamos para ver si se puede mover en esa direccion
           this.setX(X);
           this.setY(Y);
        }
    }
   
    @Override
    public String Mover(int X, int Y){
        return "Esta madre cambia";
    }
    @Override
    public boolean canMove(int X, int Y){
        return false;
    }

} // End class
