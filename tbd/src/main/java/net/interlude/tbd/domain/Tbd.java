package net.interlude.tbd.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Tbd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String str;
}
