package T4;

public class Tree {   
	   
    private int data;// 数据节点    
    private Tree left;// 左子树    
    private Tree right;// 右子树    
   
    public Tree(int data) {    
        this.data = data;    
        this.left = null;    
        this.right = null;    
     }    
   
    /** 
      * 创建二叉树，返回根结点 
      * 
      * @param input 
      * @return 
      */   
    public static Tree createTree(int[] input) {    
         Tree root = null;    
         Tree temp = null;    
        for (int i = 0; i < input.length; i++) {    
            // 创建根节点    
            if (root == null) {    
                 root = temp = new Tree(input[i]);    
             } else {    
                // 回到根结点    
                 temp = root;    
                // 添加节点    
                while (true) {  
                    if (input[i] <= temp.data) {    
                        if (temp.left != null) {    
                             temp = temp.left;    
                         } else {    
                             temp.left = new Tree(input[i]); 
                             break;
                         }    
                     } else {    
                        if (temp.right != null) {    
                             temp = temp.right;    
                         } else {    
                             temp.right = new Tree(input[i]);
                             break;
                         }    
                     } 
                    
                 }    
             }    
         }    
        return root;    
     }    
   
    /** 
      * 前序遍历 
      * 
      * @param tree 
      */   
    public static void preOrder(Tree tree) {    
        if (tree != null) {    
             System.out.print(tree.data + " ");    
             preOrder(tree.left);    
             preOrder(tree.right);    
         }    
     }    
   
    /** 
      * 中序遍历 
      * 
      * @param tree 
      */   
    public static void midOrder(Tree tree) {    
        if (tree != null) {    
             midOrder(tree.left);
             System.out.print(tree.data + " ");    
	             midOrder(tree.right); 
	             }    
	     }    	   
	    /** 
	      * 后序遍历 
	      * 
	      * @param tree 
	      */   
	    public static void posOrder(Tree tree) {    
	        if (tree != null) {    
	             posOrder(tree.left);    
	             posOrder(tree.right);    
             System.out.print(tree.data + " ");    
	         }    
     }    
	   
	    
	    public static void main(String[] args) {    
	        int[] input = { 1, 0, 3, 2, 4, 5, 1 };    
	         Tree tree = createTree(input);    
	         System.out.print("前序遍历：");    
	         preOrder(tree);    
	         System.out.print("\n中序遍历：");    
	         midOrder(tree);    
         System.out.print("\n后序遍历：");    
	         posOrder(tree);    
	     }    
	}    

