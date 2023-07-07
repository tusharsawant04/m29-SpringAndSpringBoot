package org.tnsif.autowirednode;

public class TextEditor {

	private SpellChecker checker;
	
	private String name;

	//DI using constructor
			public TextEditor(SpellChecker checker) {
				super();
				this.checker = checker;
				System.out.println("DI using constructor");
			}
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display(){
		checker.checkSpelling();
	}
	
}
