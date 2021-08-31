package business.abstracts;

import java.util.List;

public interface BaseService<T> {
	void add(T entity);
	List<T> getAll();
	void update(T entity);
	void delete(T entity);
}
