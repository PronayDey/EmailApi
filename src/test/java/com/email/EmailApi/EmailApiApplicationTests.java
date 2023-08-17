package com.email.EmailApi;

import com.email.EmailApi.util.PdfGeneration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailApiApplicationTests {

	@Test
	void contextLoads() {
		PdfGeneration pdf = new PdfGeneration();
		pdf.writeUsingIText();
	}

}
