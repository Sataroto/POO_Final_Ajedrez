/**
 **nombre: Gerardo Ayala, Aldo Morales
 * tema del prgrama: Proyecto Final
 * descripci�n: Juego de Ajedrez en Java
 * fecha: 17/11/2019
 */

// PAQUETES E IMPORTES

package PF_Ajedrez;


public class Reina extends Ficha{




    // ATRIBUTOS
    // CONSTRUCTORES:
    // CONSTRUCTOR POR DEFAULT
        public Reina() {
    }
    // CONSTRUCTOR INICIALIZADOR
     public Reina(String C, int X, int Y) {
        super(C, X, Y);
    }

    // MÉTODOS DE ACCESO

    // MÉTODOS
    @Override
    public String Mover(int X, int Y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Comer(int X, int Y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canMove(int X, int Y) {
        boolean primerCondicion=false;
        if(X==this.getX()&&Y>this.getY())//Movimiento hacia arriba
            return primerCondicion=true;
        else if(X>this.getX()&&Y>this.getY())//Movimiento hacia diagonal derecha arriba
            return primerCondicion=true;
        else if(X>this.getX()&&Y==this.getY())//movimiento derecha
            return primerCondicion=true;
        else if(X>this.getX()&&Y<this.getY())//movimiento hacia diagonal derecha abajo
            return primerCondicion=true;
        else if(X==this.getX()&&Y<this.getY())//Movimiento hacia Abajo
            return primerCondicion=true;
        else if(X<this.getX()&&Y<this.getY())//Movimiento Hacia diagaonal izquierda abajo 
            return primerCondicion=true;
        else if(X<this.getX()&&Y==this.getY())//Movimiento hacia izquierda
            return primerCondicion=true;
        else if(X<this.getX()&&Y>this.getY())//Movimiento hacia diagonal izquierda arriba
            return primerCondicion=true;
        else //Significa que no es valido el movimiento
            return primerCondicion=true;
    }
    

} // End class
