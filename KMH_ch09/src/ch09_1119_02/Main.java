package ch09_1119_02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
//		Parent parent = new Parent(){	
//			int age =10;
//		
//		public void ShowInfo() {
//			System.out.println("My name is " +  name);
//			System.out.println("My age is " +  age);
//		
////		Parent parent = new Child();
// 			};
//		};
//		m.Check(parent); // 이 두 줄을 잘 사용 안하는 이유는 길어지기 때문.
//		
////		m.Check(new Parent());
//	}

		m.Check(
				new Parent(){
					int age =10;					
					public void ShowInfo() {
						System.out.println("My name is " +  name);
						System.out.println("My age is " +  age);	

//					Parent parent = new Child();
			 			}
					}
				);

//		m.Check(new Parent());
	}
	void Check(Parent parent) {
		parent.ShowInfo();
	}
}