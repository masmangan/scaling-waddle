package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
	@Test
    public void testFiveAndFiveGivesExam()
    {
		String expected = "Em exame";
        String actual = Medias.calcular(5.0, 5.0);
        assertEquals(expected, actual);
    }

	@Test
    public void testSevenAndSevenGivesApproved()
    {
		String expected = "Aprovado";
        String actual = Medias.calcular(7.0, 7.0);
        assertEquals(expected, actual);
    }

	@Test
    public void testThreeAndThreeGivesRep()
    {
		String expected = "Reprovado";
        String actual = Medias.calcular(3.0, 3.0);
        assertEquals(expected, actual);
    }

	@Test
    public void testThree9AndThree9GivesRep()
    {
		String expected = "Reprovado";
        String actual = Medias.calcular(3.99, 3.99);
        assertEquals(expected, actual);
    }	
	
	
	@Test
    public void testThree99AndThree99GivesRep()
    {
		String expected = "Reprovado";
        String actual = Medias.calcular(3.999, 3.999);
        assertEquals(expected, actual);
    }	

	@Test
    public void testThree99AndFour01GivesRep()
    {
		String expected = "Em exame";
        String actual = Medias.calcular(3.999, 4.001);
        assertEquals(expected, actual);
    }	
	
	
}











