package org.suji.userInfo.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.suji.userInfo.model.CustomerDetails;

@RestController
public class CustomerInfo {
	List<CustomerDetails> data =null;
	int id =0;

	List<CustomerDetails> customerList = new ArrayList<CustomerDetails>();
	public CustomerInfo() {	
		
/*		CustomerDetails cust1 = new CustomerDetails(1, "S.Nayak","Watches", "s.n@g.org.",10000,2000,1000);
		CustomerDetails cust2 = new CustomerDetails(1, "M.Shara","diamond", "shara.n@g.com.",30000,2600,2000);
		customerList.add(cust1);
		customerList.add(cust2);*/
		
		
	}
	
		
	//@PostMapping(value="/userInfo", consumes = MediaType.APPLICATION_JSON)
	@RequestMapping(value = "/userInfo", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public List<CustomerDetails> postAllUserInfo(@RequestBody CustomerDetails customer) {

		id++;
		customer.setId(id);
		// customer.setOrder(id);
		customerList.add(customer);

		return customerList;
	}
	
	@RequestMapping (value="/updateUserInfo", method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public List<CustomerDetails> updateCustomer (@RequestBody CustomerDetails customer) {
		
			
		List<CustomerDetails> collect = customerList.stream()
			    .map(o -> {CustomerDetails s =customer;
			        if(o.getId() == s.getId()) {
			            return s;
			        } else {
			            return o;
			        }
			    }).collect(Collectors.toList());
		customerList.clear();
		customerList.addAll(collect);
		return customerList;
	}


	@RequestMapping(value = "/getAllcutomers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)//, produces = MediaType.APPLICATION_JSON
	@ResponseBody
	public List<CustomerDetails> getAllCustomer() {

		// List<UserDetails> customerList = new ArrayList<UserDetails>();
		// customerList.add(customer);

		return customerList;
	}
	@ResponseBody
	@RequestMapping(value = "/deleteCutomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public void deleteCustomer (@RequestBody CustomerDetails customer ) {
		long id2 = customer.getId();
		
		for (CustomerDetails cu : customerList) {
			if (cu.getId() == id2) {
				customerList.remove(cu);
				break;
			}
		}
		
		System.out.println(" customer Deleted "+ id2);
	}
	
}