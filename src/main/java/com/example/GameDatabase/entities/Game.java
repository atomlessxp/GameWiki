package com.example.GameDatabase.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "GM")
public class Game implements Serializable {

    private static final long serialVersionUID = -205006300180504189L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gameIdSequence")
    @SequenceGenerator(name = "gameIdSequence", sequenceName = "GM_ID_SEQ", initialValue = 5, allocationSize = 1)
    @Column(name = "GM_ID")
    private Long id;

    @Column(name = "GM_NM")
    private String name;

    @Column(name = "GM_DSC")
    private String description;

    @Column(name = "GM_YR")
    private String releaseYear;

    @Column(name = "GM_PLT")
    private String platform;
}
