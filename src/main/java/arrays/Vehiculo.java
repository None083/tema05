/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 */
public class Vehiculo {

    private String bastidor;
    private String matricula;
    private Color color;
    private Modelo modelo; //marca y modelo
    private boolean disponible;
    private double tarifa;
    private static int contador = 0;

    public Vehiculo() {
        this.bastidor = String.valueOf(++contador);
        this.matricula = RandomStringUtils.randomNumeric(4) + " "
                + RandomStringUtils.randomAlphabetic(3);
        this.color = Color.getAleatorio();
        this.modelo = Modelo.getAleatorio();
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.bastidor);
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + Objects.hashCode(this.modelo);
        hash = 97 * hash + (this.disponible ? 1 : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.tarifa) ^ (Double.doubleToLongBits(this.tarifa) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        if (this.disponible != other.disponible) {
            return false;
        }
        if (Double.doubleToLongBits(this.tarifa) != Double.doubleToLongBits(other.tarifa)) {
            return false;
        }
        if (!Objects.equals(this.bastidor, other.bastidor)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        return this.modelo == other.modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "bastidor=" + bastidor + ", matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + ", disponible=" + disponible + ", tarifa=" + tarifa + '}';
    }

}
