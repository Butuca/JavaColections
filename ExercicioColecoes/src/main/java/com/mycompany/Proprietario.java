/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class Proprietario {
    private String nome, cpf;
    int count;
    private Set <Veiculo> vei = new HashSet <>();
    
    //metodo para adicionar veiculo
    public void addVeiculo (Veiculo v){
        
        //Verifica se o proprietario possui menos de 5 veiculos, se ele quiser possuir 6 sera perguntado se quer adicionar mais um atraves do JOPtionpane
        if(vei.size() < 5){
             vei.add(v);
        }else{
            int option = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais um carro ?");
            if(option == JOptionPane.YES_OPTION){
                vei.add(v);
            }     
        }
    }
    
    // calcula o valor dos bens atraves de um iterador
    public float valorBens(){
        float sum = 0.0f;
        Iterator <Veiculo> it = vei.iterator();
        while (it.hasNext()) {
            Veiculo vei = it.next();
       sum += vei.getValor();   
        }
        return sum;
    }
     
    // faz a remoçao do veiculo atraves da placa
    public Veiculo removeVeiculo(String placa){
        Veiculo v = new Veiculo();
        v.setPlaca(placa);
        
        //mostra como deve ser feita essa comparação para a remoçao
        if(vei.contains(v) == false)
            return null;  
        
        for (Veiculo aux : vei ){
            if(aux.getPlaca() == placa){
                v = aux;
                break;
            }     
        }
        vei.remove(v);
        return v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Set<Veiculo> getVei() {
        return vei;
    }

    public void setVei(Set<Veiculo> vei) {
        this.vei = vei;
    }

 
    
}
