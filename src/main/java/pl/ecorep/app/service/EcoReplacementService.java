package pl.ecorep.app.service;

import java.util.List;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import pl.ecorep.app.model.EcoReplacement;
import pl.ecorep.app.repository.EcoReplacementRepository;

@RequiredArgsConstructor
@Service
public class EcoReplacementService {

	private final EcoReplacementRepository replacementRepository;

	public List<EcoReplacement> find(List<String> tags) {
		return replacementRepository.findAllByTags(tags);
	}
}
