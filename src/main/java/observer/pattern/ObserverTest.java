package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {
    public static void main(String[] args) {

        Subject implSubject = new SubjectImpl();
        List<Observer> observers = new ArrayList<>(5);

        for (int i = 1; i<=5; i++){
            observers.add(new ObserverImpl("observer- " + i));
        }

        for (Observer observer : observers){

            implSubject.register(observer);
            observer.setSubject(implSubject);
        }

        observers.get(0).update();
        implSubject.postMessage("This is observer design pattern test");

    }
}
