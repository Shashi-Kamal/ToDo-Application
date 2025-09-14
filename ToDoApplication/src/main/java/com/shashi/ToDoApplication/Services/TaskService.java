package com.shashi.ToDoApplication.Services;

import com.shashi.ToDoApplication.Repositories.TaskRepository;
import com.shashi.ToDoApplication.models.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();

        task.setTitle(title);
        task.setComplete(false);

        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void taskCompleted(Long id) {
        // find the task by its id
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No task found"));
        task.setComplete(!task.isComplete());

        taskRepository.save(task);
    }
}
