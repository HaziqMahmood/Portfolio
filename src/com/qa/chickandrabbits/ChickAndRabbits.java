package com.qa.chickandrabbits;

public class ChickAndRabbits {
public void chickAndRabbit(int heads, int legs) {
	int rabbit = (legs/2)-heads;
	int chicken=  heads-rabbit;
	System.out.println(chicken);
}
}
