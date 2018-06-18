package com.game.garena;

public class Aoyi extends Equipment {
	public Aoyi(String name, int attack, double criticalHitRatePercentage, double criticalHitEffectPercentage) {
		super(name, 0, attack, criticalHitRatePercentage, criticalHitEffectPercentage);
	}

	@Override
	public String toString() {
		if (criticalHitRatePercentage > 0 && criticalHitEffectPercentage > 0 && attack > 0)
			return String.format("%s[CriticalHitRate(%s%%) CriticalHitEffect(%s%%) Attack(%s)]", name, criticalHitRatePercentage, criticalHitEffectPercentage, attack);
		else if (criticalHitRatePercentage > 0 && criticalHitEffectPercentage > 0 )
			return String.format("%s[CriticalHitRate(%s%%) CriticalHitEffect(%s%%)]", name, criticalHitRatePercentage, criticalHitEffectPercentage);
		else if (criticalHitRatePercentage > 0)
			return String.format("%s[CriticalHitRate(%s%%)]", name, criticalHitRatePercentage);
		else if (criticalHitEffectPercentage > 0 )
			return String.format("%s[CriticalHitEffect(%s%%)]", name, criticalHitEffectPercentage);
		else
			return name;
	}
}
