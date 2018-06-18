package com.game.garena;

import java.util.ArrayList;
import java.util.List;

public class EquipmentSuiteStore {
	public static final int BASE_ATTACK = 376;

	private static final List<EquipmentSuite> equipmentSuiteList = new ArrayList<>();

	public static EquipmentSuite get(int suiteNumber) {
		if (equipmentSuiteList.isEmpty()) {
			init();
		}
		return equipmentSuiteList.get(suiteNumber);
	}

	private static EquipmentSuite lastSuite() {
		return equipmentSuiteList.get(equipmentSuiteList.size() - 1);
	}

	public static void init() {
		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_RATE, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.BLOODY_BOW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_EFFECT, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.BLOODY_BOW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_RATE, 10);
		lastSuite().addWeapon(EquipmentStore.BLOODY_SWORD);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.DOUBLE_KNIFE);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_EFFECT, 10);
		lastSuite().addWeapon(EquipmentStore.BLOODY_SWORD);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.DOUBLE_KNIFE);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_RATE, 10);
		lastSuite().addWeapon(EquipmentStore.BLOODY_SWORD);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_EFFECT, 10);
		lastSuite().addWeapon(EquipmentStore.BLOODY_SWORD);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_RATE, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_EFFECT, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.KING_SWORD);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_RATE, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.BLOODY_BOW);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

		equipmentSuiteList.add(new EquipmentSuite(BASE_ATTACK));
		lastSuite().addAoyis(EquipmentStore.AOYI_BLOOD_CRITICAL, 10);
		lastSuite().addAoyis(EquipmentStore.AOYI_CRITICAL_EFFECT, 10);
		lastSuite().addWeapon(EquipmentStore.HOLY_SWORD);
		lastSuite().addWeapon(EquipmentStore.DRAGON_CLAW);
		lastSuite().addWeapon(EquipmentStore.BLOODY_BOW);
		lastSuite().addWeapon(EquipmentStore.SKY_CLOUD);

	}

}
