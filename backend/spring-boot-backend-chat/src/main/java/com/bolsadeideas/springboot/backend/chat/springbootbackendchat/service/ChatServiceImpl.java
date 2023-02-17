package com.bolsadeideas.springboot.backend.chat.springbootbackendchat.service;

import com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.documents.Mensaje;
import com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService{

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public List<Mensaje> obtenerUltimos10Mensajes() {
        return chatRepository.findFirst10ByOrderByFechaDesc();
    }

    @Override
    public Mensaje guardar(Mensaje mensaje) {
        return chatRepository.save(mensaje);
    }
}
