package cn.edu.ujn.ch6.model;

import java.util.Date;

/**
 * Dlb entity. @author MyEclipse Persistence Tools
 */
public class Dlb   implements java.io.Serializable {

	// Fields

		private Integer id;
		private String xh;
		private String kl;
		private Date addtime;
		// Constructors

		/** default constructor */
		public Dlb() {
		}

		/** full constructor */
		public Dlb(String xh, String kl) {
			this.xh = xh;
			this.kl = kl;
		}

		// Property accessors

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getXh() {
			return this.xh;
		}

		public void setXh(String xh) {
			this.xh = xh;
		}

		public String getKl() {
			return this.kl;
		}

		public void setKl(String kl) {
			this.kl = kl;
		}

		public Date getAddtime() {
			return addtime;
		}

		public void setAddtime(Date addtime) {
			this.addtime = addtime;
		}

		
		
}
