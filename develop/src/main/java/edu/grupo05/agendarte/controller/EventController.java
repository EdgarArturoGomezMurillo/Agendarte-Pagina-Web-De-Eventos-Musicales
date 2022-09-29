package edu.grupo05.agendarte.controller;

import edu.grupo05.agendarte.entity.Event;
import edu.grupo05.agendarte.service.EventService;
import java.util.List;
import javax.validation.Valid;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
public class EventController {

    // Annotation
    @Autowired private EventService eventService;

    // Save operation
    @PostMapping("/events")
    public Event saveEvent(
            @Valid @RequestBody Event event)
    {
        return eventService.saveEvent(event);
    }

    // Read operation
    @GetMapping("/events")
    public List<Event> fetchUserList()
    {
        return eventService.fetchEventList();
    }

    // Update operation
    @PutMapping("/events/{id}")
    public Event
    updateEvent(@RequestBody Event event,
               @PathVariable("id") Long eventId)
    {
        return eventService.updateEvent(
                event, eventId);
    }

    // Delete operation
    @DeleteMapping("/events/{id}")
    public String deleteEventsById(@PathVariable("id")
                                  Long eventId)
    {
        eventService.deleteEventById(
                eventId);
        return "Deleted Successfully";
    }
}
