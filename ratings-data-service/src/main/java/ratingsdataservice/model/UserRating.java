package ratingsdataservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserRating {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @OneToMany
    private List<Rating> ratings;
}
