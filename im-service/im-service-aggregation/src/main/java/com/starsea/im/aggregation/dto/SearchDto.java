package com.starsea.im.aggregation.dto;

import lombok.*;
import lombok.experimental.Builder;

/**
 * Created by beigua on 2015/8/13.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SearchDto {
    private int id;
    private String name;
}
