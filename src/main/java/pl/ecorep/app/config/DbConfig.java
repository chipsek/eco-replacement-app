package pl.ecorep.app.config;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.bson.types.ObjectId;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.ecorep.app.model.EcoReplacement;
import pl.ecorep.app.repository.EcoReplacementRepository;

@RequiredArgsConstructor
@Configuration
public class DbConfig {

	@Bean
	public ApplicationRunner populateDBWithData(EcoReplacementRepository replacementRepository) {
		return args -> replacementRepository.saveAll(List.of(
			createSoap(),
			createTube()
		));
	}

	private EcoReplacement createSoap() {
		EcoReplacement soap = new EcoReplacement();
		soap.setId(new ObjectId().toString());
		soap.setDescription("Mydło szare to mieszanka soli potasowych, wyższych kwasów karboksylowych, gliceryny, " +
			"kwasu cytrynowego, chlorku sodu i innych.");
		soap.setName("Mydło szare");
		soap.getTags().addAll(List.of("soap", "żel", "prysznic"));
		soap.getManufacturers().add("Producer A");
		soap.getUrls().add("https://eko-familia.pl/pl/p/SZARE-MYDLO-NATURALNE-175g/23113518");
		return soap;
	}

	private EcoReplacement createTube() {
		EcoReplacement tube = new EcoReplacement();
		tube.setId(new ObjectId().toString());
		tube.setDescription("Magiczna, eco tubka");
		tube.setName("Żel trzymany w eco tubce");
		tube.getTags().addAll(List.of("żel", "prysznic"));
		tube.getManufacturers().add("Producent B");
		tube.getUrls().add("https://biosklep.com.pl/pl/p/Mleczko-Hipoalergiczne-do-Ciala-dla-Dzieci-Tubka-ECO-200-ml-Only-Bio/23788");
		return tube;
	}

}
