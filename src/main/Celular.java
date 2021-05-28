package main;

public class Celular implements iPrecedable<Celular>{

    private Integer numero;
    private Persona titular;


    public Celular(Integer numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.titular.precedeA(celular.titular);
    }

    public int compPorNombre(Celular c){
        return this.titular.getNombre().compareTo(c.titular.getNombre());
    }

    public int compPorNumero(Celular c){
        return -this.numero.compareTo(c.numero);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular=" + titular +
                '}';
    }
}
