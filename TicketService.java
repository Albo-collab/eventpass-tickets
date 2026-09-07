package com.eventpass.tickets.service;

import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class TicketService {

    public String generarTicket(Long ordenId, Long eventoId) {
        String codigo = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        // Guardar el ticket en base de datos
        return codigo;
    }

    public String validarTicket(String codigo) {
        // Verificar si existe y no está usado
        return "Ticket validado correctamente";
    }
}
