package simonemanca.u5w3d5.service;

import simonemanca.u5w3d5.model.Event;
import simonemanca.u5w3d5.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    public Event findEventById(Long id) {
        Optional<Event> event = eventRepository.findById(id);
        if (event.isPresent()) {
            return event.get();
        } else {
            throw new RuntimeException("Event not found for id :: " + id);
        }
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event eventDetails) {
        Event event = findEventById(id);
        event.setTitle(eventDetails.getTitle());
        event.setDescription(eventDetails.getDescription());
        event.setDate(eventDetails.getDate());
        event.setLocation(eventDetails.getLocation());
        event.setAvailableSeats(eventDetails.getAvailableSeats());
        // Aggiorna i campi che sono NECESSARI
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        Event event = findEventById(id);
        eventRepository.delete(event);
    }
}

