import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import ca.mcgill.ecse321.eventregistration.model.Person;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
public class Registration{
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
private Event event;

@ManyToOne(optional=false)
public Event getEvent() {
   return this.event;
}

public void setEvent(Event event) {
   this.event = event;
}

@Entity
public class RegistrationManager{
   private Set<Person> participants;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Person> getParticipants() {
      return this.participants;
   }
   
   public void setParticipants(Set<Person> participantss) {
      this.participants = participantss;
   }
   
   private Set<Registration> registration;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Registration> getRegistration() {
      return this.registration;
   }
   
   public void setRegistration(Set<Registration> registrations) {
      this.registration = registrations;
   }
   
   private Set<Event> event;
   
   @OneToMany(cascade={CascadeType.ALL})
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
public Integer getId() {
    return this.id;
}
   }
   }
