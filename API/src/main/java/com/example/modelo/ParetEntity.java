package com.example.modelo;

import javax.persistence.*;
import java.io.Serializable;


/**
 *
 */
@MappedSuperclass
@Access(AccessType.FIELD)
public class ParetEntity implements Serializable {

    private static final long serialVersionUID = -2249579247068039546L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    @Column(name = "id",unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
