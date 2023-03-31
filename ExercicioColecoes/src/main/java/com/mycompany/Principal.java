/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author lucas
 */
public class Principal {
    public static void main(String[] args) {
        Veiculo vei = new Veiculo();
        Proprietario pro = new Proprietario();
        
        //proprietario 1
        pro.setCpf("0123");
        pro.setNome("Lucas");
        
        //veiculo 1
        vei.setPlaca("abc-123");
        vei.setValor(500000f);
        pro.addVeiculo(vei);
        
        //veiculo 2
        vei = new Veiculo(); 
        vei.setPlaca("123-abc");
        vei.setValor(120000f);
        pro.addVeiculo(vei);
        
        //veiculo 3
        vei = new Veiculo(); 
        vei.setPlaca("311-ags");
        vei.setValor(100000f);
        pro.addVeiculo(vei);
        
         //veiculo 4
        vei = new Veiculo(); 
        vei.setPlaca("421-cba");
        vei.setValor(80000f);
        pro.addVeiculo(vei);
        
        //veiculo 5
        vei = new Veiculo(); 
        vei.setPlaca("159-asd");
        vei.setValor(35000f);
        pro.addVeiculo(vei);
        
        //veiculo 6 será perguntado se deseja adicionar mais um objeto
        vei = new Veiculo(); 
        vei.setPlaca("987-xxx");
        vei.setValor(100020f);
        pro.addVeiculo(vei);
        
        Proprietario pro2 = new Proprietario();
        
        //proprietario 2
        pro2.setCpf("6548");
        pro2.setNome("Anderson");
        
        //veiculo 1
        vei = new Veiculo();
        vei.setPlaca("das-951");
        vei.setValor(700000f);
        pro2.addVeiculo(vei);
        
        //veiculo 2
        vei = new Veiculo(); 
        vei.setPlaca("oui-123");
        vei.setValor(820000f);
        pro2.addVeiculo(vei);
        
        //veiculo 3 duplicado, nao aceita veiculo duplicado.
        vei = new Veiculo(); 
        vei.setPlaca("oui-123");
        vei.setValor(820000f);
        pro2.addVeiculo(vei);
        
        // aqui eu listo o primeiro proprietario somente porque depois ele ira ter a remoção de um veiculo e o valor dos bens irá ser modificado.
        listaProprietario(pro);
        
        
       Veiculo aux = pro.removeVeiculo("421-cba");
        if(aux == null) {
            System.out.println("Veiculo não encontrado");
        }
        else {
            System.out.println("Foi removido o veiculo " + aux.getPlaca());
        }
        
        
        System.out.println("\nDepois da remocao");
        listaProprietario(pro);
        listaProprietario(pro2);
        
    }
    
    // metodo para a listagem dos atreibutos de cada proprietario e carro
    private static void listaProprietario (Proprietario aux) {
        System.out.println("\nProprietario: " + aux.getNome());
        System.out.println("CPF: " + aux.getCpf());
        System.out.println("Valor dos Bens: " + aux.valorBens());
        for (Veiculo veiculo : aux.getVei()) {
            System.out.println("\nPlaca: " + veiculo.getPlaca());
            System.out.println("Valor: " + veiculo.getValor());
        }
    }
}    
