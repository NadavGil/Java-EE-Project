package il.ac.shenkar.todolist.model;

import java.util.List;

/**
*	To Do List Data Access Object Interface - Declaration Of Possible Functions
*/
public interface ToDoListDAO {
  
	public boolean addUser(User user) throws ToDoListException;

	public boolean deleteUser(User user) throws ToDoListException;

  	public User getUser(String userName) throws ToDoListException;

	public List<User> getAllUsers() throws ToDoListException;
  
  	public boolean updateTask(Task task) throws ToDoListException;

	public User login(User user) throws ToDoListException;

	public boolean addTask(Task task) throws ToDoListException;

	public boolean deleteTask(Task task) throws ToDoListException;
  
	public List<Item> getAllTasks() throws ToDoListException;

	public boolean updateTask(Task task) throws ToDoListException;
}