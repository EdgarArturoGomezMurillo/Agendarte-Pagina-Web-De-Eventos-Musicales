package edu.grupo05.agendarte.service;

import edu.grupo05.agendarte.entity.Event;
import edu.grupo05.agendarte.repository.EventRepository;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    // Save operation
    @Override
    public Event saveEvent(Event event)
    {
        return eventRepository.save(event);
    }

    // Read operation
    @Override public List<Event> fetchEventList()
    {
        return (List<Event>)
                eventRepository.findAll();
    }

    // Update operation
    @Override
    public Event
    updateEvent(Event event,
               Long eventId)
    {
        Event eventoDB
                = eventRepository.findById(eventId)
                .get();

        if (Objects.nonNull(event.getEventName())
                && !"".equalsIgnoreCase(
                event.getEventName())) {
            eventoDB.setEventName(
                    event.getEventName());
        }

        if (Objects.nonNull(event.getEventProductor())
                && !"".equalsIgnoreCase(
                event.getEventProductor())) {
            eventoDB.setEventProductor(
                    event.getEventProductor());
        }

        if (Objects.nonNull(event.getEventDescript())
                && !"".equalsIgnoreCase(
                event.getEventDescript())) {
            eventoDB.setEventDescript(
                    event.getEventDescript());
        }
        if (Objects.nonNull(event.getEventType())
                && !"".equalsIgnoreCase(
                event.getEventType())) {
            eventoDB.setEventType(
                    event.getEventType());
        }
        if (Objects.nonNull(event.getEventCategory())
                && !"".equalsIgnoreCase(
                event.getEventCategory())) {
            eventoDB.setEventCategory(
                    event.getEventCategory());
        }
//        if (Objects.nonNull(event.getEventDate())
//                && !"".equalsIgnoreCase(
//                event.getEventDate())) {
//            eventoDB.setEventDate(
//                    event.getEventDate());
//        }
        if (Objects.nonNull(event.getEventPlace())
                && !"".equalsIgnoreCase(
                event.getEventPlace())) {
            eventoDB.setEventPlace(
                    event.getEventPlace());
        }
        if (Objects.nonNull(event.getEventAddress())
                && !"".equalsIgnoreCase(
                event.getEventAddress())) {
            eventoDB.setEventAddress(
                    event.getEventAddress());
        }
        if (Objects.nonNull(event.getEventCity())
                && !"".equalsIgnoreCase(
                event.getEventCity())) {
            eventoDB.setEventCity(
                    event.getEventCity());
        }

        return eventRepository.save(eventoDB);

    }

    // Delete operation
    @Override
    public void deleteEventById(Long eventId)
    {
        eventRepository.deleteById(eventId);
    }
}
