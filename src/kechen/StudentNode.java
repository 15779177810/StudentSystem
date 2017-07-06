package kechen;

public class StudentNode {
	Student student;//人  数据域
	StudentNode nextNode;//这个对象保存的下一个对象的引用  指针域
	//获取当前对象学生
	public Student getStudent() {
		return student;
	}
	//获取下一个实体对象
	public StudentNode getNextNode() {
		return nextNode;
	}
	//构造方法
	public StudentNode(Student s,StudentNode nextNode){
		this.nextNode=nextNode;//指针域
		this.student=s;//数据域
	}
	//这个构造方法没有对下一个对象的引用
	public StudentNode(Student s){
		
		this.student=s;
	}
}
