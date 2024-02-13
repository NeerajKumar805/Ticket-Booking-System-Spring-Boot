package com.neeraj.ticket_booking_system.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neeraj.ticket_booking_system.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	List<Ticket> findByUserName(String userName);

	Optional<Ticket> findByShowName(String showName);
}
