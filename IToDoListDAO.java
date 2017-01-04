package il.ac.shenkar.todolist.model;

import java.util.List;

/**
*	To Do List Data Access Object Interface - Declaration Of Possible Functions
*/
public interface ToDoListDAO {
  
	public void addUser(User user) throws ToDoListException;

	public void deleteUser(User user) throws ToDoListException;

  	public User getUser(String userName) throws ToDoListException;

	public List<User> getAllUsers() throws ToDoListException;
  
  	public void updateUser(User user) throws ToDoListException;

	public User login(User user) throws ToDoListException;

	public void addTask(Task task) throws ToDoListException;

	public void deleteTask(Task task) throws ToDoListException;
  
	public List<Item> getAllTasks() throws ToDoListException;

	public void updateTask(Task task) throws ToDoListException;
}
