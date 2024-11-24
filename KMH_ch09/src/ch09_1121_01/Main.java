package ch09_1121_01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.person.wake();
//		Person teachew = new Teacher();
//		anony.metod2(teacher);
//		Person teacher = new Person () {
//			void teach() {
//				System.out.println("teach at 11");
//			}
//			void wake() {
//				System.out.println("wake at 9");
//			}
//		};
//	}
	new Person () {
		void teach() {
			System.out.println("teach at 11");
		}
		void wake() {
			System.out.println("wake at 9");
			teach();
		}
	};
	}
}