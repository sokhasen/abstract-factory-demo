package com.pattern.design.abstractfactory.factory;

import com.pattern.design.abstractfactory.classes.Computer;
import com.pattern.design.abstractfactory.classes.Server;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String cpu;
	private String ssd;

	@Override
	public Computer createComputer() {
		return new Server(
			this.ram,
			this.cpu,
			this.ssd
		);
	}
}
