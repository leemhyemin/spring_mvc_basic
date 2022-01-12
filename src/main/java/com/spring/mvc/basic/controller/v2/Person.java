package com.spring.mvc.basic.controller.v2;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int stature; //키
    private int weight; //몸무게
    private String name; //이름
}
