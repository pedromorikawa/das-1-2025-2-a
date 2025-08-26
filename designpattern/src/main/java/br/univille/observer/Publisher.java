package br.univille.observer;

public class publisher {

    //Lista estática
    //private Subscriber [] subscriber = new Subscriber[10];

    //Lista dinâmica
    private ArrayList<Subscriber> subscriber =
        new ArrayList<>();

    private String mainState;

    public String getMainState(){
        return mainState
    }
    public void SetMainState(String mainState){
        this.mainState = mainState;
    }


        //Increve um assinante na lista de assinantes
    public void subscribe(Subscriber assinante){
        subscribers.add(assinante);
    }

    //Notifica todos os assinantes da menssagem nova
    public void notifySubscribers(){
        for(Subscriber umAssinante: subscribers){
            umAssinante.update(mainState);
        }
    }

        
}
