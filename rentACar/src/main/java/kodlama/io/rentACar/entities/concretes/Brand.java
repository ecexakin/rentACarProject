package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data //getter setter
@AllArgsConstructor
@NoArgsConstructor
@Entity //veritabanı varlığısın
public class Brand {
	
	
	@Id //pk 
	@GeneratedValue(strategy = GenerationType.IDENTITY)//oto artan
	@Column(name="id")
	private int id; 
	
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "brand")      // one brand  many model
	private List<Model> models;
	
	
}


	