package model;

import lombok.*;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lesson implements Serializable {

    private  String name;
    private  int duration;
    private  String lecturerName;
    private  double price;


}