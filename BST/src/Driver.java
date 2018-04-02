import java.util.Vector;

public class Driver implements DriverInterface {

	//private static BinarySearchTree<Integer, Integer> intTree = new BinarySearchTree<Integer, Integer>();
	private static BinarySearchTree<Integer, String> intTree = new BinarySearchTree<Integer, String>();
	
	public static void showIterator(TreeIterator<Integer, String> iterator) {
		while (iterator.hasNext()) {
			TreeItem<Integer, String> item = iterator.next();
			System.out.print(item.getValue() + ", ");
		}
		System.out.println();
	}

	public static void traverseTree() {
		//TreeIterator<Integer, Integer> iterator = (TreeIterator<Integer, Integer>) intTree.iterator();
		TreeIterator<Integer, String> iterator = (TreeIterator<Integer, String>) intTree.iterator();
		
		System.out.println("\n\nPreOrder");
		iterator.setPreorder();
		showIterator(iterator);
		
		
		System.out.println("\n\nInOrder");
		iterator.setInorder();
		showIterator(iterator);
		
		System.out.println("\n\nPostOrder");
		iterator.setPostorder();
		showIterator(iterator);
	}
	
	
	public static void main(String[] args) {
		Driver d = new Driver();
		
		int num = 10;
		String value = "string" + num;
		
		System.out.println(value);
		
		
		Vector<TreeItem<Integer, String>> ven =d.getVectorOfTreeItems();
		
		
		//BinarySearchTree<Integer, String> bs =d.createAndPopulateBST(ven);
		intTree =d.createAndPopulateBST(ven);
		
		System.out.println("height "+ intTree.height());
		
		System.out.println(intTree.isBalanced());
		//traverseTree();
		System.out.println("--------");
		System.out.println("after the balance");
		
		intTree.balance();
		System.out.println("height "+ intTree.height());
		
		
		
		System.out.println(intTree.isBalanced());
		//traverseTree();
		
		
		
		
		
		
		//TreeItem<Integer, String> item;
		
		
	/*	for(int i = 0; i < 250; i++){
			int num = (int)(Math.random()*1000000+1);
			item = new TreeItem<Integer, String>(new Integer(num), new String(String.valueOf(num)));
			intTree.insert(item);
			
		}*/
		
		//item = new TreeItem<Integer, Integer>(new Integer(8), new Integer(8));
		//intTree.insert(item);
		
		//item = new TreeItem<Integer, Integer>(new Integer(5), new Integer(5));
		//intTree.insert(item);
		//item = new TreeItem<Integer, Integer>(null, null);
		//item=null;
		//intTree.insert(item);
		
		/*item = new TreeItem<Integer, Integer>(new Integer(10), new Integer(10));
		intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(4), new Integer(4));
		intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(6), new Integer(6));
		intTree.insert(item);
		
		//item = new TreeItem<Integer, Integer>(new Integer(9), new Integer(9));
		//intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(11), new Integer(11));
		intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(11), new Integer(11));
		intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(11), new Integer(11));
		intTree.insert(item);
		
		item = new TreeItem<Integer, Integer>(new Integer(11), new Integer(11));
		intTree.insert(item);
		item = new TreeItem<Integer, Integer>(new Integer(11), new Integer(11));
		intTree.insert(item);
		*/
		
		//System.out.println("height" +intTree.height());
		//System.out.println(intTree.isBalanced());

		//intTree.balance();
		//System.out.println(intTree.isBalanced());

		//traverseTree();
		
		//intTree.delete(new Integer(10));

		//traverseTree();
		
		
		
		
		

	}

	@Override
	public Vector<TreeItem<Integer, String>> getVectorOfTreeItems() {
		Vector<TreeItem<Integer, String>> V = new Vector<TreeItem<Integer,String>>();
		
		//TreeItem<Integer, String> item;
		
		for(int i =0; i <131071; i++){
			
			int num = (int)(Math.random()*1000000+1);
			String s = "String " + num;
			TreeItem<Integer, String> item =new TreeItem<Integer, String>(new Integer(num), new String(s));
			V.add(item);
		}
		
		
		
		// TODO Auto-generated method stub
		return V;
	}

	@Override
	public BinarySearchTree<Integer, String> createAndPopulateBST(Vector<TreeItem<Integer, String>> treeItems) {
		// TODO Auto-generated method stub
		
		BinarySearchTree<Integer, String> tree = new BinarySearchTree<Integer, String>();
		
		for(int i = 0; i < treeItems.size(); i++){
			tree.insert(treeItems.get(i));
		}
		
		return tree;
	}

}
