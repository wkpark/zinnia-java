package net.unit8.zinnia;

import java.io.IOException;

import org.junit.Test;

public class TrainerTest {

	@Test
	public void testConvert() throws IOException {
		Trainer trainer = new Trainer();
		trainer.convert("handwriting-ja.model.txt"
				, "handwriting-ja.model", 0.00001f);
	}
}