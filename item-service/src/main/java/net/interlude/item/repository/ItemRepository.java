package net.interlude.item.repository;

import net.interlude.item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

    /**
     * Returns a registered item queried by name field.
     * @param name
     */
    Item findByName(String name);

    /**
     * Returns a registered item queried by id field.
     * @param id
     */
    Item findById(int id);

    /**
     * Removed a registered item.
     * @param id
     */
    void removeById(int id);
}
