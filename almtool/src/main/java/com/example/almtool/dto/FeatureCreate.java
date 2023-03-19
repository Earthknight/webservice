package com.example.almtool.dto;


import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class FeatureCreate {
    private String feature_id;
    private String feature_description;
    private String feature_title;
}
