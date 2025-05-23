package com.kavita.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kavita.Repository.JobRepository;
import com.kavita.model.Job;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;
	
	public Job saveJob(Job job) {
		return jobRepository.save(job);
	}
	
	public List<Job> getAllJobs(){
		return jobRepository.findAll();
	}

	public Optional<Job> getJobById(Long id){
		return jobRepository.findById(id);	
	}
	
	public void deleteJobId(Long id) {
		 jobRepository.deleteById(id);;
	}
	
	public  Job updateJob(Long id, Job updateJob) {
		Job job2 = jobRepository.findById(id).orElseThrow();
		job2.setCompany(updateJob.getCompany());
		job2.setPosition(updateJob.getPosition());
		job2.setStatus(updateJob.getStatus());
		job2.setLocation(updateJob.getLocation());
		job2.setAppliedDate(updateJob.getAppliedDate());
		
			return jobRepository.save(job2);
		
		
		
		
		
		
		
	}
	
	
}
