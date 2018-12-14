package izi.com.school.model;

import javax.persistence.*;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=100,unique = true)
	private String username;
	@Column(length=100)
	private String password;
	private int enabled;
	@Column(length=100)
	private String prenom;
	@Column(length=256,nullable = true)
	private String img;
	@Column(length=50)
	private String nom;
	@Column(length=10,unique = true)
	private String matricule;


}
