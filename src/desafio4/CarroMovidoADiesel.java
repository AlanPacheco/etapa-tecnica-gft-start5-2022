package desafio4;

public class CarroMovidoADiesel extends Carro{
    private String tipoCombustivel;

    public CarroMovidoADiesel() {
        super();
    }

    public CarroMovidoADiesel(String modelo, String marca, String tipoCombustivel) {
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
        return "Carro A Diesel{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
