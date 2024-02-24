package com.project.SpringTGBot.database;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tg_data")
public class User {

    @Id
    private long chatId; // ID чата
    private String name; // Имя пользователя
    private int msg_numb; // Количество сообщений

}