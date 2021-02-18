import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void TestMoodAnalysisEnteredEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
		moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void TestMoodAnalysisEnteredNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
		moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void TestMoodAnalysisAnyMood() throws MoodAnalyserException{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any mood");
		Assert.assertEquals("HAPPY", mood);
	}
	@Test
	public void TestMoodAnalysisSadMood() throws MoodAnalyserException{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	}
	@Test
	public void TestMoodAnalysisHappyMood() throws MoodAnalyserException{
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in happy mood");
		Assert.assertEquals("HAPPY", mood);
	}
}
