package com.sjd.springcontext;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.jonpeterson.spring.mvc.versioning.VersionedResponseBody;
import com.sjd.domain.Car;

@RestController
@RequestMapping("/api")
public class VersionedController
{
	@RequestMapping(method = RequestMethod.POST, path = "/createCar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@VersionedResponseBody(defaultVersion = "2", headerName = "Model-Version", queryParamName = "modelVersion")
	public Car createCar (@RequestBody Car car)
	{
		return car;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/getCar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@VersionedResponseBody(defaultVersion = "2", headerName = "Model-Version", queryParamName = "modelVersion")
	public Car getCar ()
	{
		return new Car();
	}
}
