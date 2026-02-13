package com.kodnest.mappingproject2;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int gid;
	@Column
	String gname;
	@Column
	String gloc;
	@ManyToOne
	@JoinColumn(name="playerid")
	Player player;
	
	public Game() {
		
	}

	public Game(int gid, String gname, String gloc) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gloc = gloc;
	}

	public Game(String gname, String gloc) {
		super();
		this.gname = gname;
		this.gloc = gloc;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getGloc() {
		return gloc;
	}

	public void setGloc(String gloc) {
		this.gloc = gloc;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Game [gid=" + gid + ", gname=" + gname + ", gloc=" + gloc + ", player=" + player + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gid, gloc, gname, player);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return gid == other.gid && Objects.equals(gloc, other.gloc) && Objects.equals(gname, other.gname)
				&& Objects.equals(player, other.player);
	}
	
	
}
