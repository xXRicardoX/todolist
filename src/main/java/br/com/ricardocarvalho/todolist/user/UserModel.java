package br.com.ricardocarvalho.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users") //Criação  da tabela
public class UserModel {
    @Id //Chave primaria.
    @GeneratedValue(generator = "UUID") // Fazer geração de ID de forma automatica.
    private UUID id;


    // Se quiser deixar o nome da tabela diferente da variavel usar o @Column(name = "Nome_desejado")
    @Column(unique = true)
    public String username;
    public String name;
    public String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}