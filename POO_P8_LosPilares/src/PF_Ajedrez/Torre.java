/**
 **nombre: Gerardo Ayala, Aldo Morales
 * tema del prgrama: Proyecto Final
 * descripci�n: Juego de Ajedrez en Java
 * fecha: 17/11/2019
 */

// PAQUETES E IMPORTES

package PF_Ajedrez;


public class Torre extends Reina{
    // ATRIBUTOS
    private boolean itsEnroque;
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
    
    // Enroque
    public void Enroque(){
     
    }
    
} // End class
