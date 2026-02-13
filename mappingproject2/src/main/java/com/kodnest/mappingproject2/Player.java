package com.kodnest.mappingproject2;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pid;
	@Column
	String pname;
	@Column
	String pemail;
	@Column
	String pphone;
	@Column
	float pheight;
	
	@OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
	List<Game>games;
	
	public Player() {
		
	}

	public Player(int pid, String pname, String pemail, String pphone, float pheight, List<Game> games) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pemail = pemail;
		this.pphone = pphone;
		this.pheight = pheight;
		this.games = games;
	}

	public Player(String pname, String pemail, String pphone, float pheight) {
		super();
		this.pname = pname;
		this.pemail = pemail;
		this.pphone = pphone;
		this.pheight = pheight;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}

	public float getPheight() {
		return pheight;
	}

	public void setPheight(float pheight) {
		this.pheight = pheight;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", pemail=" + pemail + ", pphone=" + pphone + ", pheight="
				+ pheight + ", games=" + games + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(games, pemail, pheight, pid, pname, pphone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(games, other.games) && Objects.equals(pemail, other.pemail)
				&& Float.floatToIntBits(pheight) == Float.floatToIntBits(other.pheight) && pid == other.pid
				&& Objects.equals(pname, other.pname) && Objects.equals(pphone, other.pphone);
	}
	
	
}
