package Model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int address_id;
	
		private String area;
		private String state;
	    private String city;
	    private String pincode;
	    
	   
	    
		public int getAddress_id() {
			return address_id;
		}
		public void setAddress_id(int address_id) {
			this.address_id = address_id;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public Address() {
			super();
		}
		@Override
		public String toString() {
			return "Address [address_id=" + address_id + ", area=" + area + ", state=" + state + ", city=" + city
					+ ", pincode=" + pincode + "]";
		}
		
}
