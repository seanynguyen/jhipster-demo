package com.mycompany.myapp.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by thanh-anh-tuan on 21/03/2016.
 */
@Entity
@Table(name = "message")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Message extends AbstractAuditingEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    private String content;

    @ManyToMany
    @JoinTable(name="users_messages",

            joinColumns=@JoinColumn(name="messageId"),
            inverseJoinColumns=@JoinColumn(name="userId")
    )
    private Set<User> messageOf = new HashSet<>();

    public Message(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<User> getMessageOf() {
        return messageOf;
    }

    public void setMessageOf(Set<User> messageOf) {
        this.messageOf = messageOf;
    }
}
