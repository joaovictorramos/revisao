package lista22b;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista22b {

    public static void main(String[] args) {
        int anoAtual = 2022;
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        Carrinho carro = new Carrinho();
        Mercadorias arroz = new Mercadorias();
        Mercadorias arroz2 = new Mercadorias();
        Mercadorias feijao = new Mercadorias();
        Mercadorias macarrao = new Mercadorias();
        
        carro.getMercadorias().add(arroz);
        carro.getMercadorias().add(feijao);
        carro.getMercadorias().add(macarrao);
        carro.getMercadorias().add(arroz2);
        
        arroz.setNome("Arroz");
        arroz.setValorCompra(19.99f);
        arroz.setValidade(2024);
        arroz.setNomeFornecedor("Máximo");
        arroz.setTelefoneFornecedor(924050025);
        arroz.setEnderecoFornecedor("Rua do Arroz");
        arroz.setCnpjFornecedor(111222333);
        
        if(anoAtual > arroz.getValidade()){
            System.out.println(arroz.getNome() + " fora da validade! Deseja tirar do carrinho[true/false]: ");
            boolean resp = scan.nextBoolean();
            if(resp){
                carro.getMercadorias().remove(arroz);
            }
        }
        
        feijao.setNome("Feijão");
        feijao.setValorCompra(7.99f);
        feijao.setValidade(2021);
        feijao.setNomeFornecedor("Kicaldo");
        feijao.setTelefoneFornecedor(998887666);
        feijao.setEnderecoFornecedor("Rua do Feijão");
        feijao.setCnpjFornecedor(222333444);
        
        if(anoAtual > feijao.getValidade()){
            System.out.println(feijao.getNome() + " fora da validade! Deseja tirar do carrinho[true/false]: ");
            boolean resp = scan.nextBoolean();
            if(resp){
                carro.getMercadorias().remove(feijao);
            }
        }
        
        macarrao.setNome("Macarrão");
        macarrao.setValorCompra(5.89f);
        macarrao.setValidade(2021);
        macarrao.setNomeFornecedor("Galo");
        macarrao.setTelefoneFornecedor(987654321);
        macarrao.setEnderecoFornecedor("Rua do Macarrão");
        macarrao.setCnpjFornecedor(333444555);
        
        if(anoAtual > macarrao.getValidade()){
            System.out.println(macarrao.getNome() + " fora da validade! Deseja tirar do carrinho[true/false]: ");
            boolean resp = scan.nextBoolean();
            if(resp){
                carro.getMercadorias().remove(macarrao);
            }
        }
        
        arroz2.setNome("Arroz");
        arroz2.setValidade(2022);
        
        if(anoAtual > arroz2.getValidade()){
            System.out.println(arroz2.getNome() + " fora da validade! Deseja tirar do carrinho[true/false]: ");
            boolean resp = scan.nextBoolean();
            if(resp){
                carro.getMercadorias().remove(arroz2);
            }
        }
        
        //ERRO -> Calculo das validades
        /*for(int i = 0; i < carro.getMercadorias().size(); i++){
           if(carro.getMercadorias().get(i).getValidade() < anoAtual){
               System.out.println("\n" + carro.getMercadorias().get(i).getNome() + " está fora de validade!");
               carro.getMercadorias().remove(i);
           }
        }*/
        System.out.println("\n");
        
        //Identificar o total de carrinhos
        int quantTotal = carro.getMercadorias().size();
        System.out.println("Total de itens no carrinho: " + quantTotal);
        
        //Identificar o valor gasto em cada produto VÁLIDO
        System.out.println("");
        float preco = 0f;
        for(Mercadorias item : carro.getMercadorias()){
            if(!carro.getMercadorias().isEmpty()){
                System.out.println("Valor gasto em " + item.getNome() + " R$: " + deci.format(item.getValorVenda()));
            }
        }
        
        //Criando um vetor auxiliar e um vetor copia
        System.out.println("");
        String[] vetor = new String[carro.getMercadorias().size()];
        String[] copia = new String[carro.getMercadorias().size()];
        for(int i = 0; i < carro.getMercadorias().size(); i++){
            if(!carro.getMercadorias().isEmpty()){
                vetor[i] = carro.getMercadorias().get(i).getNome();
                copia[i] = vetor[i];
            }
        }
        
        //Vetor copia criado para NÃO mostrar produtos REPETIDOS
        for(int i = 0; i < quantTotal-1; i++){
            for(int j = i+1; j < quantTotal; j++){
                if(copia[i] == copia[j]){
                    copia[j] = "-1";
                }
            }
        }
        
        //Quantitativo existente por cada item
        int cont = 0;
        for(int i = 0; i < carro.getMercadorias().size(); i++){
            for(int j = 0; j < carro.getMercadorias().size(); j++){
                if(vetor[i].equals(carro.getMercadorias().get(j).getNome())){
                    cont += 1;
                }
            }
            //Mostrar na tela apenas UMA VEZ o quantidade de CADA produto
            if(copia[i] == carro.getMercadorias().get(i).getNome()){
                System.out.println("Quantidade de " + carro.getMercadorias().get(i).getNome() + ": " + cont);
                cont = 0;
            }
        }
    }
}
