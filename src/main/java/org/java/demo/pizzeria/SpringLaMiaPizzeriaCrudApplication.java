package org.java.demo.pizzeria;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.java.demo.pizzeria.pojo.Pizza;
import org.java.demo.pizzeria.pojo.SpecialOffer;
import org.java.demo.pizzeria.service.PizzaService;
import org.java.demo.pizzeria.service.SpecialOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private PizzaService pizzaService;
	
	@Autowired
	private SpecialOfferService specialOfferService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Pizza p = new Pizza("Pizza Test", "Descrizione Test", "pt test", 1);
		System.out.println(p);
		List<Pizza> pizzas = Arrays.asList(
			    new Pizza("Margherita", "La classica pizza con pomodoro, mozzarella e basilico", "https://www.verapizzanapoli.it/wp-content/uploads/2020/07/Pizzanapoli-margherita.png", 8),
			    new Pizza("Pepperoni", "Pizza con pomodoro, mozzarella e salame pepperoni", "https://i.pinimg.com/originals/34/cd/98/34cd98a30cd58f85e25e56a9030ca06c.jpg", 10),
			    new Pizza("Funghi", "Pizza con pomodoro, mozzarella e funghi freschi", "https://thumbs.dreamstime.com/b/pizza-funghi-38306248.jpg", 9),
			    new Pizza("Quattro Formaggi", "Pizza con pomodoro e una selezione di quattro formaggi", "https://www.pizzus.it/wp-content/uploads/2019/11/focus.png", 12),
			    new Pizza("Wurstel", "Pizza con pomodoro, mozzarella e wurstel", "https://www.oipulpit.it/wp-content/uploads/2021/03/pizza-wurstel.jpg", 9),
			    new Pizza("Hawaiian", "Pizza con pomodoro, mozzarella, prosciutto cotto e ananas", "https://media.istockphoto.com/id/503580316/photo/pizza-with-pineapple-and-ham-on-white-background.jpg?s=612x612&w=0&k=20&c=CArlgKntmtUpZENENw0plUmIo3jau3TjHKQ7gPXzfZc=", 10),
			    new Pizza("Capricciosa", "Pizza con pomodoro, mozzarella, prosciutto cotto, funghi e olive", "https://italianspizza.it/wp-content/uploads/2022/06/FAMILY-PIZZA-CAPRICCIOSA-online-pizza-delivery-consegna-a-domicilio-aperti-7-giorni-su-7-eventi-mirandolo-terme-borghetto-lodigiano-lodi-milano-italia.png", 11),
			    new Pizza("Diavola", "Pizza con pomodoro, mozzarella e salame piccante", "https://www.lapastadij-momo.it/wp-content/uploads/2020/09/diavola.jpg", 10),
			    new Pizza("Vegetariana", "Pizza con pomodoro, mozzarella e una selezione di verdure", "https://italianspizza.it/wp-content/uploads/2022/06/FAMILY-PIZZA-VEGETARIANA-online-pizza-sconti-eventi-feste-delivery-consegna-a-domicilio-san-colombano-al-lambro-lambrinia-monteleone-lodi-milano-italia.png", 9)
			);
			for (Pizza pizza : pizzas) {
				pizzaService.save(pizza);
				
				
			}
			
			List<SpecialOffer> specialOffers = Arrays.asList(
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 25%", 25, pizzas.get(0)),	
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 50%", 50, pizzas.get(0)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Pizza omaggio", 100, pizzas.get(0)),	
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 10%", 10, pizzas.get(1)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 25%", 25, pizzas.get(1)),		
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 20%", 20, pizzas.get(2)),			 
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 30%", 30, pizzas.get(2)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 50%", 50, pizzas.get(3)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Pizza omaggio", 100, pizzas.get(3)),	
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 10%", 10, pizzas.get(4)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 25%", 25, pizzas.get(5)),		
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 20%", 20, pizzas.get(5)),			 
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 30%", 30, pizzas.get(6)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Pizza omaggio", 100, pizzas.get(6)),	
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 10%", 10, pizzas.get(7)),
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 25%", 25, pizzas.get(7)),		
					new SpecialOffer(LocalDate.parse("2024-01-01"),LocalDate.parse("2024-01-09"), "Sconto del 20%", 20, pizzas.get(8))
					);
			for (SpecialOffer specialOffer : specialOffers) {
				specialOfferService.save(specialOffer);
			
			}
			
	}

}
