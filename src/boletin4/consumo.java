package boletin4;

public class consumo {

    private double km; //kilometros recorridos
    private double li; //litros consumidos
    private double vMed; //velocidad media
    private double pGas; //prezo gasolina

    public consumo() {
    }

    public consumo(double km, double litros, double vMed, double pGas) {
        this.km = km;
        li = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public double getTempo() {
        return km / vMed;
    }

    public double consumoMedio() {
        return (li*100)/km;
    }

    public double consumoEuros() {
        return (pGas*100)/km;
    }

    public void setKm(double k) {
        km=k;
    }
    public double getKm(){
        return km;
    }

    public void setLitros(double l) {
        li=l;
    }
    public double getLitros(){
        return li;
    }

    public void setVMed(double m) {
        vMed=m;
    }
    public double getVMed(){
        return vMed;
    }

    public void setPGas(double p) {
        pGas=p;
    }
    public double getPGas(){
        return pGas;
    }
    
}
