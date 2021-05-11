package Core;



public interface IEntityRepository<T> {
	T add(T entity);
	T delete(T entity);
	T update(T entity);
	

}
