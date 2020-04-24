package br.com.LocadoraImoveis;

import java.util.List;

public class Imoveis {
    private int cadastro;
    private Tipo tipo;
    private List<Descricao> descricaos;

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public List<Descricao> getDescricaos() {
        return descricaos;
    }

    public void setDescricaos(List<Descricao> descricaos) {
        this.descricaos = descricaos;
    }


    void deposita(TipoDescricao tipoDescricao, double valor) {

        for (int i = 0; i < descricaos.size(); i++) {

            Descricao item = descricaos.get(i);

            if (item.getTipoDescricao() == tipoDescricao) {
                double novoSaldo = item.getQuantidade() + valor;
                item.setQuantidade(novoSaldo);
                break;
            }

        }

    }

    boolean saca(TipoDescricao tipoDescricao, double valor) {
        boolean saca = false;
        for (int i = 0; i < descricaos.size(); i++) {
            Descricao item = descricaos.get(i);
            if (item.getQuantidade() >= valor) {
                if (item.getTipoDescricao() == tipoDescricao) {
                    double novoSaldo = item.getQuantidade() - valor;
                    item.setQuantidade(novoSaldo);
                    saca = true;
                    break;
                }

            } else {
                System.out.println("Saldo Insuficiente!!!");
                break;
            }

        }
        return saca;

    }

    boolean transfereBeneficioParaOutroBeneficiario(Imoveis imoveisDestino,
                                                    TipoDescricao tipoDescricao, double valor) {
        boolean resultado = false;
        boolean retornoSaca = this.saca(tipoDescricao, valor);
        if (retornoSaca) {
            imoveisDestino.deposita(tipoDescricao, valor);
            resultado = true;
        } else {
            System.out.println("Saldo insuficiente no " + imoveisDestino + "para realizar essa transferência");
        }

        return resultado;
    }

    boolean transfereBeneficio(TipoDescricao tipoDescricaoOrigem, TipoDescricao tipoDescricaoDestino, double valor) {
        boolean resultado = false;
        boolean saqueRealizado = saca(tipoDescricaoOrigem, valor);
        if (saqueRealizado) {
            deposita(tipoDescricaoDestino, valor);
            resultado = true;
        } else {
            System.out.println("Saldo insuficiente no " + tipoDescricaoOrigem + " para realizar essa transferência");
        }
        return resultado;
    }

}
