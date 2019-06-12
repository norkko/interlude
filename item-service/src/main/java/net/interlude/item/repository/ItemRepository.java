package net.interlude.item.repository;

import net.interlude.item.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

    /**
     * Returns a registered item queried by name field.
     * @param name
     */
    Item findByName(String name);

}
