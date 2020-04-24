package br.com.LocadoraImoveis;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Imoveis imovel0 = new Imoveis();
        Imoveis imovel1 = new Imoveis();
        Imoveis imovel2 = new Imoveis();

        imovel0.setTipo(Tipo.Apartamento);
        imovel0.setCadastro(1);

        List<Descricao> descricaos = new ArrayList<>();
        Descricao quarto = new Descricao(TipoDescricao.quarto);
        quarto.setQuantidade(1);

        Descricao banheiro = new Descricao(TipoDescricao.banheiro);
        banheiro.setQuantidade(2);

        Descricao garagem = new Descricao(TipoDescricao.garagem);
        garagem.setQuantidade(1);

        descricaos.add(quarto);
        descricaos.add(banheiro);
        descricaos.add(garagem);


        imovel0.setDescricaos(descricaos);

        imovel0.saca(TipoDescricao.quarto, 50);

        descricaos = new ArrayList<>();
        imovel1.setTipo(Tipo.Casa);
        imovel1.setCadastro(2);

        quarto = new Descricao(TipoDescricao.quarto);
        banheiro = new Descricao(TipoDescricao.banheiro);
        garagem = new Descricao(TipoDescricao.garagem);

        quarto.setQuantidade(200);
        banheiro.setQuantidade(210);
        garagem.setQuantidade(220);

        descricaos.add(quarto);
        descricaos.add(banheiro);
        descricaos.add(garagem);

        imovel1.setDescricaos(descricaos);

        imovel1.deposita(TipoDescricao.garagem, 20);

        descricaos = new ArrayList<>();
        imovel2.setTipo(Tipo.Casa);
        imovel2.setCadastro(3);

        quarto = new Descricao(TipoDescricao.quarto);
        banheiro = new Descricao(TipoDescricao.banheiro);
        garagem = new Descricao(TipoDescricao.garagem);

        quarto.setQuantidade(300);
        banheiro.setQuantidade(310);
        garagem.setQuantidade(320);

        descricaos.add(quarto);
        descricaos.add(banheiro);
        descricaos.add(garagem);

        imovel2.setDescricaos(descricaos);

        imovel2.saca(TipoDescricao.banheiro, 100);

        imovel2.deposita(TipoDescricao.garagem, 100);


        boolean resultadoTransferenciaParaOutroBeneficiario = imovel1.transfereBeneficioParaOutroBeneficiario(imovel0, TipoDescricao.quarto, imovel1.getDescricaos().get(0).getQuantidade());
        if (resultadoTransferenciaParaOutroBeneficiario) {
            System.out.println("Transferencia Realizada");
        } else {
            System.out.println("Transferencia nao realizada");
        }


        boolean resultadoTransferencia = imovel2.transfereBeneficio(TipoDescricao.banheiro, TipoDescricao.garagem, imovel2.getDescricaos().get(1).getQuantidade());
        if (resultadoTransferencia) {
            System.out.println("Transferencia Realizada");
        } else {
            System.out.println("Transferencia nao realizada");
        }

        exibeValoresBeneficios(imovel0, imovel1, imovel2);

    }

    private static void exibeValoresBeneficios(Imoveis cadastroVinicius, Imoveis cadastroAfonso, Imoveis cadastroWellington) {
        System.out.println("VR Vinicius : " + cadastroVinicius.getDescricaos().get(0).getQuantidade());
        System.out.println("VR Afonso : " + cadastroAfonso.getDescricaos().get(0).getQuantidade());
        System.out.println("VR Wellington : " + cadastroWellington.getDescricaos().get(0).getQuantidade());
        System.out.println("VA Vinicius : " + cadastroVinicius.getDescricaos().get(1).getQuantidade());
        System.out.println("VA Afonso : " + cadastroAfonso.getDescricaos().get(1).getQuantidade());
        System.out.println("VA Wellington : " + cadastroWellington.getDescricaos().get(1).getQuantidade());
        System.out.println("VC Vinicius : " + cadastroVinicius.getDescricaos().get(2).getQuantidade());
        System.out.println("VC Afonso : " + cadastroAfonso.getDescricaos().get(2).getQuantidade());
        System.out.println("VC Wellington : " + cadastroWellington.getDescricaos().get(2).getQuantidade());
    }
}
