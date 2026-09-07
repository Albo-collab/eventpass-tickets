package com.eventpass.tickets.controller;

import com.eventpass.tickets.service.TicketService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public String generarTicket(@RequestParam Long ordenId, @RequestParam Long eventoId) {
        return ticketService.generarTicket(ordenId, eventoId);
    }

    @PutMapping("/{codigo}/validar")
    public String validarTicket(@PathVariable String codigo) {
        return ticketService.validarTicket(codigo);
    }
}
