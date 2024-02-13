package com.neeraj.ticket_booking_system.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neeraj.ticket_booking_system.entity.Ticket;
import com.neeraj.ticket_booking_system.repository.TicketRepository;

@Service
public class TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	/*
	 * public Ticket bookTicket(Ticket ticket) { if (ticket.getTotalSeats() > 0) {
	 * ticket.setBookingDate(LocalDateTime.now());
	 * ticket.setTotalSeats(ticket.getTotalSeats() - 1); return
	 * ticketRepository.save(ticket); } else { throw new
	 * RuntimeException("No available seats for the show."); } }
	 */

	// Check if the movie already exists
	public Ticket bookTicket(Ticket ticket) {
		// Check if the movie already exists
		Optional<Ticket> existingTicket = ticketRepository.findByShowName(ticket.getShowName());

		if (existingTicket.isPresent()) {
			// Movie already exists, decrement total seats
			Ticket existingMovie = existingTicket.get();
			if (existingMovie.getTotalSeats() > 0) {
				ticket.setBookingDate(LocalDateTime.now());
				ticket.setUserName(ticket.getUserName());
				existingMovie.setTotalSeats(existingMovie.getTotalSeats() - 1);
				return ticketRepository.save(existingMovie);
			} else {
				throw new RuntimeException("No available seats for the show.");
			}
		} else {
			// Movie doesn't exist, throw an exception or handle it as needed
//			throw new RuntimeException("The specified movie does not exist.");
			ticket.setBookingDate(LocalDateTime.now());
			ticket.setTotalSeats(ticket.getTotalSeats() - 1);
			ticketRepository.save(ticket);
			return ticketRepository.save(ticket);
		}

	}

	public void cancelTicket(Long ticketId) {
		ticketRepository.deleteById(ticketId);
	}

	public List<Ticket> getAllBookedTickets() {
		return ticketRepository.findAll();
	}

	public List<Ticket> getAvailableTickets() {
		// Implement logic to get available tickets (for demonstration, returning all
		// tickets)
		return ticketRepository.findAll();
	}
}
