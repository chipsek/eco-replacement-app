package pl.ecorep.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@AllArgsConstructor
public class EcoReplacement {

	@Id
	private String id;
	private String name;
	private String description;
	private List<String> manufacturers;
	private List<String> tags;
	private List<String> urls;
}
