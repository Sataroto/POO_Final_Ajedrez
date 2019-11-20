/**
 **nombre: Gerardo Ayala, Aldo Morales
 * tema del prgrama: Proyecto Final
 * descripci�n: Juego de Ajedrez en Java
 * fecha: 17/11/2019
 */

// PAQUETES E IMPORTES

package PF_Ajedrez;


public abstract class Ficha {
    // ATRIBUTOS
    private String color;
    private int X;
    private int Y;
    
    // CONSTRUCTORES:
    // CONSTRUCTOR POR DEFAULT
    public Ficha(){
        this.color="gris";
    }
    //construcotor de ficha vacia;{
    // CONSTRUCTOR INICIALIZADOR
    public Ficha(String C, int X, int Y){
        setColor(C);
        setX(X);
        setY(Y);
    }
    // MÉTODOS DE ACCESO
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }
    
    //Métodos abstractos
    public abstract String Mover(int X, int Y);
    public abstract void Comer(int X, int Y);
    public abstract boolean canMove(int X, int Y);
        // MÉTODOS

    

    
    //

    

} // End class
