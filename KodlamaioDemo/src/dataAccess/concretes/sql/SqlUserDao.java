package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class SqlUserDao implements UserDao {

	List <User> users;
	
	public SqlUserDao() {
		this.users = new ArrayList<User>();
	}
	
	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void add(User entity) {
		users.add(entity);
		
	}

	@Override
	public void update(User entity) {

		int index = this.users.indexOf(entity);
		User user = this.users.get(index);
		
		user.seteMail(entity.geteMail());
		user.setFirstName(entity.getFirstName());
		user.setLastName(entity.getLastName());
		user.setImagePath(entity.getImagePath());
		user.setPassword(entity.getPassword());
		user.setId(entity.getId());
		
	}

	@Override
	public void delete(User entity) {
		users.remove(entity);
	}

}
