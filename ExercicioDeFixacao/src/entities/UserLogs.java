package entities;

import java.util.Objects;

public class UserLogs implements Comparable<UserLogs>{
	
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public UserLogs(String line) {
	    String[] fields = line.split(" "); 
	    this.user = fields[0]; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserLogs other = (UserLogs) obj;
		return Objects.equals(user, other.user);
	}

	@Override
	public int compareTo(UserLogs other) {
		return this.user.toUpperCase().compareTo(other.getUser().toUpperCase());
	}

	@Override
	public String toString() {
		return "UserLogs [user=" + user + "]";
	}

	

}
