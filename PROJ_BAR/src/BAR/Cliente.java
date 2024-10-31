package BAR;

public class Cliente {
	public String sexo;
    public int qtdBreja;
    public int qtdRefri;
    public int qtdEspetinhos;

    public Cliente(String sexo, int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        this.sexo = sexo;
        this.qtdBreja = qtdCervejas;
        this.qtdRefri = qtdRefrigerantes;
        this.qtdEspetinhos = qtdEspetinhos;
    }

    public String getSexo() {
        return sexo;
    }

    public int getQtdCervejas() {
        return qtdBreja;
    }

    public int getQtdRefrigerantes() {
        return qtdRefri;
    }

    public int getQtdEspetinhos() {
        return qtdEspetinhos;
    }
}
