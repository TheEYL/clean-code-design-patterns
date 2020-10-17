package ObserverPattern;

public interface Subject {
   void registerObserver(MyObserver e);
   void removeObserver(MyObserver e);
   void notifyObservers();
}
