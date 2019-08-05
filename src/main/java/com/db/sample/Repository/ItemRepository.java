package com.db.sample.Repository;

import com.db.sample.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
