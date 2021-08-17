package com.alivin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Cat {
    @Value("旺旺旺")
    private String name;
    @Value("3")
    private Integer age;
}
