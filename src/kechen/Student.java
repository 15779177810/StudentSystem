package kechen;
/**
 * ѧ����
 * @author Administrator
 *
 */
public class Student {
	 String name;//ѧ������
	 String classes;//ѧ���༶
	 int id;//ѧ�����
	 String sex;//ѧ���Ա�  
	public Student(String name,String classes,int id,String sex){
		this.name=name;
		this.classes=classes;
		this.id=id;
		this.sex=sex;
		
	}
	//��ȡ����
	public String getName() {
		return name;
	}
	//��ȡ�༶
	public String getClasses() {
		return classes;
	}
	//��ȡ���
	public int getId() {
		return id;
	}
	//��ȡ�Ա�
	public String getSex() {
		return sex;
	}
	public String toString(){
		return "����"+"\t"+name+"\t"+"�༶"+"\t"+classes+"\t"+"ѧ��"+"\t"+id+"\t"+"�Ա�"+"\t"+sex;
	}

}
