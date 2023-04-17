package ru.oop;

/**
 * @author Nechaev Roman
 */
public class Car implements Transport{
    private final Person person;

    Car(Person person) {
        this.person = person;
    }
    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setPosition(Position position) {

    }

    @Override
    public void go(Position destination) {

    }
}
