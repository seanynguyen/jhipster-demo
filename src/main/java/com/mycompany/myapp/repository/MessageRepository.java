package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by thanh-anh-tuan on 21/03/2016.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
