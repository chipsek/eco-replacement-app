package pl.ecorep.app.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class EcoReplacement {

	@Id
	private String id;
	private String name;
	private String description;
	private List<String> manufacturers = new ArrayList<>();
	private List<String> tags = new ArrayList<>();
	private List<String> urls = new ArrayList<>();
}
