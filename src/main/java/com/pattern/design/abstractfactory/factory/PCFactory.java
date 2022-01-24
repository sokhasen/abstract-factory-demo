package com.pattern.design.abstractfactory.factory;

import com.pattern.design.abstractfactory.classes.Computer;
import com.pattern.design.abstractfactory.classes.PC;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
public class PCFactory implements ComputerAbstractFactory {

	private String ram;
	private String cpu;
	private String ssd;


	@Override
	public Computer createComputer() {
		return new PC(
			this.ram,
			this.cpu,
			this.ssd
		);
	}
}
