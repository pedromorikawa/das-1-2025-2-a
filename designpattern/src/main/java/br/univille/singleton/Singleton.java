package br.univille.singleton;

public class Singleton {
    //STATIC - uma espécie de variavel global - armazena na memória antes do objeto ser criado 
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
