package ogrenci_bilgi_sistemi;

public class Student {

	String name;
	String stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double avaragef;
	double avaragek;
	double avaragem;
	double avarage;
	boolean isPass;

	public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {

		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.isPass = false;
	}

	public void addBulkExamNote(int mat, int fizik, int kimya) {

		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}

		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}

		if (kimya >= 0 && kimya <= 100) {
			this.kimya.note = kimya;
		}
	}

	public void addBulSozluNote(int mat, int fizik, int kimya) {

		if (mat >= 0 && mat <= 100) {
			this.mat.sozlu = ((int) (mat * 0.2));
		}
		if (fizik >= 0 && fizik <= 100) {
			this.fizik.sozlu = ((int) (fizik * 0.2));
		}
		if (kimya >= 0 && kimya <= 100) {
			this.kimya.sozlu = ((int) (kimya * 0.2));
		}
	}

	public void isPass() {

		if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
			System.out.println("Notlar tam olarak girilmemiş.");
		} else {
			this.isPass = isCheckPass();
			printNote();
			System.out.println("Ortalama :" + this.avarage);
			if (this.isPass) {
				System.out.println("Sınıfı geçti.");
			} else {
				System.out.println("Sınıfta kaldı.");
			}
		}
	}

	public void calcAvarage() {
		this.avaragef = (this.fizik.note + this.fizik.sozlu) / 2;
		this.avaragem = (this.mat.note + this.mat.sozlu) / 2;
		this.avaragek = (this.kimya.note + this.kimya.sozlu) / 2;
		this.avarage = (this.avaragef + this.avaragem + this.avaragek) / 3;
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printNote() {
		System.out.println("================");
		System.out.println("Öğrenci: " + this.name);
		System.out.println("Matematik Notu : " + this.avaragem);
		System.out.println("Fizik Notu : " + this.avaragef);
		System.out.println("Kimya Notu :" + this.avaragek);
	}

}
