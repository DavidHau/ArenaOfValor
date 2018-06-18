package com.game.garena;

public class Equipment {
	protected final String name;
	protected final int price;
	protected final double attack;
	protected final double criticalHitRatePercentage;
	protected final double criticalHitEffectPercentage;

	public Equipment(String name, int price, int attack, double criticalHitRatePercentage, double criticalHitEffectPercentage) {
		this.name = name;
		this.price = price;
		this.attack = attack;
		this.criticalHitRatePercentage = criticalHitRatePercentage;
		this.criticalHitEffectPercentage = criticalHitEffectPercentage;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public double getAttack() {
		return attack;
	}

	public double getCriticalHitRatePercentage() {
		return criticalHitRatePercentage;
	}

	public double getCriticalHitEffectPercentage() {
		return criticalHitEffectPercentage;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equipment) {
			return this.getName().equals(((Equipment) obj).getName());
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s: $%s CriticalHitRate(%s%%) CriticalHitEffect(%s%%) Attack(%s)", name, price, criticalHitRatePercentage, criticalHitEffectPercentage, attack);
	}
}
