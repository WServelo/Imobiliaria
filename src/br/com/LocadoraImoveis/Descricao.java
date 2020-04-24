package br.com.LocadoraImoveis;

public class Descricao {
    private TipoDescricao tipoDescricao;
    private double quantidade;

    public Descricao(TipoDescricao tipoDescricao){
        this.tipoDescricao = tipoDescricao;
    }

    public TipoDescricao getTipoDescricao() {
        return tipoDescricao;
    }

    public void setTipoDescricao(TipoDescricao tipoDescricao) {
        this.tipoDescricao = tipoDescricao;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }
}

