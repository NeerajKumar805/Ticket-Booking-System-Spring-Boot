package com.neeraj.ticket_booking_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neeraj.ticket_booking_system.entity.Ticket;
import com.neeraj.ticket_booking_system.service.TicketService;

@Controller
@RequestMapping("/tickets")
public class TicketController {
	@Autowired
	private TicketService ticketService;

	@GetMapping("/")
	public String defaultPage() {
		return "redirect:/tickets/form";
	}

	@GetMapping("/form")
	public String showTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "ticketForm";
	}

	@PostMapping("/book")
	public String bookTicket(@ModelAttribute Ticket ticket, RedirectAttributes attributes) {
		ticketService.bookTicket(ticket);
		attributes.addAttribute("inserted", true);
		return "redirect:/tickets/form";
	}

	@GetMapping("/cancel/{ticketId}")
	public String cancelTicket(@PathVariable Long ticketId, RedirectAttributes attributes) {
		// Logic to cancel the ticket
		ticketService.cancelTicket(ticketId);

		// Add a parameter to indicate successful deletion
		attributes.addAttribute("deleted", true);

		return "redirect:/tickets/reports";
	}

	@GetMapping("/reports")
	public String getReports(Model model) {
		List<Ticket> bookedTickets = ticketService.getAllBookedTickets();
		model.addAttribute("tickets", bookedTickets);
		return "reports";
	}

	@GetMapping("/available")
	public String getAvailableTickets(Model model) {
		List<Ticket> availableTickets = ticketService.getAvailableTickets();
		model.addAttribute("tickets", availableTickets);
		return "availableTickets";
	}
}
