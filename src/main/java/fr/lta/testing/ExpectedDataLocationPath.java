package fr.lta.testing;
import java.nio.file.Path;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExpectedDataLocationPath {
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private byte[] data;
	
	@EqualsAndHashCode.Exclude
	private String location;
	
	@ToString.Exclude
	private Path path;
}