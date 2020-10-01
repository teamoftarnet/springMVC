package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reportID;

    @ManyToOne
    @JoinColumn(name = "restaurantID")
    private Restaurant restaurant;

    @ManyToOne
    @JoinColumn(name = "userID")
    private AppUser user;

    @ColumnDefault("0")
    private int closedPlace;

    @ColumnDefault("0")
    private int fakePlace;

    @ColumnDefault("0")
    private int wrongLocation;

    @ColumnDefault("0")
    private int wrongInfo;

    @ColumnDefault("0")
    private int wrongScore;
}
