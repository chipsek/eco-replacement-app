package pl.ecorep.app.rest.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.ecorep.app.service.EcoReplacementService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EcoReplacementController {

	private final EcoReplacementService service;

	@GetMapping(value = "/search/{tags}")
	public String findEcoReplacement(@PathVariable List<String> tags) {

		return service.find(tags);
	}
}