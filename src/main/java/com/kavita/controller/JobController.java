package com.kavita.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavita.Service.JobService;
import com.kavita.model.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

	
	@Autowired
	private JobService jobService;
	
	@PostMapping("/register")
	public Job createJob(@RequestBody Job job1) {
		return jobService.saveJob(job1);
	}
	
	@GetMapping
	public List<Job> getAllJobs(){
		return jobService.getAllJobs();
	}
	
	@GetMapping("/{id}")
	public Optional<Job> getJobById(@PathVariable Long id){
		return jobService.getJobById(id);	
	}
	
	@DeleteMapping("/{id}")
	public void deleteJobId(@PathVariable Long id) {
		jobService.deleteJobId(id);
	}
	
	@PutMapping("/{id}")
	public Job update(@PathVariable Long id, @RequestBody Job job) {
		return jobService.updateJob(id, job);
	}
	
	
}
