package xyz.kocmut.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String sourceAddress;

    public String destinationAddress;

    public LocalDateTime sent;

    public LocalDateTime delivered;

    public State state;

    public Package(String sourceAddress, String destinationAddress) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
    }

    public Package() {

    }


    enum State{
        RECIEVED,
        IN_TRANSIT,
        DELIVERED
    }

}
