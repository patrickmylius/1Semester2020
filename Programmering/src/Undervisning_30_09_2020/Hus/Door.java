package Undervisning_30_09_2020.Hus;

//Class holding Door
//Declaring what a door can do
//Building obj Doors
public class Door {
    //Building 3 door obj, main, back and basement.
    static Door mainDoor = new Door();
    static Door backDoor = new Door();
    static Door basementDoor = new Door();
    //declares boolean locked, closed
    boolean locked;
    boolean closed;

    public Door() {
    }

    void locked() {

    }

    void openLock() {
        this.locked = false;
    }

    void Open() {
        closed = false;
    }

    void close() {
        closed = true;
    }
}
