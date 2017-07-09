package com.example.taskmanagerapp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.example.taskmanagerapp.beans.Task;

/**
 * Class TaskServiceImpl
 * @author Rute Pereira & Marta Costa
 *
 */
public class TaskServiceImpl implements TaskService{

	private static Map<Long,Task> tasks = new HashMap<Long,Task>();
	
	@Override
	public boolean addTask(Task t) {
		if(tasks.get(t.getId()) != null) return false;
		tasks.put(t.getId(), t);
		return true;
	}
	
	@Override
	public boolean updateTask(Task t, long id) {
		if(tasks.get(id) == null) return false;
		tasks.put(t.getId(), t);
		return true;
	}

	@Override
	public boolean deleteTask(long id) {
		if(tasks.get(id) == null) return false;
		tasks.remove(id);
		return true;
	}
	
	@Override
	public boolean changeTaskStatus(long id, boolean status){
		if(tasks.get(id) == null) return false;
		tasks.get(id).setStatus(status);
		return true;
	}

	@Override
	public Task getTask(long id) {
		return tasks.get(id);
	}

	@Override
	public Task[] getAllTasks() {
		Set<Long> ids = tasks.keySet();
		Task[] t = new Task[ids.size()];
		int i=0;
		for(long id : ids){
			t[i] = tasks.get(id);
			i++;
		}
		return t;
	}

	@Override
	public Task[] getAllTasksByStatus(boolean status) {
		Set<Long> ids = tasks.keySet();
		int i=0;
		for(long id : ids){
			if (tasks.get(id).getStatus() == status) {
				i++;
			}
		}
		Task[] t = new Task[i];
		int j=0;
		for(long id : ids){
			if (tasks.get(id).getStatus() == status) {
				t[j] = tasks.get(id);
				j++;
			}
		}
		return t;
	}

	@Override
	public Float getPercentageOfOpenTasks() {
		Task[] allTasks = getAllTasks();
		Task[] allOpenTasks = getAllTasksByStatus(false);
		Float percentageOpen = Float.valueOf(0);
		if (allTasks.length > 0 && allOpenTasks.length > 0) {
			percentageOpen = Float.valueOf((float)allOpenTasks.length / allTasks.length);
		}
		else if (!(allTasks.length > 0)) {
			percentageOpen = -1f;
		}
		return percentageOpen;
	}
}
