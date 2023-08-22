package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    private  List<Observer> observerList = null;
    private String message;

    public SubjectImpl() {
        observerList = new ArrayList<>();
        this.message = message;
    }

    @Override
    public void register(Observer observer) {
     if (observer == null){
         throw new NullPointerException();
     }
     observerList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
      if (observer == null){
          throw  new NullPointerException();
      }
      observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
     if (observerList != null && !observerList.isEmpty()){
         for (Observer observer : observerList){
             observer.update(message);
         }
     } else {
         System.out.println("No Observers Notify");
     }
    }

    @Override
    public Object getUpdate() {
        return message;
    }

    @Override
    public void postMessage(String message) {
        System.out.println("message posted for subject :" + message);
        this.message = message;
        notifyObservers();
    }
}
