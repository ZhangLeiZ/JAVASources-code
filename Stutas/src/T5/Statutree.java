package T5;

import T4.Btree;

public class Statutree {
	TreeNode root;
	public Statutree(int data) {
		root = new TreeNode(data);
	}
	public void pushtree(int dat){
		TreeNode p = root;
		TreeNode s = new TreeNode(dat);
		if(p!=null){
			while(true){
				if(p.data>dat){
					if(p.lefttree!=null){
						p=p.lefttree;
					}else{
						p.lefttree=s;
						break;
					}
				}else if(p.data<dat){
						if(p.righttree!=null){
							p=p.righttree;
						}else{
							p.righttree=s;
							break;
						}
					}
				}
		}else{
			System.out.println("树为空");
		}
	}
	//前序遍历
	public void Qdispaly(TreeNode root){
		System.out.println(root.data);
		if(root.lefttree!=null){
			Qdispaly(root.lefttree);
		}
		if(root.righttree!=null){
			Qdispaly(root.righttree);
		}
	}
	//中序遍历
	public void dispaly(TreeNode root){
		if(root.lefttree!=null){
			dispaly(root.lefttree);
		}
		System.out.println(root.data);
		if(root.righttree!=null){
			dispaly(root.righttree);
		}
	}
	//后序遍历
	public void Hdispaly(TreeNode root){
		if(root.lefttree!=null){
			Hdispaly(root.lefttree);
		}
		if(root.righttree!=null){
			Hdispaly(root.righttree);
		}
		System.out.println(root.data);
	}
	public static void main(String[] args) {
		Statutree tree = new Statutree(10);
		tree.pushtree(8);
		tree.pushtree(7);
		tree.pushtree(20);
		tree.pushtree(90);
		tree.pushtree(100);
		tree.pushtree(3);
		tree.pushtree(6);
		tree.pushtree(1);
		tree.pushtree(-10);
		System.out.println("--------前序遍历---------");
		tree.Qdispaly(tree.root);
		System.out.println("--------中序遍历---------");
		tree.dispaly(tree.root);
		System.out.println("--------后序遍历---------");
		tree.Hdispaly(tree.root);
	}
}
