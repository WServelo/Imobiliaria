package br.com.Locadora;

import javax.swing.*;

public class Progama {

    public static void main(String[] args) {

        boolean cancela = true;
        String imprimeTipo = "";
        String imprimeRegiao = "";
        String imprimeQuarto = "";

        Locadora locadora1 = new Locadora(Tipo.casa, 1);
        locadora1.setValor(1700);
        locadora1.setRegiao(Regiao.zonaNorte);
        locadora1.setQuarto(4);
        locadora1.setBanheiro(3);
        locadora1.setGaragem(3);

        Locadora locadora2 = new Locadora(Tipo.apartamento, 2);
        locadora2.setValor(750);
        locadora2.setRegiao(Regiao.centro);
        locadora2.setQuarto(2);
        locadora2.setBanheiro(1);
        locadora2.setGaragem(1);

        Locadora locadora3 = new Locadora(Tipo.casa, 3);
        locadora3.setValor(1000);
        locadora3.setRegiao(Regiao.zonaOeste);
        locadora3.setQuarto(3);
        locadora3.setBanheiro(1);
        locadora3.setGaragem(2);

        Locadora locadora4 = new Locadora(Tipo.apartamento, 4);
        locadora4.setValor(1900);
        locadora4.setRegiao(Regiao.zonaSul);
        locadora4.setQuarto(3);
        locadora4.setBanheiro(2);
        locadora4.setGaragem(2);

        Locadora locadora5 = new Locadora(Tipo.apartamento, 5);
        locadora5.setValor(750);
        locadora5.setRegiao(Regiao.zonaSul);
        locadora5.setQuarto(1);
        locadora5.setBanheiro(1);
        locadora5.setGaragem(1);

        Locadora locadora6 = new Locadora(Tipo.casa, 6);
        locadora6.setValor(1200);
        locadora6.setRegiao(Regiao.zonaOeste);
        locadora6.setQuarto(3);
        locadora6.setBanheiro(1);
        locadora6.setGaragem(2);

        Locadora locadora7 = new Locadora(Tipo.casa, 7);
        locadora7.setValor(1300);
        locadora7.setRegiao(Regiao.centro);
        locadora7.setQuarto(2);
        locadora7.setBanheiro(1);
        locadora7.setGaragem(1);

        Locadora locadora8 = new Locadora(Tipo.apartamento, 8);
        locadora8.setValor(950);
        locadora8.setRegiao(Regiao.centro);
        locadora8.setQuarto(1);
        locadora8.setBanheiro(1);
        locadora8.setGaragem(1);

        Locadora locadora9 = new Locadora(Tipo.apartamento, 9);
        locadora9.setValor(2500);
        locadora9.setRegiao(Regiao.zonaOeste);
        locadora9.setQuarto(5);
        locadora9.setBanheiro(2);
        locadora9.setGaragem(2);

        Locadora locadora10 = new Locadora(Tipo.apartamento, 10);
        locadora10.setValor(1900);
        locadora10.setRegiao(Regiao.zonaNorte);
        locadora10.setQuarto(3);
        locadora10.setBanheiro(2);
        locadora10.setGaragem(3);

        Locadora locadora11 = new Locadora(Tipo.casa, 11);
        locadora11.setValor(3000);
        locadora11.setRegiao(Regiao.zonaOeste);
        locadora11.setQuarto(7);
        locadora11.setBanheiro(4);
        locadora11.setGaragem(5);

        Locadora locadora12 = new Locadora(Tipo.casa, 12);
        locadora12.setValor(1350);
        locadora12.setRegiao(Regiao.zonaOeste);
        locadora12.setQuarto(3);
        locadora12.setBanheiro(1);
        locadora12.setGaragem(2);

        String imprimir = locadora1.Imprime() + "\n" + locadora2.Imprime() + "\n" + locadora3.Imprime() + "\n" +
                locadora4.Imprime() + "\n" + locadora5.Imprime() + "\n" + locadora6.Imprime() + "\n" +
                locadora7.Imprime() + "\n" + locadora8.Imprime() + "\n" + locadora9.Imprime() + "\n" +
                locadora10.Imprime() + "\n" + locadora11.Imprime() + "\n" + locadora12.Imprime() + "\n";

        int casaOuApartamento = JOptionPane.showOptionDialog(null,
                imprimir + "\n\n Gostaria de selecionar casa ou apartameno?", "Casa ou apartamento",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"Casa", "Apartamento", "Mais filtros", "Cancela"}, "Cancela");

        System.out.println("casa ou ap " + casaOuApartamento);
        imprimeTipo = CasaOuApartamento(locadora1, locadora2, locadora3, locadora4, locadora5, locadora6, casaOuApartamento);

        if (casaOuApartamento != 3) {
            int regiao = JOptionPane.showOptionDialog(null,
                    imprimeTipo + "\n\n Qual região?", "Região",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, new String[]{"Centro", "Zona Norte", "Zona Sul", "Zona Oeste", "Zona Leste", "Mais filtros", "Cancela"}, "Cancela");

            System.out.println("regiao " + regiao);
            imprimeRegiao = Regiao(locadora1, locadora2, locadora3, locadora4, locadora5, locadora6, regiao);
        }

