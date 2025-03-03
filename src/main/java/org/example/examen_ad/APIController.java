package org.example.examen_ad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired ItemRepository itemRepository;

    @GetMapping("/")
    public List<Item> all() {
        return itemRepository.findAll();
    }

    @GetMapping("/id/{_id}")
    public Item findById(@PathVariable String _id) {
        return itemRepository.findById(_id).get();
    }

    @GetMapping("/category/{category}")
    public List<Item> findByCategory(@PathVariable String category) {
        return itemRepository.findByCategory(category);
    }

    @PostMapping("/")
    public Item create(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping("/{_id}")
    public void delete(@PathVariable String _id) {
        itemRepository.deleteById(_id);
    }

}
