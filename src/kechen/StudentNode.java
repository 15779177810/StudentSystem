package kechen;

public class StudentNode {
	Student student;//��  ������
	StudentNode nextNode;//������󱣴����һ�����������  ָ����
	//��ȡ��ǰ����ѧ��
	public Student getStudent() {
		return student;
	}
	//��ȡ��һ��ʵ�����
	public StudentNode getNextNode() {
		return nextNode;
	}
	//���췽��
	public StudentNode(Student s,StudentNode nextNode){
		this.nextNode=nextNode;//ָ����
		this.student=s;//������
	}
	//������췽��û�ж���һ�����������
	public StudentNode(Student s){
		
		this.student=s;
	}
}
