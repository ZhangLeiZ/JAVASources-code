package T4;

public class Btree {

	Node root;
	int max=0;
	int min=0;
	public Btree(int data) {
		root=new Node(data);
	}
	public void pushtree(int data){
		Node p =root;
		Node dat = new Node(data);
		if(p!=null){
			while(true){
				if(p.data>data){
					if(p.lefttree!=null){
						p=p.lefttree;
					}else{
						p.lefttree=dat;
						break;
					}
				}else{
					if(p.rightree!=null){
						p=p.rightree;
					}else{
						p.rightree=dat;
						break;
					}
				}
			}
		}else{
			System.out.println("二叉树为空");
		}
	}
	public int dispaly(Node root){
		if(min>root.data){
			min=root.data;
		}
		System.out.println(root.data);
		if(root.lefttree!=null){
			//System.out.println("往左");
			dispaly(root.lefttree);
		}
		if(root.rightree!=null){
			//System.out.println("往右");
			dispaly(root.rightree);
		}
		return min;
	}
	public int dispalyz(Node root){
		if(max<root.data){
			max=root.data;
		}
		if(root.lefttree!=null){
			//System.out.println("往左");
			dispalyz(root.lefttree);
		}
		System.out.println(root.data);
		if(root.rightree!=null){
			//System.out.println("往右");
			dispalyz(root.rightree);
		}
		return max;
	}
	public static void main(String[] args) {
		Btree tree = new Btree(10);
		tree.pushtree(8);
		tree.pushtree(7);
		tree.pushtree(20);
		tree.pushtree(90);
		tree.pushtree(100);
		tree.pushtree(3);
		tree.pushtree(6);
		tree.pushtree(1);
		tree.pushtree(-10);
		System.out.println("最小数="+tree.dispaly(tree.root));
		System.out.println("最大数="+tree.dispalyz(tree.root));
	}
}
