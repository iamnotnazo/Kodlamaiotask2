

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(1, "C# + Angular" , "%0", "Engin DEM�RO�");
		
		Courses courses2 = new Courses();
		courses2.number = 2;
		courses2.name = "Java + React";
		courses2.completed = "%36";
		courses2.educator = "Engin DEM�RO�";
		
		Courses courses3 = new Courses();
		courses3.number = 3;
		courses3.name = "Programlamaya Giri� i�in Temel Kurs";
		courses3.completed = "%100";
		courses3.educator = "Engin DEM�RO�";
		
		
		Courses[] coursess = {courses1,courses2,courses3};
		
		System.out.println("KURSLAR");
		
		
		for(Courses courses : coursess) {
			System.out.println("Ka��nc� Kurs : " +courses.number);
			System.out.println("Kurs Ad� : " + courses.name);
			System.out.println("Tamamlama Y�zdesi : " + courses.completed);
			System.out.println("E�itmen Hoca : "+ courses.educator);
			System.err.println("<><><><><><><><><><><><><>");
			
		}
		Category category1 = new Category(1, "T�m�");
		
		Category category2 = new Category();
		category2.name = "Programlama";
		category2.number = 2;
		
		Category[] categories = {category1,category2};
		
		System.out.println("KATEGOR�LER");
		
		for(Category category : categories) {
			System.out.println("Ka��nc� Kategori : " + category.number);
			System.out.println("Hangi Kategori : " + category.name);
			System.err.println("--------------------------");
		}
		
		Educator educator1 = new Educator(1, "T�m�");
		
		Educator educator2 = new Educator();
		educator2.name = "Engin DEM�RO�";
		educator2.number = 2;
		
		Educator[] educators = {educator1,educator2};
		System.err.println("E��TMENLER");
		
		for(Educator educator : educators) {
			System.out.println("Ka��nc� E�itmen : " + educator.number);
			System.out.println("Hangi E�itmen : " + educator.name);
			System.err.println("-------------------------");
			
		}

		

	}

}
