package com.huntercodexs.mockapiclinetdemo.config.oauth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RoleEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String description;

    @Column
    private String name;

}
