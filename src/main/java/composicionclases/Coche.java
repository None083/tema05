/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicionclases;

/**
 *
 * @author noelia
 */
public class Coche {
    
    //4 ruedas
    //motor
    //puertas
    //chasis
    
    private Rueda delanteraDerecha;
    private Rueda delanteraIzquierda;
    private Rueda traseraDerecha;
    private Rueda traseraIzquierda;
    private Motor motor;
    private Puerta puertaPiloto;
    private Puerta puertaCopiloto;
    private String matricula;

    public Coche(Rueda delanteraDerecha, Rueda delanteraIzquierda, Rueda traseraDerecha, Rueda traseraIzquierda, Motor motor, Puerta puertaPiloto, Puerta puertaCopiloto, String matricula) {
        this.delanteraDerecha = delanteraDerecha;
        this.delanteraIzquierda = delanteraIzquierda;
        this.traseraDerecha = traseraDerecha;
        this.traseraIzquierda = traseraIzquierda;
        this.motor = motor;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
        this.matricula = matricula;
    }

    public Rueda getDelanteraDerecha() {
        return delanteraDerecha;
    }

    public void setDelanteraDerecha(Rueda delanteraDerecha) {
        this.delanteraDerecha = delanteraDerecha;
    }

    public Rueda getDelanteraIzquierda() {
        return delanteraIzquierda;
    }

    public void setDelanteraIzquierda(Rueda delanteraIzquierda) {
        this.delanteraIzquierda = delanteraIzquierda;
    }

    public Rueda getTraseraDerecha() {
        return traseraDerecha;
    }

    public void setTraseraDerecha(Rueda traseraDerecha) {
        this.traseraDerecha = traseraDerecha;
    }

    public Rueda getTraseraIzquierda() {
        return traseraIzquierda;
    }

    public void setTraseraIzquierda(Rueda traseraIzquierda) {
        this.traseraIzquierda = traseraIzquierda;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche{" + "delanteraDerecha=" + delanteraDerecha + ", delanteraIzquierda=" + delanteraIzquierda + ", traseraDerecha=" + traseraDerecha + ", traseraIzquierda=" + traseraIzquierda + ", motor=" + motor + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + ", matricula=" + matricula + '}';
    }
    
    
    
}
