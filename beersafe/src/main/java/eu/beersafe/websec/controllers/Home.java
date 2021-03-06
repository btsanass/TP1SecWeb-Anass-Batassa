package eu.beersafe.websec.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import eu.beersafe.websec.filters.session.Session;
import eu.beersafe.websec.logger.Logger;

@Controller
public class Home extends AbstractController {

	@RequestMapping("/Home")
	public ModelAndView doGet(HttpServletRequest request) {
		try {
			Logger.info("GET /Home");
	        return new ModelAndView("home");
		}
		catch(Exception e) {
			Logger.error("Unexpected error occurred. Aborting the operation", e);
			return handleError("Unexpected error occurred.", e);
		}
	}
	
}
