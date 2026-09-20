package javagenerics.day16september2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryRepository<T,ID> implements Repository<T,ID> {
    private final Map<ID,T> store = new HashMap<>();
    @Override
    public void save(ID id, T entity) {
        store.put(id,entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteById(ID id) {
        store.remove(id);
    }
}
