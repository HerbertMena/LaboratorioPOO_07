package classes;

public class Resisente {
    private String nombre;
    private String apellidos;
    private int numeroDpt;
    private double saldoDeudor;
    private String numeroTelefono;
    private String correo;

    public Residente(){}

    public Resisente(String nombre, String apellidos, int numeroDpt, double saldoDeudor, String nuemroTelefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDpt = numeroDpt;
        this.saldoDeudor = saldoDeudor;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroDpt() {
        return numeroDpt;
    }

    public void setNumeroDpt(int numeroDpt) {
        this.numeroDpt = numeroDpt;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    public void setSaldoDeudor(double saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
