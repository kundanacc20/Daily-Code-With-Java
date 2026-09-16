package javagenerics.day16september2026;

import java.util.Optional;

public interface Repository<T,ID> {
    void save(ID id, T entity);
    Optional<T> findById(ID id);
    void deleteById(ID id);
}
/*
Problem 4.1 — Generic Interface: Repository Pattern

Design a generic Repository<T, ID> interface with basic
CRUD operations, and implement it with an in-memory HashMap.
 */
