package com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.repository;

import com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.documents.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends MongoRepository<Mensaje, String> {

    public List<Mensaje> findFirst10ByOrderByFechaDesc();

}
