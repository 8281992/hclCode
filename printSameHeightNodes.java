package breadFirstOrderTraversal;

public class printSameHeightNodes {

	public static void main(String[] args) {
		
		 Node node=new Node(1);
		 
	       node.right= new Node(2); 
	       node.right.right= new Node(5); 
	       node.right.right.left= new Node(3); 
	       node.right.right.right= new Node(6); 
	       node.right.right.left.right= new Node(4); 
	         	    
	      int totalHeight= findmaximumHeight(node);
	      for (int i = 1; i <=totalHeight;i++) {
	      printTheNodesAtSameHeight(node,i);
	      }
	}
	public static void printTheNodesAtSameHeight(Node node,int eachLevel) {
		
		if(node==null)
			return;
		
			
			if(eachLevel==1) {
				System.out.println(node.key+" ");
			}
			else {
				//decrease in each level
				printTheNodesAtSameHeight(node.left, eachLevel-1);
				printTheNodesAtSameHeight(node.right, eachLevel-1);
			}
		
		
	}
public static int findmaximumHeight(Node node) {
	if(node==null) {
		return 0;
	}
	
	int heightOfLeftSubTree=findmaximumHeight(node.left);
	int heightOfRightSubTree=findmaximumHeight(node.right);
	
	int heightOFCurrentSubtree=0;
	if(heightOfLeftSubTree > heightOfRightSubTree)
	
		
		heightOFCurrentSubtree= heightOfLeftSubTree+1;
	
	else
		// if right height is more than left OR if both are equal then also increase
		heightOFCurrentSubtree= heightOfRightSubTree+1;
	
	return heightOFCurrentSubtree;
	
}
}
