package pl.animalscharityapp.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity(name = "user_app")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String name;
    private String lastname;
    private String email;
    private String city;

    private Integer phone;
    @OneToMany
    private List<Dog> dog;

    @OneToMany
    private List<Advert> adverts;


}