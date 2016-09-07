package com.GrandCircus.MyControllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "main", method = RequestMethod.GET)
	public String mainMethod(Model model) {

		String[] ar = { "Hello Class1", "SO EASY", "Google IT INC." };
		model.addAttribute("message", ar); // adding data to our model

		return "mainPage";
		// which view the data will be returned on

	}

	@RequestMapping(value = "gb", method = RequestMethod.GET)
	public String byeMethod(Model model) {

		model.addAttribute("message2", "Good Bye!");

		return "gbPage";
	}

	@RequestMapping(value = "formPage", method = RequestMethod.GET)
	public String processForm(HttpServletRequest request, Model model) {

		String name = request.getParameter("name");
		String coffeeType = request.getParameter("coffeetype");

		if ((name.length() < 10) || (name.length() > 25)) {
			model.addAttribute("message3", "Name is not in range");

			return "errorMessage";

		} else {

			model.addAttribute("name", name);
			model.addAttribute("coffeetype", coffeeType);

			return "success";

		}
	}

	@RequestMapping(value = "myForm", method = RequestMethod.GET)
	public String processForm() {
		return "myForm";
	}
}
