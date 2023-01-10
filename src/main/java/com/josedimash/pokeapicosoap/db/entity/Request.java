package com.josedimash.pokeapicosoap.db.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Request {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fiid;
	@Column
	private String fcipOrigin;
	@Column
	private Timestamp fddate;
	@Column
	private String fcmethod;

	public Request() {
	}

	public Request(Long fiid, String fcipOrigin, Timestamp fcdate, String fcmethod) {
		this.fiid = fiid;
		this.fcipOrigin = fcipOrigin;
		this.fddate = fcdate;
		this.fcmethod = fcmethod;
	}

	public Long getFiid() {
		return fiid;
	}

	public void setFiid(Long fiid) {
		this.fiid = fiid;
	}

	public String getFcipOrigin() {
		return fcipOrigin;
	}

	public void setFcipOrigin(String fcipOrigin) {
		this.fcipOrigin = fcipOrigin;
	}

	public Timestamp getFddate() {
		return fddate;
	}

	public void setFddate(Timestamp fcdate) {
		this.fddate = fcdate;
	}

	public String getFcmethod() {
		return fcmethod;
	}

	public void setFcmethod(String fcmethod) {
		this.fcmethod = fcmethod;
	}

	@Override
	public String toString() {
		return "Request{" + "id=" + fiid + ", ipOrigin='" + fcipOrigin + '\'' + ", time=" + fddate + ", method='" + fcmethod
				+ '\'' + '}';
	}

}
