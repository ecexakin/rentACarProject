package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "cars")
@Data // getter setter
@AllArgsConstructor  
@NoArgsConstructor
@Entity // veritabanı varlığısın
public class Car {

	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) // oto artan
	@Column(name = "id")
	private int id;

	@Column(name = "plate", unique = true)
	private String plate;

	@Column(name = "dailyPrice")
	private double dailyPrice;

	@Column(name = "modelYear")
	private int modelYear;

	@Column(name = "state")
	private int state;  //1 available  2 rented  3 maintanance

	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
}
