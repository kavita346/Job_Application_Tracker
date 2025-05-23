package com.kavita.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kavita.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

}
