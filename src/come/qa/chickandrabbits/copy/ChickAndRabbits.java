package come.qa.chickandrabbits.copy;

public class ChickAndRabbits {
public void chickAndRabbit(int heads, int legs) {
	int rabbit = (legs/2)-heads;
	int chicken=  heads-rabbit;
	System.out.println(chicken);
}
}
