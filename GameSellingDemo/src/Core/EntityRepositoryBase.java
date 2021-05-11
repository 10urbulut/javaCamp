package Core;

public class EntityRepositoryBase<TEntity> implements IEntityRepository<TEntity>{

	@Override
	public TEntity add(TEntity entity) {
		Messages.addMessage();
		return entity;
	}

	@Override
	public TEntity delete(TEntity entity) {
		Messages.deleteMessage();
		return entity;
	}

	@Override
	public TEntity update(TEntity entity) {
		Messages.updateMessage();
		return entity;
	}
	
}
