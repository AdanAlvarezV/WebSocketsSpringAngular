package com.bolsadeideas.springboot.backend.chat.springbootbackendchat.models.documents;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mensaje implements Serializable {

    private String texto;
    private Long fecha;

}
