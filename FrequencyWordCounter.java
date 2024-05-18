import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyWordCounter{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter the sentence : ");
		String sentence = sc.nextLine();

		findTheFrequenciesOfWords(sentence);

		sc.close();
	}

	public static void findTheFrequenciesOfWords(String sentence){

		String words[] = sentence.split(" ");

		Map<String,Integer> map = new HashMap<>();

		for (String word : words) {
			
			if(map.containsKey(word)){
				map.put(word, map.get(word)+1);
			}else {
				map.put(word,1);
			}
		}

		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue()+" times.");
		}
	}
}