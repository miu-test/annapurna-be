package edu.miu.annapurnabe.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author bijayshrestha on 7/8/22
 * @project annapurna-be
 */
@Getter
@Setter
public class TopMealResponseDetailDTO implements Serializable {
    private Integer noOfRatingsReceived;
    private Long dailyMealRatingId;
    private String name;
    private String description;
    private boolean containsDairy;
    private boolean containsGluten;
    private boolean containsSugar;
}
