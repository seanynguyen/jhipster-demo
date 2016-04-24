package com.mycompany.myapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by thanh-anh-tuan on 13/03/2016.
 */
public class Peer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name; // name of peer (ex: A)


    private List<Peer> friends;


}
