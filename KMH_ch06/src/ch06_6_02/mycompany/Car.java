package ch06_6_02.mycompany;

import ch06_6_02.hankook.*;
import ch06_6_02.kumho.*;
import ch06_6_02.hyundai.Engine;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	ch06_6_02.hankook.Tire tire3 = new ch06_6_02.hankook.Tire();
	ch06_6_02.kumho.Tire tire4 = new ch06_6_02.kumho.Tire();
}