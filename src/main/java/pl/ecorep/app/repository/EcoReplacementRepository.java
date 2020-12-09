package pl.ecorep.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import pl.ecorep.app.model.EcoReplacement;

@Repository
public interface EcoReplacementRepository extends MongoRepository<EcoReplacement, String> {

	@Query(value = "{ tags: { $all: ?0} }")
	List<EcoReplacement> findAllByTags(List<String> tags);
}
