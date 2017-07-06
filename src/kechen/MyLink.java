package kechen;

import java.util.Scanner;



/**
 * 单链表
 * @author 陈可
 *
 */
public class MyLink {
	StudentNode head;//头节点
	int size;//节点的数量
	
	public int getSize() {
		return size;
	}

	/**
	 * 添加节点的方法
	 * @param args
	 */
	//public void addNode(Student s){
	public void addNode(Student s){
		//如果有头节点的话，新节点 成为头节点
		if(head!=null){
			head=new StudentNode((kechen.Student)s,head);//学号重复？？？
			size++;
		}
		else{//如果没有头节点，添加对象作为头节点
			head=new StudentNode((kechen.Student)s,null);
			size++;
		}
	}
/**
 * 通过id 删除学生对象
 * @param args
 */ 
	public void deleteNode(int id) {
	          if (size == 0) { // 如果当前链表节点数为零
		              return;
		         }
		          if (size == 1) { 
		        // 如果只有一个节点并且正是需要删除的对象
		             if (head.student.getId() == id) {
		                head = null;
		                 size = 0;
		             }
		             return;
		         }
		          // 如果不存在该对象编号
		      
		 
		        // 较为复杂的删除，定义整型保存被删除的节点的索引
		         //（删除和索引都是不存在的，这里只是一个说法）
		        int index = 0;
		        // 循环遍历，找到删除节点的索引
		          for (StudentNode p = head; p != null; p = p.nextNode) {
		              if (!(p.student.id == id)) {
		                  index++;
		              } else {
		                  break;
		              }
		          }
		         // 如果删除的是第一个节点（即头节点）
		          if (index == 0) {
		            head = new StudentNode(head.nextNode.student,
		                     head.nextNode.nextNode);    // 设置头节点后一个节点为新的头节点
		              size--;                                            // 链表节点数减一
		                                              // 链表被操作次数加一
		              return;
		          }
		          
		          // 如果删除的节点不是第一个节点
		          // 循环遍历，找到被删除节点的前一个节点
		          // 其索引下标用count保存
		          int count = 0;
		          for (StudentNode p = head; p != null; p = p.nextNode) {
		              if (count == index - 1) {    // 如果找到了被删除节点的前一个节点
		                if (index == size - 1) {    // 如果被删除节点是最后一个节点
		                      p.nextNode = null;    // 将被删除节点的前一个节点的引用指向空引用
		                  } else {                            // 如果被删除节点不是最后一个节点
		                      p.nextNode = p.nextNode.nextNode;    // 将被删除节点前一个节点对其引用指向被删除节点的下一个节点
		                  }
		                 size--;                // 减一数量
		                      // 加一操作次数
		                 return;
		              }
		             count++;                // 没有找到，索引加一
		         }
		     }
		 
	/*public void deleteNode(int id){
		if(size==0){//如果当前链表节点数为0
			return;
		}
		if(size==1){//如果当前节点数为1 而且是需要删除的对象
			if(head.student.getId()==id){
				head=null;
				size=0;
			}
			return;
		}//如果不存在该id
		/*if (!contains(id)) {
		             return;
			         }
		
		 // 循环遍历，找到删除节点的索引
		int index=0;
		for(StudentNode s=head;s!=null;s=s.nextNode){
			if(s.student.getId()==id){
				index++;
				
			}else{
				break;
			}
		}//删除的是头节点
		if(index==0){
			head=new StudentNode(head.nextNode.student,head.nextNode.nextNode);
			size--;
			return;
		}
		int count=0;//下标
		for(StudentNode s=head;s!=null;s=s.nextNode){
			if(count==index-1){//被删除下标不是头节点
				if(index==size-1){//被删除节点是最后一个节点
					s.nextNode=null;//将被删除节点的前一个节点指向为null
				}
				else{
					s.nextNode=s.nextNode.nextNode;
				}
				size--;
				return;
			}
		count++;//没有找到   下标加一
		}
	}*/
/**
 * 通过id查找学生
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
 * 通过name查找学生
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
/**根据学生id判断修改的学生   根据a 修改那一项信息  b要修改的学生对象 
 * 修改学生信息
 */

public void editNode(int id,int a,Object value){
	Student b =searchNode(id);//这里使用searchNode ！！！
	if(b==null){
		return;
	}
	
	//可以改善   当输入不是1 或者2时候
	//改善  提示 修改什么属性
	//当a等于1时  修改学生名字
	if(a==1){
		b.name=value.toString();
		return;
	}
	//当a等于2时 修改学生班级
	else if(a==2){
		b.classes=value.toString();
		//b.id=Integer.parseInt(value.toString());
		return;
	}
}

     /* * 通过对象编号打印对象
      * 
      * @param personNo
      *            对象编号
      */
    public void printNode(int id) {
        Student target = searchNode(id);
         if (target == null) {
        	 System.out.println("不存在这名学生，请重新输入学生序号");
         }
         System.out.println(target.toString());
     }
    /**
     * 通过对象名字打印对象
     */
    public void printNodename(String name){
    	//Scanner scan=new Scanner(System.in);
    	Student b=searchNodename(name);
    	if(b==null){
    		System.out.println("不存在这名学生，请重新输入学生名字");
    		//String a=scan.next();
    		//name=a;
    	}
    	System.out.println(b.toString());
    }
    /**
     * 输出所有对象
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
