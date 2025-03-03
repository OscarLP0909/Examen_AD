package org.example.examen_ad;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends MongoRepository<Item, String> {
    Item findItemByTitle(String title);

    Item findItemById(String _id);
    List<Item> findItemByCategory(String category);
    Item findItemByPrice(Double price);
    Item findItemByRate(Double rate);
    Item findItemByCount(Integer count);
    Item findItemByImage(String image);
    List<Item> findByCategory(String category);

    @Query("{ 'price' : ?0 }")
    Item itemByPrice(Double price);


}
