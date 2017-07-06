package kechen;
/**
 * 学生类
 * @author Administrator
 *
 */
public class Student {
	 String name;//学生名字
	 String classes;//学生班级
	 int id;//学生编号
	 String sex;//学生性别  
	public Student(String name,String classes,int id,String sex){
		this.name=name;
		this.classes=classes;
		this.id=id;
		this.sex=sex;
		
	}
	//获取名字
	public String getName() {
		return name;
	}
	//获取班级
	public String getClasses() {
		return classes;
	}
	//获取编号
	public int getId() {
		return id;
	}
	//获取性别
	public String getSex() {
		return sex;
	}
	public String toString(){
		return "名字"+"\t"+name+"\t"+"班级"+"\t"+classes+"\t"+"学号"+"\t"+id+"\t"+"性别"+"\t"+sex;
	}

}