        int quarto = JOptionPane.showOptionDialog(null,
                imprimeRegiao + "\n\n Quantos quartos?", "Dormitórios",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"1 quarto", "2 quartos", "3 quartos", "4 quartos ou mais", "Mais filtros", "Cancela"}, "Cancela");

        System.out.println("quartos " + quarto);

        int banheiro = JOptionPane.showOptionDialog(null,
                imprimir + "\n\n Quantos banheiros?", "WC",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"1 banheiro", "2 banheiros", "3 banheiros ou mais", "Mais filtros", "Cancela"}, "Cancela");

        System.out.println("banheiro " + banheiro);

        int garagem = JOptionPane.showOptionDialog(null,
                imprimir + "\n\n Quantas vagas na garagem?", "Garagem",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, new String[]{"1 vaga", "2 vagas", "3 vagas ou mais", "Visualizar", "Cancela"}, "Cancela");

        System.out.println("garagem " + garagem);

        String email = JOptionPane.showInputDialog("Digite seu email para que seja enviado mais informações ou duvidas");

        System.out.println(email);


    }

    private static String CasaOuApartamento(Locadora locadora1, Locadora locadora2, Locadora locadora3,
                                            Locadora locadora4, Locadora locadora5, Locadora locadora6, int casaOuApartamento) {
        String imprime = "";
        switch (casaOuApartamento) {
            case 0:
                if (locadora1.getTipo() == Tipo.casa) {
                    imprime += locadora1.Imprime() + "\n";
                }
                if (locadora2.getTipo() == Tipo.casa) {
                    imprime += locadora2.Imprime() + "\n";
                }
                if (locadora3.getTipo() == Tipo.casa) {
                    imprime += locadora3.Imprime() + "\n";
                }
                if (locadora4.getTipo() == Tipo.casa) {
                    imprime += locadora4.Imprime() + "\n";
                }
                if (locadora5.getTipo() == Tipo.casa) {
                    imprime += locadora5.Imprime() + "\n";
                }
                if (locadora6.getTipo() == Tipo.casa) {
                    imprime += locadora6.Imprime() + "\n";
                }
                break;
            case 1:
                if (locadora1.getTipo() == Tipo.apartamento) {
                    imprime += locadora1.Imprime() + "\n";
                }
                if (locadora2.getTipo() == Tipo.apartamento) {
                    imprime += locadora2.Imprime() + "\n";
                }
                if (locadora3.getTipo() == Tipo.apartamento) {
                    imprime += locadora3.Imprime() + "\n";
                }
                if (locadora4.getTipo() == Tipo.apartamento) {
                    imprime += locadora4.Imprime() + "\n";
                }
                if (locadora5.getTipo() == Tipo.apartamento) {
                    imprime += locadora5.Imprime() + "\n";
                }
                if (locadora6.getTipo() == Tipo.apartamento) {
                    imprime += locadora6.Imprime() + "\n";
                }
                break;
            case 3:
                break;
        }
        return imprime;
    }

    private static String Regiao(Locadora locadora1, Locadora locadora2, Locadora locadora3, Locadora locadora4,
                                 Locadora locadora5, Locadora locadora6, int regiao) {
        String imprime = "";
        switch (regiao) {
            case 0:
                if (locadora1.getTipo() == Tipo.casa && locadora1.getRegiao() == Regiao.zonaNorte) {
                    imprime += locadora1.Imprime() + "\n";
                }
                if (locadora2.getTipo() == Tipo.casa) {
                    imprime += locadora2.Imprime() + "\n";
                }
                if (locadora3.getTipo() == Tipo.casa) {
                    imprime += locadora3.Imprime() + "\n";
                }
                if (locadora4.getTipo() == Tipo.casa) {
                    imprime += locadora4.Imprime() + "\n";
                }
                if (locadora5.getTipo() == Tipo.casa) {
                    imprime += locadora5.Imprime() + "\n";
                }
                if (locadora6.getTipo() == Tipo.casa) {
                    imprime += locadora6.Imprime() + "\n";
                }
                break;
            case 1:
                if (locadora1.getTipo() == Tipo.apartamento) {
                    imprime += locadora1.Imprime() + "\n";
                }
                if (locadora2.getTipo() == Tipo.apartamento) {
                    imprime += locadora2.Imprime() + "\n";
                }
                if (locadora3.getTipo() == Tipo.apartamento) {
                    imprime += locadora3.Imprime() + "\n";
                }
                if (locadora4.getTipo() == Tipo.apartamento) {
                    imprime += locadora4.Imprime() + "\n";
                }
                if (locadora5.getTipo() == Tipo.apartamento) {
                    imprime += locadora5.Imprime() + "\n";
                }
                if (locadora6.getTipo() == Tipo.apartamento) {
                    imprime += locadora6.Imprime() + "\n";
                }
                break;
            case 3:
                break;
        }
        return imprime;
    }
}
