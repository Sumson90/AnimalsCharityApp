package pl.animalscharityapp.Dto;

import lombok.*;
import pl.animalscharityapp.model.User;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdvertDto {

    private String title;
    private String city;
    private String description;

    private LocalDateTime date;
    private Long userId;

}
