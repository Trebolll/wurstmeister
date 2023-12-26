package ru.nsk.orderservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.nsk.orderservice.entity.Order;

@SuppressWarnings("unused")
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
