class Book {

	int pages;
	String autor;
	String title;

	String info() {
		return "Title is: " + title + ". The autor is: " + autor
				+ ". It contents  " + pages + " pages";
	}

	public Book() {
		this("Cinderella", "No idea", 10);
	}

	public Book(String title, String autor, int pages) {
		this.title = title;
		this.autor = autor;
		this.pages = pages;

	}

	// public String getTitle() {
	// return title;

	// }

	// public String getAutor() {
	// return autor;

	// }

	// public int getPages() {
	// return pages;
	// }

	public static void main(String[] args) {

		Book book1 = new Book("Ivan book", "Master", 10);
		Book book2 = new Book();

		// System.out.println("This book' s name is " + title +
		// "It ' s autor is "
		// autor + "It contents " + pages + "pages");

		System.out.println(book1.info());
		System.out.println(book2.info());
	}

}