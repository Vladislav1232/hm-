package pau.pau.source;

public class Book {
	private int id;
	private int year;
	private int pages;
	private int price;
	private String name;
	private String author;
	private String publishingHouse;
	private String binding;

	public Book(int id, int year, int pages, int price, String name, String author, String publishingHouse,
			String binding) {
		this.id = id;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.name = name;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.binding = binding;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Book [year = " + year + ", name = " + name + ", author = " + author + ", publishingHouse = "
				+ publishingHouse + "]";
	}
}