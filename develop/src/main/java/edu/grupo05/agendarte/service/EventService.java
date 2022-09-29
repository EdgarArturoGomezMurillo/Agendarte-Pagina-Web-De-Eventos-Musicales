package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.Event;

// Importing required classes
import java.util.List;

public interface EventService {
    // Save operation
    Event saveEvent(Event event);

    // Read operation
    List<Event> fetchEventList();

    // Update operation
    Event updateEvent(Event event, Long eventId);

    // Delete operation
    void deleteEventById(Long eventId);
}
