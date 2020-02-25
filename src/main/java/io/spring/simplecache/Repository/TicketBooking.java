package io.spring.simplecache.Repository;

import io.spring.simplecache.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vrpatel on 2/23/20.
 */
@Repository
public interface TicketBooking extends JpaRepository<Ticket, Integer>{
}
