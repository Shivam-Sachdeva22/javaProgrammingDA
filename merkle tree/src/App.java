import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<String> tempTxList = new ArrayList<String>();
		tempTxList.add("Shivam ");
		tempTxList.add("Sachdeva");
		tempTxList.add("Java");
		tempTxList.add("Programming");
		tempTxList.add("CSE1007");

		MerkleTrees merkleTrees = new MerkleTrees(tempTxList);
		merkleTrees.merkle_tree();
		System.out.println("root : " + merkleTrees.getRoot());
	}
}