package week4.Animal;
import java.util.ArrayList;
// public class AnimalTest{
// 	public static void main(String[] args){
// 		Animal hAnimal = new Human();
// 		Animal tAnimal = new Tiger();
// 		Animal eAnimal = new Eagle();
// 		AnimalTest test = new AnimalTest();
// 		test.moveAnimal(hAnimal);
// 		test.moveAnimal(tAnimal);
// 		test.moveAnimal(eAnimal);
// 		ArrayList<Animal> animalList = new ArrayList<Animal>();
// 		animalList.add(hAnimal);
// 		animalList.add(tAnimal);
// 		animalList.add(eAnimal);
// 		for (Animal animal : animalList) {
// 			animal.move();
// 		}
// 	}

// 	public void moveAnimal(Animal animal) {
// 		animal.move();
// 	}
// }

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	public void testDownCasting(ArrayList<Animal> animalList){
		for(Animal animal:animalList){
			if(animal instanceof Human)
				System.out.println("사람이 책을 읽습니다.");
			if(animal instanceof Tiger)
				System.out.println("호랑이가 사냥을 합니다.");
			if(animal instanceof Eagle)
				System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
		}
	}
}