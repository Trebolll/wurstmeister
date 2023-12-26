package ru.nsk.orderservice.listener;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertCallback;
import org.springframework.stereotype.Component;
import ru.nsk.orderservice.entity.Order;

import java.util.Objects;

@Component
public class OrderListener implements BeforeConvertCallback<Order> {
    @Override
    public Order onBeforeConvert(Order entity, String collection) {
        System.out.println("entity.getStatus() = " + entity.getStatus());
        entity.getProducts().forEach(product -> {
        });
        if (Objects.isNull(entity.getShippingAddress().getId())) {
            ObjectId id = new ObjectId();
            String x = id.toString();
            entity.getShippingAddress().setId(id.toString());
        }
        return entity;
    }
}
