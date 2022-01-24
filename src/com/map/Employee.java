package com.map;

import java.util.Objects;

public class Employee {
		int id;
		int salary;
		public Employee(int id, int salary) {
			super();
			this.id = id;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", salary=" + salary + "]";
		}
		@Override
		public int hashCode() {
			return id;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return id == other.id;
		}
		
}
