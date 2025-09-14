package com.shashi.ToDoApplication.Repositories;

import com.shashi.ToDoApplication.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
