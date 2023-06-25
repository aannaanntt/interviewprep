package equalshashcode;

import java.util.Objects;

public class Employee {
	
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o ==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		if(o ==this ) {
			System.out.println("34-->"+o);
			System.out.println("35--->"+this);
			return true;
		}
		
		Employee e = (Employee)o;
		
		System.out.println(this.getId());
		System.out.println(e.getId());
		System.out.println(this.getId()== e.getId());
		return (this.getId() == e.getId());
		
	}
	
	
	@Override
	public int hashCode() {
		return id;
	}
	
	
}
