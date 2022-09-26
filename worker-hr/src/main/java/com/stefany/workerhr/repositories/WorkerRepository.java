package com.stefany.workerhr.repositories;

import com.stefany.workerhr.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
