package _firstTest;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import _firstGiven.BooleanDocument;
import _firstGiven.FileReader;
import _firstWork.InvertedIndex;

@RunWith(Parameterized.class)
public class ParameterizedInvertedIndexTest {

	private static final String TEST_PATH_1 = null;
	private static final String TEST_PATH_2 = null;
	private static final String TEST_PATH_3 = null;
	
	// These Variables have to be created by hand. Cant use the algorithm or students would just copy it
	// these are only small testcollections anyway (2-10 documents), it's just about the principle after all
	private static HashMap<String, ArrayList<Integer>> testInvertedIndex1;
	private static HashMap<String, ArrayList<Integer>> testInvertedIndex2;

	private InvertedIndex testIndex;

	private ArrayList<BooleanDocument> inputCollection;
	private HashMap<String, ArrayList<Integer>> expectedIndex;
	
	public ParameterizedInvertedIndexTest(ArrayList<BooleanDocument> inputCollection, HashMap<String, ArrayList<Integer>> expectedIndex) {
		this.inputCollection = inputCollection;
		this.expectedIndex = expectedIndex;
		setupInvertedIndeces();
	}

	@Parameters
	public static List<Object[]> data() throws FileNotFoundException {
		
		// use filereader class to read in testcollections from different locations here
		ArrayList<BooleanDocument> testCollection1 = FileReader.readCollection(TEST_PATH_1);
		ArrayList<BooleanDocument> testCollection2 = FileReader.readCollection(TEST_PATH_2);
		
		return Arrays.asList(new Object[][] {
	    							{testCollection1, testInvertedIndex1},
	    							{testCollection2, testInvertedIndex2}
	    					});
	}

	@Test
	public void testInvertedIndex() {
		System.out.println(testInvertedIndex1.toString());
		assertEquals(expectedIndex, new InvertedIndex(inputCollection).getInvertedIndexHashmap());
	}
	
	// Horrible!!! has to be done SOMWHERE else
	private void setupInvertedIndeces() {
		testInvertedIndex1 = new HashMap<>();
		testInvertedIndex2 = new HashMap<>();
		
		setup1(testInvertedIndex1);
		setup2(testInvertedIndex2);
	}

	private void setup1(HashMap<String, ArrayList<Integer>> testInvertedIndex) {
		testInvertedIndex.put("bush", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3})));
		testInvertedIndex.put("suck", new ArrayList<Integer>(Arrays.asList(new Integer[] {1})));
		testInvertedIndex.put("donkey", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2})));
		testInvertedIndex.put("boner", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3})));
		testInvertedIndex.put("because", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2})));
		testInvertedIndex.put("republican", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3})));
		testInvertedIndex.put("are", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2})));
		testInvertedIndex.put("stupid", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2})));
		testInvertedIndex.put("all", new ArrayList<Integer>(Arrays.asList(new Integer[] {1})));
		testInvertedIndex.put("tree", new ArrayList<Integer>(Arrays.asList(new Integer[] {2})));
		testInvertedIndex.put("good", new ArrayList<Integer>(Arrays.asList(new Integer[] {2})));
		testInvertedIndex.put("friend", new ArrayList<Integer>(Arrays.asList(new Integer[] {2})));
		testInvertedIndex.put("with", new ArrayList<Integer>(Arrays.asList(new Integer[] {2})));
		testInvertedIndex.put("this", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("grow", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("from", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("arizona", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("to", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("california", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("when", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("rain", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		
	}

	private void setup2(HashMap<String, ArrayList<Integer>> testInvertedIndex) {
		testInvertedIndex.put("there", new ArrayList<Integer>(Arrays.asList(new Integer[] {1})));
		testInvertedIndex.put("is", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3})));
		testInvertedIndex.put("no", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3})));
		testInvertedIndex.put("green", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2})));
		testInvertedIndex.put("yellow", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 4})));
		testInvertedIndex.put("purple", new ArrayList<Integer>(Arrays.asList(new Integer[] {1})));
		testInvertedIndex.put("corn", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 5})));
		testInvertedIndex.put("on", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 5})));
		testInvertedIndex.put("the", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 5})));
		testInvertedIndex.put("moon", new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 5})));
		testInvertedIndex.put("soylent", new ArrayList<Integer>(Arrays.asList(new Integer[] {2})));
		testInvertedIndex.put("people", new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4})));
		testInvertedIndex.put("eating", new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 4})));
		testInvertedIndex.put("this", new ArrayList<Integer>(Arrays.asList(new Integer[] {3, 4})));
		testInvertedIndex.put("a", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("space", new ArrayList<Integer>(Arrays.asList(new Integer[] {3})));
		testInvertedIndex.put("station", new ArrayList<Integer>(Arrays.asList(new Integer[] {3, 4, 5})));
		testInvertedIndex.put("of", new ArrayList<Integer>(Arrays.asList(new Integer[] {3, 5})));
		testInvertedIndex.put("are", new ArrayList<Integer>(Arrays.asList(new Integer[] {4})));
		testInvertedIndex.put("when", new ArrayList<Integer>(Arrays.asList(new Integer[] {4})));
		testInvertedIndex.put("dog", new ArrayList<Integer>(Arrays.asList(new Integer[] {4, 5})));
		testInvertedIndex.put("rain", new ArrayList<Integer>(Arrays.asList(new Integer[] {4})));
		testInvertedIndex.put("from", new ArrayList<Integer>(Arrays.asList(new Integer[] {5})));
		testInvertedIndex.put("will", new ArrayList<Integer>(Arrays.asList(new Integer[] {5})));
		testInvertedIndex.put("grow", new ArrayList<Integer>(Arrays.asList(new Integer[] {5})));
		testInvertedIndex.put("bottom", new ArrayList<Integer>(Arrays.asList(new Integer[] {5})));
		testInvertedIndex.put("sea", new ArrayList<Integer>(Arrays.asList(new Integer[] {5})));
	}
}
