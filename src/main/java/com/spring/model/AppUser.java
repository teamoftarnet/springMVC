package com.spring.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bdurmusoglu on 6.04.2020.
 */

@Setter
@Getter
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser   {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;
    //cinli dosya comment satırı
    @Column
    private String userName;

    @Column
    private String userSurname;

    @Column(unique = true, nullable = false)
    private String userEmail;

    @Column(length = 30)
    private String userPassword;

    private String userToken;

    @Column(nullable = false)
    private String userType;

    @Lob
    @Column
    private byte[] profilImageID;

    @Column
    private String status;

    @Column
    private long code;

    @Column
    private String resetCode;

    @Column
    private String idToken;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Review> review;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Report> reports;

}
