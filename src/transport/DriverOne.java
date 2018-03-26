package transport;

import people.Person;

public class DriverOne implements Space, Pilot {

    private Person person;
    private String start;
    private int speed = 100;
    private int speed2 = 160;
    private int speed3 = 200;
    private int stop = 0;


    @Override
    public void setStart(String go){
        this.start = go;
        Person person = new Person("ТвоєІмя");

    }

    @Override
    public void getfly() {
        if(speed != 0){
            System.out.print("Ура! Ми полетіли! ");
        } else{
            System.out.print("Халепа, ми нікуди не летимо ! ");
        }
    }

    @Override
    public void getSpeed() {
        return this.speed;
    }

    @Override
    public void getSpeed2() {
        if(speed2 >= speed){
            System.out.println("160");
        } else {
            return this.speed2;
        }
    }

    @Override
    public void getSpeed3() {
        if(speed3 >= speed2){
            System.out.println("200");
        } else {
            return this.speed2;
        }
        return this.speed3;
    }

    @Override
    public void getStop() {
        return this.stop;
    }
}
