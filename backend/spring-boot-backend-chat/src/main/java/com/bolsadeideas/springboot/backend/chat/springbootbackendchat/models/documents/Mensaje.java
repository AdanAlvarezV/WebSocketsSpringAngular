package com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "mensajes")
public class Mensaje implements Serializable {

    @Id
    private String id;

    private String texto;
    private Long fecha;
    private String username;
    private String tipo;
    private String color;

}
