package de.z1up.queue;

import de.z1up.queue.obj.Person;
import de.z1up.queue.obj.Queue;

public class main {

    public static void main(String[] args) {


        Person peek;
        Queue queue = new Queue();


        Person p1 = new Person("P1");
        Person p2 = new Person("P2");
        Person p3 = new Person("P3");

        queue.push(p1);
        queue.push(p2);
        queue.push(p3);

        if (queue.peek() != null) {
            peek = (Person) queue.peek().getValue();
            System.out.println(peek.getName());
        }

        queue.pop();

        if (queue.peek() != null) {
            peek = (Person) queue.peek().getValue();
            System.out.println(peek.getName());
        }

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();

        if (queue.peek() != null) {
            peek = (Person) queue.peek().getValue();
            System.out.println(peek.getName());
        }


    }



}
