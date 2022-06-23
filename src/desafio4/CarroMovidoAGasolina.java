package desafio4;

public class CarroMovidoAGasolina extends Carro{

    private String tipoCombustivel;

    public CarroMovidoAGasolina() {
        super();
    }

    public CarroMovidoAGasolina(String modelo, String marca, String tipoCombustivel) {
        super(modelo, marca);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Carro A Gasolina: {" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
