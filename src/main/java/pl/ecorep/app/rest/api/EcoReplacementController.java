package pl.ecorep.app.rest.api;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.ecorep.app.model.EcoReplacement;
import pl.ecorep.app.service.EcoReplacementService;

@RestController
@RequiredArgsConstructor
public class EcoReplacementController {

	private final EcoReplacementService service;

	@GetMapping(value = "/search/{tags}")
	public List<EcoReplacement> findEcoReplacement(@PathVariable List<String> tags) {
		return service.find(tags);
	}
}