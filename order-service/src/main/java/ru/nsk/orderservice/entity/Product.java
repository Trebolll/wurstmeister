package ru.nsk.orderservice.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Product implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @NotNull
    private String id;

    @NotNull
    private String name;

    private String description;

    private String modelNumber;

    @NotNull
    private String manufacturerName;

    @NotNull
    @Min(value = 0, message = "Price cannot be less than zero")
    private Double price;

    private String detailInfo;

    private String imageUrl;

    @NotNull
    @Min(value = 0, message = "Quantity cannot be less than zero")
    private Integer quantity;

}
