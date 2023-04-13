package ru.oop;

/**
 * @author Nechaev Roman
 */
public class Car {
    private final Person person;
    private Position position;

    Car(Person person) {
        this.person = person;
        position = person.getPosition();
    }

    public void go(Position destination) {
        person.setPosition(destination);
        position = destination;
    }
}
