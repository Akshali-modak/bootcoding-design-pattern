package observer.pattern;

public interface Subject {
    void register(Observer observer);

    void unRegister(Observer observer);

    void notifyObservers();

    Object getUpdate();

    void postMessage(String message);
}
