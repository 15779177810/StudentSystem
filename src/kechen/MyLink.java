package kechen;

import java.util.Scanner;



/**
 * ������
 * @author �¿�
 *
 */
public class MyLink {
	StudentNode head;//ͷ�ڵ�
	int size;//�ڵ������
	
	public int getSize() {
		return size;
	}

	/**
	 * ��ӽڵ�ķ���
	 * @param args
	 */
	//public void addNode(Student s){
	public void addNode(Student s){
		//�����ͷ�ڵ�Ļ����½ڵ� ��Ϊͷ�ڵ�
		if(head!=null){
			head=new StudentNode((kechen.Student)s,head);//ѧ���ظ�������
			size++;
		}
		else{//���û��ͷ�ڵ㣬��Ӷ�����Ϊͷ�ڵ�
			head=new StudentNode((kechen.Student)s,null);
			size++;
		}
	}
/**
 * ͨ��id ɾ��ѧ������
 * @param args
 */ 
	public void deleteNode(int id) {
	          if (size == 0) { // �����ǰ����ڵ���Ϊ��
		              return;
		         }
		          if (size == 1) { 
		        // ���ֻ��һ���ڵ㲢��������Ҫɾ���Ķ���
		             if (head.student.getId() == id) {
		                head = null;
		                 size = 0;
		             }
		             return;
		         }
		          // ��������ڸö�����
		      
		 
		        // ��Ϊ���ӵ�ɾ�����������ͱ��汻ɾ���Ľڵ������
		         //��ɾ�����������ǲ����ڵģ�����ֻ��һ��˵����
		        int index = 0;
		        // ѭ���������ҵ�ɾ���ڵ������
		          for (StudentNode p = head; p != null; p = p.nextNode) {
		              if (!(p.student.id == id)) {
		                  index++;
		              } else {
		                  break;
		              }
		          }
		         // ���ɾ�����ǵ�һ���ڵ㣨��ͷ�ڵ㣩
		          if (index == 0) {
		            head = new StudentNode(head.nextNode.student,
		                     head.nextNode.nextNode);    // ����ͷ�ڵ��һ���ڵ�Ϊ�µ�ͷ�ڵ�
		              size--;                                            // ����ڵ�����һ
		                                              // ��������������һ
		              return;
		          }
		          
		          // ���ɾ���Ľڵ㲻�ǵ�һ���ڵ�
		          // ѭ���������ҵ���ɾ���ڵ��ǰһ���ڵ�
		          // �������±���count����
		          int count = 0;
		          for (StudentNode p = head; p != null; p = p.nextNode) {
		              if (count == index - 1) {    // ����ҵ��˱�ɾ���ڵ��ǰһ���ڵ�
		                if (index == size - 1) {    // �����ɾ���ڵ������һ���ڵ�
		                      p.nextNode = null;    // ����ɾ���ڵ��ǰһ���ڵ������ָ�������
		                  } else {                            // �����ɾ���ڵ㲻�����һ���ڵ�
		                      p.nextNode = p.nextNode.nextNode;    // ����ɾ���ڵ�ǰһ���ڵ��������ָ��ɾ���ڵ����һ���ڵ�
		                  }
		                 size--;                // ��һ����
		                      // ��һ��������
		                 return;
		              }
		             count++;                // û���ҵ���������һ
		         }
		     }
		 
	/*public void deleteNode(int id){
		if(size==0){//�����ǰ����ڵ���Ϊ0
			return;
		}
		if(size==1){//�����ǰ�ڵ���Ϊ1 ��������Ҫɾ���Ķ���
			if(head.student.getId()==id){
				head=null;
				size=0;
			}
			return;
		}//��������ڸ�id
		/*if (!contains(id)) {
		             return;
			         }
		
		 // ѭ���������ҵ�ɾ���ڵ������
		int index=0;
		for(StudentNode s=head;s!=null;s=s.nextNode){
			if(s.student.getId()==id){
				index++;
				
			}else{
				break;
			}
		}//ɾ������ͷ�ڵ�
		if(index==0){
			head=new StudentNode(head.nextNode.student,head.nextNode.nextNode);
			size--;
			return;
		}
		int count=0;//�±�
		for(StudentNode s=head;s!=null;s=s.nextNode){
			if(count==index-1){//��ɾ���±겻��ͷ�ڵ�
				if(index==size-1){//��ɾ���ڵ������һ���ڵ�
					s.nextNode=null;//����ɾ���ڵ��ǰһ���ڵ�ָ��Ϊnull
				}
				else{
					s.nextNode=s.nextNode.nextNode;
				}
				size--;
				return;
			}
		count++;//û���ҵ�   �±��һ
		}
	}*/
/**
 * ͨ��id����ѧ��
 * @param args
 */
public Student searchNode(int id){
	Student a=null;
	for(StudentNode s=head;s!=null;s=s.nextNode){
		if(s.student.getId()==id){
			a=s.student;

			}
		}return a;
	
		
	}
/**
 * ͨ��name����ѧ��
 * @param args
 */
public Student searchNodename(String name){
	Student a=null;
	for(StudentNode b=head;b!=null;b=b.nextNode){
		if(b.student.getName().equals(name)){
			a=b.student;
		}
	}return a;
}
/**����ѧ��id�ж��޸ĵ�ѧ��   ����a �޸���һ����Ϣ  bҪ�޸ĵ�ѧ������ 
 * �޸�ѧ����Ϣ
 */

public void editNode(int id,int a,Object value){
	Student b =searchNode(id);//����ʹ��searchNode ������
	if(b==null){
		return;
	}
	
	//���Ը���   �����벻��1 ����2ʱ��
	//����  ��ʾ �޸�ʲô����
	//��a����1ʱ  �޸�ѧ������
	if(a==1){
		b.name=value.toString();
		return;
	}
	//��a����2ʱ �޸�ѧ���༶
	else if(a==2){
		b.classes=value.toString();
		//b.id=Integer.parseInt(value.toString());
		return;
	}
}

     /* * ͨ�������Ŵ�ӡ����
      * 
      * @param personNo
      *            ������
      */
    public void printNode(int id) {
        Student target = searchNode(id);
         if (target == null) {
        	 System.out.println("����������ѧ��������������ѧ�����");
         }
         System.out.println(target.toString());
     }
    /**
     * ͨ���������ִ�ӡ����
     */
    public void printNodename(String name){
    	//Scanner scan=new Scanner(System.in);
    	Student b=searchNodename(name);
    	if(b==null){
    		System.out.println("����������ѧ��������������ѧ������");
    		//String a=scan.next();
    		//name=a;
    	}
    	System.out.println(b.toString());
    }
    /**
     * ������ж���
     */
    public void printAll() {
    	        if (size != 0) {
    	            for (StudentNode nextNode = head; nextNode != null; nextNode = nextNode.nextNode) {
                    System.out.println(nextNode.student.toString());
    	            }
    	         }
    }
    //paixu
    public void sort(){
    	for(StudentNode nextNode = head;nextNode!=null;nextNode=nextNode.nextNode){
    		
    	}
    }
	

}
