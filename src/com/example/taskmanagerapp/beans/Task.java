package com.example.taskmanagerapp.beans;

import java.io.Serializable;
import java.util.*;

/**
 * Task's model (class) 
 * @author Rute Pereira & Marta Costa
 *
 */
public class Task implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;

	private String title;
	private String description;
	private Date creationDate = new Date();
	private Date updateDate = new Date();
	private Date todoDate = new Date();
	private long id = System.nanoTime();
	private boolean status = false;

	/**
	 * Gets the task's title
	 * @return [String] the task's title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the task's title
	 * @param [String] title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the task's description
	 * @return [String] the task's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the task's description
	 * @param [String] description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the task's creation date
	 * @return [Date] the task's creation date
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * Gets the task's last update date
	 * @return [Date] the task's last update date
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * Sets the task's last update date
	 * @param [Date] updateDate
	 */
	public void setUpdateDate(Date updateDate) {
		if (updateDate != null) {
			this.updateDate = updateDate;
		}
	}

	/**
	 * Gets the task's to-do date
	 * @return [Date] the task's to-do date
	 */
	public Date getTodoDate() {
		return todoDate;
	}

	/**
	 * Sets the task's to-do date
	 * @param [Date] todoDate
	 */
	public void setTodoDate(Date todoDate) {
		if (todoDate != null) {
			this.todoDate = todoDate;
		}
	}

	/**
	 * Gets the task's id
	 * @return [int] id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Gets the task's status
	 * Returns true if task is completed, false otherwise
	 * @return [boolean] status
	 */
	public boolean getStatus() {
		return status;
	}

	/**
	 * Sets the task's status
	 * False for task not yet done, True for task done
	 * @param [boolean] status
	 */
	public void setStatus(boolean status) {
		if (status != this.status) {
			this.status = status;
		}
	}	
}
