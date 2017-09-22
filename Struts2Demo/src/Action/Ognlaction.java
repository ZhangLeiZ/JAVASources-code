package Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import StrVo.StudentVo;

import com.opensymphony.xwork2.ActionSupport;

public class Ognlaction extends ActionSupport {
	private String actions;
	private List<Nation> listnation;
	private List<Classname> listclass;
	private List<StudentVo> studylist;
	private Map<Integer, String>classmap;
	private String sexid[];
	private int classnames[];
	private StudentVo stud;
	@Override
	public String execute() throws Exception {
		init();
		return INPUT;
	}
	public String selects() throws Exception {
		if(classnames.length>0){
			for(int i=0;i<classnames.length;i++){
				System.out.println("classname="+classnames[i]);
			}
		}
		init();
		return INPUT;
	}
	public List<Nation> getListnation() {
		return listnation;
	}
	public void setListnation(List<Nation> listnation) {
		this.listnation = listnation;
	}
	public List<Classname> getListclass() {
		return listclass;
	}
	public void setListclass(List<Classname> listclass) {
		this.listclass = listclass;
	}
	public StudentVo getStud() {
		return stud;
	}
	public void setStud(StudentVo stud) {
		this.stud = stud;
	}
		public void init(){
			listnation = new ArrayList<Nation>();
			listclass = new ArrayList<Classname>();
			Classname c1 = new Classname(1,"计算机系");
			Classname c2 = new Classname(2,"政法系");
			Classname c3 = new Classname(3,"金融系");
			Classname c4 = new Classname(4,"设计系");
			Classname c5 = new Classname(5,"音乐系");
			Classname c6 = new Classname(6,"美术系");
			listclass.add(c1);
			listclass.add(c2);
			listclass.add(c3);
			listclass.add(c4);
			listclass.add(c5);
			listclass.add(c6);
			Nation n1 = new Nation(1,"汉族");
			Nation n2 = new Nation(2,"畲族");
			Nation n3 = new Nation(3,"藏族");
			Nation n4 = new Nation(4,"壮族");
			Nation n5 = new Nation(5,"白族");
			listnation.add(n1);
			listnation.add(n2);
			listnation.add(n3);
			listnation.add(n4);
			listnation.add(n5);
			
			sexid = new String[]{"男","女"};
			classmap = new HashMap<Integer, String>();
			classmap.put(1, "计算机系");
			classmap.put(2,"政法系");
			classmap.put(3,"金融系");
			classmap.put(4,"设计系");
			classmap.put(5,"音乐系");
			classmap.put(6,"美术系");
	}

		public String getActions() {
			return actions;
		}

		public void setActions(String actions) {
			System.out.println(actions);
			this.actions = actions;
		}
		public List<StudentVo> getStudylist() {
			return studylist;
		}
		public void setStudylist(List<StudentVo> studylist) {
			this.studylist = studylist;
		}
		public String[] getSexid() {
			return sexid;
		}
		public void setSexid(String[] sexid) {
			this.sexid = sexid;
		}
		public Map<Integer, String> getClassmap() {
			return classmap;
		}
		public void setClassmap(Map<Integer, String> classmap) {
			this.classmap = classmap;
		}
		public int[] getClassnames() {
			return classnames;
		}
		public void setClassnames(int[] classnames) {
			this.classnames = classnames;
		}
		
}