package com.qa.springgolfGtiDemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@GenerateValue(strategy = GenerationType.IDENTITY)
@id
public class GolfGti {
	private long id;
	private String name;
	private int yearIntroduced;
	private double engine;
	private int valves;
	private int power;

	public GolfGti() {
	}

	public GolfGti(String name, int yearIntroduced, double engine, int valves, int power) {
		super();
		this.name = name;
		this.yearIntroduced = yearIntroduced;
		this.engine = engine;
		this.valves = valves;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public int getYearOfIntroduction() {
		return getYearOfIntroduction();
	}

	public double getEngineCapacity() {
		return getEngineCapacity();
	}

	public int getNumberOfValves() {
		return getNumberOfValves();
	}

	public int getPower() {
		return getPower();
	}

}
