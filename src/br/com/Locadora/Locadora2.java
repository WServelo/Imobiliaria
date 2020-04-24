package br.com.Locadora;

import java.util.List;

public class Locadora2 {

    private Tipo tipo;
    private int numeroCadartro;
    private double valor;
    private Regiao regiao;
    private int quarto;
    private int banheiro;
    private int garagem;


    private List<Imobiliaria> imobiliariaList;


    public List<Imobiliaria> getImobiliaria() {
        return imobiliariaList;
    }

    public void setImobiliaria(List<Imobiliaria> imobiliariaList) {
        this.imobiliariaList = imobiliariaList;
    }


    Locadora2(Tipo tipo, int numeroCadartro) {        this.tipo = tipo;    this.numeroCadartro = numeroCadartro;  }

    public Tipo getTipo() {        return tipo;    }

    public int getNumeroCadartro() {     return numeroCadartro;        }

    public void setValor(double valor) {        this.valor = valor;    }

    public double getValor() {        return valor;    }

    public void setRegiao(Regiao regiao) {        this.regiao = regiao;    }

    public Regiao getRegiao() {        return regiao;    }

    public int getQuarto() {        return quarto;    }

    public void setQuarto(int quarto) {        this.quarto = quarto;    }

    public int getBanheiro() {        return banheiro;    }

    public void setBanheiro(int banheiro) {        this.banheiro = banheiro;    }

    public int getGaragem() {        return garagem;    }

    public void setGaragem(int garagem) {        this.garagem = garagem;    }


    public String Imprime(){
        String imprime = "Cadastro: " + getNumeroCadartro() + " - O imovel para locação é um(a) " + getTipo() +
        " na região de " + getRegiao() + ", com " + getQuarto() + " quartos, " + getBanheiro() + " banheiros e " +
                getGaragem() + " vagas na garagem. O valor é de R$" + getValor() + " por mês.";
        return imprime;
    }
}
