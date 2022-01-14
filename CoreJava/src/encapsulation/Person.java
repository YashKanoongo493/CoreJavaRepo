package encapsulation;

import java.util.Date;

public class Person {

		    private String name;
		    
			private Date dob;
			
			private String Address;

			String getName() {
				return name;
			}

			void setName(String name) {
				this.name = name;
			}

			Date getDob() {
				return dob;
			}

			void setDob(Date dob) {
				this.dob = dob;
			}

			String getAddress() {
				return Address;
			}

			void setAddress(String address) {
				Address = address;
			}
}
