package com.shinhan.day07.Lab1;

public class Speaker implements Volume{
	
	int VolLevel;
	
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		if(VolLevel > 100) VolLevel = 100;
		System.out.println(getClass().getSimpleName() + " 볼륨 올립니다." + VolLevel);
		
		/*
		 * if(level > 100) { VolLevel = 100; } else { VolLevel += level; }
		 * System.out.println("speak 볼륨 올립니다." + VolLevel);
		 */
		
	}

	@Override
	public void volumeDown(int level) {
		if((VolLevel-level) <= 0) {
			VolLevel = 0;
		}else {
			VolLevel -= level;
		}
		System.out.println(getClass().getSimpleName() +" 볼륨 내립니다. " + VolLevel);
	}

	

}
