package ogrenci_bilgi_sistemi;

public class main {

	public static void main(String[] args) {

		Course mat = new Course("Matematik", "MAT101", "MAT");
		Course fizik = new Course("Fizik", "FZK101", "FZK");
		Course kimya = new Course("Kimya", "KMY101", "KMY");

		Teacher t1 = new Teacher("Mahmut Hoca", "90550001", "MAT");
		Teacher t2 = new Teacher("Fatma Ayşe", "90550002", "FZK");
		Teacher t3 = new Teacher("Ali Veli", "90550003", "KMY");

		mat.addTeacher(t1);
		mat.addTeacher(t2);
		mat.addTeacher(t3);

		Student s1 = new Student("İnek Şaban", 4, "1566520", mat, fizik, kimya);
		s1.addBulkExamNote(50, 20, 40);
		s1.addBulSozluNote(50, 40, 80);
		s1.isPass();

		Student s2 = new Student("Güdük Necmi", 4, "1568445", mat, fizik, kimya);
		s2.addBulkExamNote(100, 50, 40);
		s2.addBulSozluNote(45, 80, 10);
		s2.isPass();

		Student s3 = new Student("Hayta İsmail", 4, "1565844", mat, fizik, kimya);
		s3.addBulkExamNote(90, 90, 100);
		s3.addBulSozluNote(90, 100, 80);
		s3.isPass();

	}

}
