package com.example.taskmanagerapp.service;

import com.example.taskmanagerapp.beans.Task;

/**
 * Interface TaskService
 * @author Rute Pereira & Marta Costa
 *
 */
public interface TaskService {
	
	/**
	 * Add new task 
	 * @param [Task] t : task object
	 * @return [boolean] true if task added, false otherwise
	 */
	public boolean addTask(Task t);
	
	/**
	 * Update an existing task 
	 * @param [Task] t : task object
	 * @return [boolean] true if task added, false otherwise
	 */
	public boolean updateTask(Task t, long id);
	
	 /**
	  * Delete existing task
	  * @param [int] id : task's id
	  * @return [boolean] true if task deleted, false otherwise
	  */
	public boolean deleteTask(long id);
	
	/**
	 * Gets the task by the id
	 * @param [int] id : task's id
	 * @return [Task] the task object
	 */
	public Task getTask(long id);
	
	 /**
	  * Change status of an existing task
	  * @param [int] id : task's id
	  * @param [boolean] status : the new task status
	  * @return [boolean] true if status changed, false otherwise
	  */
	public boolean changeTaskStatus(long id, boolean status);
	
	/**
	 * Gets all existing tasks
	 * @return [Task[]] array containing all the task objects
	 */
	public Task[] getAllTasks();
	
	/**
	 * Gets all existing tasks by status
	 * @return [Task[]] array containing all the task objects with the requested status
	 */
	public Task[] getAllTasksByStatus(boolean status);
	
	/**
	 * Get percentage of existing open tasks
	 * @return percentages [0 -> 1] [open tasks, closed tasks]
	 */
	public Float getPercentageOfOpenTasks();
}
