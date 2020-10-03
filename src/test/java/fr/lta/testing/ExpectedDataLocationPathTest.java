package fr.lta.testing;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.lta.testing.ExpectedDataLocationPath;

public class ExpectedDataLocationPathTest {
	
	public ExpectedDataLocationPath expectedDataLocationPath;
	
	@BeforeEach
	public void beforeEach( ) {
		expectedDataLocationPath = ExpectedDataLocationPath.builder().location("toto").build();;
	}

	@Test
	public void testHasLocation() {
		ExpectedDataLocationPathAssert.assertThat(expectedDataLocationPath).hasLocation("toto");
	}
	
	@Test
	public void testToStringCustom() {
		
		Assertions.assertThat(expectedDataLocationPath.toString()).isEqualTo("ExpectedDataLocationPath(location=toto)");
		
	}
	
	@Test
	public void testEqualsTo() {
		
		Assertions.assertThat(expectedDataLocationPath).isEqualTo(ExpectedDataLocationPath.builder()
				.location("toto").build());
	}
	
	@Test
	public void testToIsNotEqualTo() {
		
		Assertions.assertThat(expectedDataLocationPath).isNotEqualTo(ExpectedDataLocationPath.builder()
				.location("titi"));
	}

}
