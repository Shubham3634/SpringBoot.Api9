package com.spring.Api9.SpringBoot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api9")
public class Controller {

	Country ct = new Country(101, "Dubai");

	@DeleteMapping("/deleteemp/{eid}")
	public ResponseEntity<String> deleteEmp(@PathVariable(value = "eid") int empid, @RequestBody Country ctr) {

		System.out.println("Needs to br delete:" + empid);
		System.out.println("Country Data:");
		System.out.println("Cid" + ctr.getCid());
		System.out.println("Country name:" + ctr.getCname());

//		ct.setCid(ctr.getCid());
//		ct.setCname(ct.getCname());

		System.out.println("Updated Country data:");
		System.out.println("Cid:" + ct.getCid());
		System.out.println("Country name:" + ct.getCname());

		return new ResponseEntity<>("Employee Data Updated..!", HttpStatus.OK);

	}

}
