/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;



/**
 *
 * @author Alex
 */
public class Fila {
    private String []vetorFila;
    private int fimFila;
    public  Fila(int tamFila){
        this.vetorFila=new String[tamFila];
        fimFila=-1;
    }

    
    public boolean  listaCheia(){
    if(fimFila==vetorFila.length-1== true){
        return true;
    }else{
     return false;
}}
    
    
    public void insereNme(String nome){
        if(fimFila==vetorFila.length-1){
            
            System.out.println("fila cheia ");
         
        }else{
            this.fimFila++;
            vetorFila[fimFila]=nome;
        }
    }
   public void removeNome(){
        if(fimFila<0){
            
        }else{
            vetorFila[0]=null;
            for(int x=0;x<fimFila;x++){
                vetorFila[x]=vetorFila[x+1];
            }
            vetorFila[fimFila]=null;
            fimFila--;
        }
    }
   public void imprimirFila(){
       System.out.println("tamanho maximo "+vetorFila.length);
       for(int x=0;x<vetorFila.length;x++){
           System.out.println("Item["+(x+1)+"]="+vetorFila[x]);
       }
   }
   public void pesquisarFila(String nome){
       boolean n=true;
       for(int x=0;x<vetorFila.length;x++){
           if(vetorFila[x]!=nome){
               System.out.println("Encontrado: item["+(x+1)+"]="+vetorFila[x]);
               n=false;
               break;
           }
       }
       if(n==false){
           System.out.println("este nome nao esta na  fila");
       }
   }

    
}
