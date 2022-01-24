package com.pattern.design.abstractfactory.classes;

public abstract class Computer {

	public abstract String getRAM();
	public abstract String getCPU();
	public abstract String getStorage();

	@Override
	public String toString() {
    return "\n"
        + "\t- RAM\t\t\t: "
        + getRAM()
        + "\n"
        + "\t- CPU\t\t\t: "
        + getCPU()
        + "\n"
        + "\t- Storage\t: "
        + getStorage()
        + "\n";
	}
}
