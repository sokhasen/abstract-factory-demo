package com.pattern.design.abstractfactory.classes;

public class Server extends Computer {

	private final String ramCapacity;
	private final String cpuCapacity;
	private final String storageCapacity;

	public Server(String ramCapacity, String cpuCapacity, String storageCapacity) {
		this.ramCapacity = ramCapacity;
		this.cpuCapacity = cpuCapacity;
		this.storageCapacity = storageCapacity;
	}

	@Override
	public String getRAM() {
		return this.ramCapacity;
	}

	@Override
	public String getCPU() {
		return this.cpuCapacity;
	}

	@Override
	public String getStorage() {
		return this.storageCapacity;
	}
}
