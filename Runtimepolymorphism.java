package ploymorphismconcept;

 class teacher{
	void display() {
		System.out.println("teacher will teach the subject:");
	}
 }
class student extends teacher{
	void display() {
		System.out.println("student will learn the subject");
	}
}
class parents extends teacher{
	void display() {
		System.out.println("the will teach the emotions");
	}
}
