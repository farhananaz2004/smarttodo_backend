package com.example.Smart_to_do.Repository;

import com.example.Smart_to_do.Entity.Priority;
import com.example.Smart_to_do.Entity.Status;
import com.example.Smart_to_do.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(Status status);
    List<Task> findByPriority(Priority priority);

}
