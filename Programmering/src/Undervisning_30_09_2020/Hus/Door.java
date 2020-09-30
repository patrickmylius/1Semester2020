package Undervisning_30_09_2020.Hus;
//Class holding Door
//What a door can do
public class Door {
    boolean locked;
    boolean closed;

    public Door() {
    }
    void locked() {

    }
    void openLock(){
        this.locked = false;
    }

    void Open(){
        closed = false;
    }
    void close(){
        closed = true;
    }


    public Door(boolean locked, boolean closed) {
        this.locked = locked;
        this.closed = closed;
    }
}
