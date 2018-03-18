package com.jwt.madan.repository;

import com.jwt.madan.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDAO extends JpaRepository<Task, Long> {

}
