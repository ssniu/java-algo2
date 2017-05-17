package ssn.sort;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		
		   

	}

}

class TreeNode<E>{
   protected E element;
   protected TreeNode<E> left;
   protected TreeNode<E> right;
   
   public TreeNode(E e){
	   element = e;
	   
   }
}

class test{
	TreeNode<Integer> root = new TreeNode<>(60);
	
	   root.left = new TreeNode<>(55);
	   root.right = new TreeNode<>(100);
	   
	   public boolean search(Integer element){
		   TreeNode<Integer> current = root;
		   
		   while(current != null)
			   if(element < current.element){
				   current = current.left;
			   }else if(element > current.element){
				   current=current.right;
			   }else 
				   return true;
		   
		   return false;
	   }
}