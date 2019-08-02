package com.risk.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.risk.helper.MyData;
import com.risk.model.CustomerDetails;
import com.risk.model.Employee;
import com.risk.model.EmployeeDetails;
import com.risk.model.Login;
import com.risk.model.OrderDetails;
import com.risk.service.CustomerDetailsService;



@Controller
public class EntryController {

	@Autowired
	CustomerDetailsService customerdetailsserviceobj;

	/*
	 * @RequestMapping(value="/success") public String show(Model model) {
	 * List<Login> loginlist=loginserviceobj.getlogindetails();
	 * model.addAttribute("employeedetails", new EmployeeDetails()); return "Login";
	 * 
	 * }
	 */

	int billnumber = 100;

	@RequestMapping(value = "/billprocess", method = RequestMethod.GET)
	public String BillPage(Model model) {

		/**
		 * Random rand = new Random(); int rand_int1 = rand.nextInt(1000);
		 */

		billnumber++;
		List<MyData> billList = customerdetailsserviceobj.getcustomerdetails();

		/*
		 * List<MyData> list=new ArrayList();
		 * 
		 * for(CustomerDetails arr:customerlist) {
		 * 
		 * arr.getOrderDetails(); MyData myobj=new MyData();
		 * myobj.setFname(arr.getFname()); myobj.setPhone(arr.getPhone());
		 * myobj.setFoodItemName(arr.getOrderDetails().get(0).getFoodItemName());
		 * myobj.setFoodItemPrice(arr.getOrderDetails().get(1).getFoodItemPrice());
		 * myobj.setQuantity(arr.getOrderDetails().get(2).getQuantity());
		 * myobj.setAmount(arr.getOrderDetails().get(3).getAmount()); list.add(myobj); }
		 */
		model.addAttribute("billNo", billnumber);
		model.addAttribute("billlist", billList);

		return "Bill";

	}

}
