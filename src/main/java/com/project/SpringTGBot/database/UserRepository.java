package com.project.SpringTGBot.database;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends CrudRepository<User, Long> { // Интерфейс для реализации логики обновления количества сообщений
    @Transactional
    @Modifying
    @Query("update tg_data t set t.msg_numb = t.msg_numb + 1 where t.chatId is not null and t.chatId = :id") // Реализуем логику обновления количества сообщений
    void updateMsgNumberByUserId(@Param("id") long id); // Параметр для идентификации пользователя

}