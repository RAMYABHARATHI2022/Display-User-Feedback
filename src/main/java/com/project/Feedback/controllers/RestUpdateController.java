package com.project.Feedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Feedback.entities.Feedback;
import com.project.Feedback.repositories.*;
import com.project.Feedback.services.FeedbackService;

@Controller
public class RestUpdateController 
{
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
    @GetMapping("/update")
    public String getEmployeeByName(@RequestParam("comment") String comment, @RequestParam("rating") int rating, @RequestParam("name") String name) {
 
    	
    	Feedback f = new Feedback(comment, rating, name);
    	feedbackRepository.save(f);
 
        return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body style=\"background-color:lightblue;\">\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
		 		+ "		<h2 class=\"hello-title\">Successfully Added Your Feedback</h2>\n"
		 		+ "		\n"
		 		+ "		<a href=\"/feedback\">Click here to view all feedback</a>\n"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
    
    public Integer count() {
    	int i = 1;
    	while(feedbackRepository.existsById(i))
    		i++;
    	return i;
    }
}
