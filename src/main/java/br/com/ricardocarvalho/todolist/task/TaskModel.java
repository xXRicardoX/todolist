package br.com.ricardocarvalho.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Pode ter no taskmodel *
 * ID
 * Usuario (ID_USUARIO)
 * Descrição
 * Titulo
 * Data de Inicio
 * Data de Termino
 * Prioridade *
 * 
 */

@Data
@Entity(name = "tb_task")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50) // Limitador de caractere
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public void setTitle(String title) throws Exception {
        if (title.length() > 50){
            throw new Exception("O titulo da tarefa ultrapassou o limite de 50 caracteres");
        }
        this.title = title;
    }

}
