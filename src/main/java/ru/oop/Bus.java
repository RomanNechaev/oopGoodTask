package ru.oop;

/**
 * @author Nechaev Roman
 */
public class Bus implements Transport {
    private final String number;
    private Person person;
    private Position position;

    Bus(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public void go(Position destination) {
        this.setPosition(destination);
    }
}
