package springbootjava;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Employee {
	
 private int id;
 private String name;
 private double salary;
}
