package com.game.garena;

import java.util.List;

public class CalculateContext {
	protected double baseAttack;
	protected List<Equipment> equimentList;

	public CalculateContext(int baseAttack, List<Equipment> equimentList) {
		this.baseAttack = baseAttack;
		this.equimentList = equimentList;
	}

	public double getTotalCriticalHitRate() {
		return this.equimentList.stream().mapToDouble(p -> p.getCriticalHitRatePercentage()).sum() / 100.0;
	}

	public double getTotalCriticalHitEffect() {
		return this.equimentList.stream().mapToDouble(p -> p.getCriticalHitEffectPercentage()).sum() / 100.0 + 2;
	}

	public double getTotalBasicAttack() {
		return this.baseAttack + this.equimentList.stream().mapToDouble(p -> p.getAttack()).sum();
	}

	public double getCriticalDamage() {
		return getTotalBasicAttack() * getTotalCriticalHitEffect();
	}

	public double getAverageDamage() {
		return getTotalBasicAttack() * (1 - getTotalCriticalHitRate()) + getCriticalDamage() * getTotalCriticalHitRate();
	}

	public int getTotalPrice() {
		return this.equimentList.stream().mapToInt(m -> m.getPrice()).sum();
	}

	public double getTotalAttackEffectiveness() {
		return getTotalCriticalHitRate() * getTotalCriticalHitEffect() + (1 - getTotalCriticalHitRate());
	}

}
