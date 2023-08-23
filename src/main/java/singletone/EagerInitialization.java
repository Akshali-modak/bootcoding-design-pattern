package singletone;

public class EagerInitialization {
    private static EagerInitialization theOnlyInstance = new EagerInitialization();

    private EagerInitialization(){

    }
    public static EagerInitialization getInstance(){
        return theOnlyInstance;
    }

    public static void main(String[] args) {
        EagerInitialization e1 = EagerInitialization.getInstance();

        EagerInitialization e2 = EagerInitialization.getInstance();

        if (e1 == e2){
            System.out.println("Object Are Same");
        }
        else {
            System.out.println("Object Are Not Same");
        }
    }
}
