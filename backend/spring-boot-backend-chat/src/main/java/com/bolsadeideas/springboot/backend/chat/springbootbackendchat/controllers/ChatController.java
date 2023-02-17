package com.bolsadeideas.springboot.backend.chat.springbootbackendchat.controllers;

import com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.documents.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@Controller
@CrossOrigin("*")
public class ChatController {

    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje){
        mensaje.setFecha(new Date().getTime());
        mensaje.setTexto("Recibido por el broker: " + mensaje.getTexto());
        return mensaje;
    }

}
