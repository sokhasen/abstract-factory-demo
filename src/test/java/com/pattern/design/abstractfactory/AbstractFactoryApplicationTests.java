package com.pattern.design.abstractfactory;

import com.pattern.design.abstractfactory.classes.Computer;
import com.pattern.design.abstractfactory.factory.ComputerAbstractFactory;
import com.pattern.design.abstractfactory.factory.ComputerFactory;
import com.pattern.design.abstractfactory.factory.PCFactory;
import com.pattern.design.abstractfactory.factory.ServerFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbstractFactoryApplicationTests {

	@Test
	void loadComputerFactory() {

		// setup pc factory
		ComputerAbstractFactory pcFactory = new PCFactory(
			"16 GB",
			"2.5 GHz",
			"1 T"
		);

		// setup server factory
		ComputerAbstractFactory serverFactory = new ServerFactory(
			"32 GB",
			"3.5 GHz",
			"5 T"
		);

		// Get product from factory
		Computer pc = ComputerFactory.getComputer(pcFactory);
		Computer server = ComputerFactory.getComputer(serverFactory);

		// Display computer product
    	System.out.println(String.format("Computer PC		: %s", pc));
    	System.out.println(String.format("Computer Server	: %s", server));

	}

}
