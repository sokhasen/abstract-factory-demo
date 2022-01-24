package com.pattern.design.abstractfactory.factory;

import com.pattern.design.abstractfactory.classes.Computer;

public abstract class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
