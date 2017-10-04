/**
 * 
 */
package com.gagan.restful.helloworld.user;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Gagan
 *
 */
@RestController
@RequestMapping("user")
public class Registration  {
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/txt")
	public String defaultRequest() {
		return "Invalid Request";
	}

	@RequestMapping(value = "/{name}.json", method = RequestMethod.GET, produces = "application/json")
	public User GetUserJSON(@PathVariable String name) {
		User user = new User();
		user.setName(name);
		user.setAccount("Admin");
		user.setPassword("pswd");
		return user;
	}
	
	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	public User GetUserXML(@PathVariable String name) {
		User user = new User();
		user.setName(name);
		user.setAccount("Admin");
		user.setPassword("pswd");
		return user;
	}
	
//	@RequestMapping(value = "/print/{msg}", method = RequestMethod.GET, , produces = "application/html")
//	public String hello(ModelMap model, @PathVariable String msg) {
//		model.addAttribute("message", msg);
//		return "plaintext";
//	}

}
