package observer.pattern;

public class ObserverImpl implements Observer{
    String observerName;
    Subject subjectRegistered;

    public ObserverImpl(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {

        String newMessage = (String) subjectRegistered.getUpdate();

        if (newMessage != null){
            System.out.println(observerName + " New Message Received " + newMessage);
        }else {
            System.out.println(observerName + " No message Received");
        }
    }

    @Override
    public void update(String newMessage) {
        if (newMessage != null){
            System.out.println(observerName + " New Message Received " + newMessage);
        }else {
            System.out.println(observerName + " No message Received");
        }
    }

    @Override
    public void setSubject(Subject subject) {
   subjectRegistered = subject;
    }
}
