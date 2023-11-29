package Recursos;

public class Vehiculo {
    
    private String marca;

    private String modelo;

    private String matricula;
    
    private String dniCliente;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, String matricula, String dniCliente) {

            this.marca = marca;
            this.modelo = modelo;
            this.matricula = matricula;
            this.dniCliente = dniCliente;
    }

    public String getMarca() {
            return marca;
    }

    public void setMarca(String marca) {
            this.marca = marca;
    }

    public String getModelo() {
            return modelo;
    }

    public void setModelo(String modelo) {
            this.modelo = modelo;
    }

    public String getMatricula() {
            return matricula;
    }

    public void setMatricula(String matricula) {
            this.matricula = matricula;
    }
    
    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", dniCliente=" + dniCliente + '}';
    }

    

}