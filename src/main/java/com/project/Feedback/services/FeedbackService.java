package com.project.Feedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Feedback.entities.Feedback;
import com.project.Feedback.repositories.FeedbackRepository;

@Service
public class FeedbackService 
{
	@Autowired
	private FeedbackRepository feedbackRepo;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepo.findAll();
	}

	public void addNewFeedback(Feedback fb) {
		// TODO Auto-generated method stub
		
	}
}