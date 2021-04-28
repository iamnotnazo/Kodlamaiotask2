

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(1, "C# + Angular" , "%0", "Engin Demirog");
		
		Courses courses2 = new Courses();
		courses2.number = 2;
		courses2.name = "Java + React";
		courses2.completed = "%36";
		courses2.educator = "Engin Demirog";
		
		Courses courses3 = new Courses();
		courses3.number = 3;
		courses3.name = "Programlamaya Giris için Temel Kurs";
		courses3.completed = "%100";
		courses3.educator = "Engin Demirog";
		
		
		Courses[] coursess = {courses1,courses2,courses3};
		
		System.out.println("KURSLAR");
		
		
		for(Courses courses : coursess) {
			System.out.println("Kacinci Kurs : " +courses.number);
			System.out.println("Kurs Adi : " + courses.name);
			System.out.println("Tamamlama Yüzdesi : " + courses.completed);
			System.out.println("Egitmen Hoca : "+ courses.educator);
			System.err.println("<><><><><><><><><><><><><>");
			
		}
		Category category1 = new Category(1, "Tümü");
		
		Category category2 = new Category();
		category2.name = "Programlama";
		category2.number = 2;
		
		Category[] categories = {category1,category2};
		
		System.out.println("KATEGORILER");
		
		for(Category category : categories) {
			System.out.println("Kacinci Kategori : " + category.number);
			System.out.println("Hangi Kategori : " + category.name);
			System.err.println("--------------------------");
		}
		
		Educator educator1 = new Educator(1, "Tümü");
		
		Educator educator2 = new Educator();
		educator2.name = "Engin Demirog";
		educator2.number = 2;
		
		Educator[] educators = {educator1,educator2};
		System.err.println("EGITMENLER");
		
		for(Educator educator : educators) {
			System.out.println("Kacinci Egitmen : " + educator.number);
			System.out.println("Hangi Egitmen : " + educator.name);
			System.err.println("-------------------------");
			
		}

		

	}

}
