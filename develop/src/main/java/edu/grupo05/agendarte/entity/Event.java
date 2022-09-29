package edu.grupo05.agendarte.entity;

// Importing required classes
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

// Annotations
@Entity
@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder

//// Adding the table name
//@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;
    private String eventName;
    private String eventProductor;
    private String eventDescript;
    private String eventType;
    private String eventCategory;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
//    @Column(name = "eventDate")
    private Date eventDate;
    private String eventPlace;
    private String eventAddress;
    private String eventCity;


    // Mapping the column of this table
    @ManyToOne
    //Adding the name
    @JoinColumn(name = "userId")
    User fkUser;

    // Mapping the column of this table
    @ManyToOne
    //Adding the name
    @JoinColumn(name = "musicId")
    Music fkMusic;


    Event() {}

    public Event(long id, String nam, String prod, String des, String tip, String cat, Date dat, String pla, String add, String cit, User objuser, Music objmusic )
    {
        this.eventId = id;
        this.eventName=nam;
        this.eventProductor=prod;
        this.eventDescript=des;
        this.eventType=tip;
        this.eventCategory=cat;
        this.eventDate=dat;
        this.eventPlace=pla;
        this.eventAddress=add;
        this.eventCity=cit;
        this.fkUser=objuser;
        this.fkMusic=objmusic;
    }
}
