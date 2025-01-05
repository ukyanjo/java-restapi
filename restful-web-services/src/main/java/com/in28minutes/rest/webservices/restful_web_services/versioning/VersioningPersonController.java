package com.in28minutes.rest.webservices.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersioOfPerson() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersioOfPerson() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public PersonV1 getFirstVersioOfPersonRequestParameter() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person", params = "version=2")
	public PersonV2 getSecondVersioOfPersonRequestParameter() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getFirstVersioOfPersonRequestHeader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public PersonV2 getSecondVersioOfPersonRequestHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.pp-v1+json")
	public PersonV1 getFirstVersioOfPersonAcceptHeader() {
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.pp-v2+json")
	public PersonV2 getSecondVersioOfPersonAcceptHeader() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
