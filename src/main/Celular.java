package main;

public class Celular implements iPrecedable<Celular>{

    private Integer numero;
    private Persona titular;

    public static int compPorNombre(Celular s1, Celular s2){
        return s1.titular.getNombre().compareTo(s2.titular.getNombre());
    }

    public static int compPorNumero(Celular s1, Celular s2){
        return -s1.numero.compareTo(s2.numero);
    }

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

    public static int precedeA(Celular c1, Celular c2){
        return c1.precedeA(c2);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular=" + titular +
                '}';
    }
}
