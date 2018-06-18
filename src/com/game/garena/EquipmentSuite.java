package com.game.garena;

import java.util.*;
import java.util.stream.Collectors;

public class EquipmentSuite {
	private List<Aoyi> aoyiList = new ArrayList<>();
	private List<Equipment> weaponList = new ArrayList<>();
	private List<Equipment> fullList = new ArrayList<>();
	private CalculateContext context = null;
	private final int BASE_ATTACK;

	public EquipmentSuite(int baseAttack) {
		this.BASE_ATTACK = baseAttack;
	}

	public List<Equipment> getEquipmentList() {
		return fullList;
	}

	private void addAoyi(Aoyi e) {
		aoyiList.add(e);
		fullList.add(e);
	}

	public void addAoyis(Aoyi e, int number) {
		for (int i = 0; i < number; i++) {
			addAoyi(e);
		}
	}

	public void addWeapon(Equipment e) {
		weaponList.add(e);
		fullList.add(e);
	}

	public Set<Map.Entry<Aoyi, Integer>> getAoyiCountEntries() {
		Map<Aoyi, Integer> countMap = new HashMap<>();
		for (Aoyi e : aoyiList) {
			if (countMap.containsKey(e)) {
				countMap.put(e, countMap.get(e) + 1);
			} else {
				countMap.put(e, 1);
			}
		}

		return countMap.entrySet();
	}

	public CalculateContext getContext() {
		if (context == null) {
			context = new CalculateContext(BASE_ATTACK, getEquipmentList());
		}
		return context;
	}

	public void reCalculate() {
		context = new CalculateContext(0, getEquipmentList());
	}

	public int getPrice() {
		return getContext().getTotalPrice();
	}

	public double getCriticalHitRate() {
		return getContext().getTotalCriticalHitRate();
	}

	public double getCriticalHitEffect() {
		return getContext().getTotalCriticalHitEffect();
	}

	public double getBasicAttack() {
		return getContext().getTotalBasicAttack();
	}

	public double getCriticalDamage() {
		return getContext().getCriticalDamage();
	}

	public double getAverageDamage() {
		return getContext().getAverageDamage();
	}

	public double getAttackEffectiveness() {
		return getContext().getTotalAttackEffectiveness();
	}

	public String getWeaponDetail() {
		return String.join("\n", weaponList.stream().map(m -> m.toString()).collect(Collectors.toList()));
	}

	public String getAoyiDetail() {
		return String.join(", ",
				getAoyiCountEntries()
						.stream()
						.map(m -> String.format("%s x%s", m.getKey(), m.getValue()))
						.collect(Collectors.toList()));
	}

	public String getSummary() {
		return String.format("$%s, AttackEffectiveness(%s) CriticalHitRate(%s) CriticalHitEffect(%s) BasicAttack(%s) CriticalDamage(%s) AverageDamage(%s)"
				, getPrice(), getAttackEffectiveness(), getCriticalHitRate(), getCriticalHitEffect(), getBasicAttack(), getCriticalDamage(), getAverageDamage());
	}

	@Override
	public String toString() {
		return String.format("%s\n%s\n%s\n", getSummary(), getAoyiDetail(), getWeaponDetail());
	}
}
