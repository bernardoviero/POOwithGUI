public class Veiculo {

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public String getAnoFabricacaoVeiculo() {
        return anoFabricacaoVeiculo;
    }

    public void setAnoFabricacaoVeiculo(String anoFabricacaoVeiculo) {
        this.anoFabricacaoVeiculo = anoFabricacaoVeiculo;
    }
    private String nomeVeiculo;
    private String corVeiculo;
    private String anoFabricacaoVeiculo;
    
    public Veiculo(){
        this.nomeVeiculo = "FUSCA";
        this.anoFabricacaoVeiculo = "1999";
        this.corVeiculo = "VERDE";
    }
}
