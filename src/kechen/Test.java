package kechen;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan= new Scanner(System.in);
		MyLink list =new MyLink();
		Student m =new Student("小李","一班",1,"男");
		Student m1 =new Student("小王","二班",2,"男");
		Student m2 =new Student("小红","三班",3,"女");
		Student m3 =new Student("小刚","四班",4,"男");
		list.addNode(m);//添加
		list.addNode(m1);
		list.addNode(m2);
		list.addNode(m3);
		
		
		
		System.out.println("欢迎使用学生管理系统，您可以使用如下功能");
		System.out.println("1.查询所有学生信息  2.增加学生信息  3.删除学生信息  4.修改学生信息   5.查询一名学生信息 ");
		
		int A;
		
		do{	
		
			try{
				int a=avg(scan.nextInt());
			//int a=scan.nextInt();
			
		
		
		
		switch(a){
		
		case 1:	
			list.printAll();
			break;
		case 2:			
			System.out.println("请逐个输入学生名字，所在班级，学号，性别");
			String name=scan.next();
			String classes=scan.next();
			int id=scan.nextInt();
			String sex=scan.next();
			Student m4 =new Student(name,classes,id,sex);
			list.addNode(m4);
			System.out.println("添加后的所有学生信息");
			list.printAll();
			break;
		case 3:
			System.out.println("请输入需要删除的学生的学号");//根据学号找到学生进行  删除
			
			int b=scan.nextInt();
			list.deleteNode(b);
			System.out.println("删除后的所有学生信息");
			list.printAll();
			break;
		case 4:
			//捕获异常
			System.out.println("请输入需要修改的学生的学号");//根据学号找到学生进行 修改
			int c=scan.nextInt();
			System.out.println("需要修改学生名字  请输入1 修改学生所在班级 请输入2");
			int d=scan.nextInt();
			if(d==1){
			System.out.println("请输入修改后的学生名字");
			String e=scan.next();
			list.editNode(c,1, e);
			System.out.println("修改后所有学生信息");
			list.printAll();
			}	
			if(d==2){
			System.out.println("请输入修改后的学生所在班级");
			String f=scan.next();
			list.editNode(c, 2, f);
			System.out.println("修改后所有学生信息");
			list.printAll();
			}
			break;
		case 5:
			
			System.out.println("需要根据学生名字查询  请输入1，需要根据学生id查询  请输入2");
			int f=scan.nextInt();
			if(f==1){
				System.out.println("输入名字");
				String g=scan.next();
				//list.searchNodename(g);		
				list.printNodename(g);
			
			}
			if(f==2){
				System.out.println("输入学生id");
				int h=scan.nextInt();
				list.printNode(h);
				
			}
		}
			}catch(MyException e){
				System.out.println(e);
			}catch(Exception e){
				System.out.println("请输入数字");
			}
			
		System.out.println("是否继续对学生信息进行操作  1.是 0.否");//异常
		
	
		
		A=scan.nextInt();
		try{
			
		
		int B=avg1(A);
		 if(A==1){
		 System.out.println("1.查询所有学生信息  2.增加学生信息  3.删除学生信息  4.修改学生信息    5.查询一名学生信息 ");
		 }
		 else if(A==0){//注意
		 System.out.println("谢谢使用学生管理系统，下次再见");
		 }
		 else{
			 System.out.println("输入错误");
			 System.out.println("1.查询所有学生信息  2.增加学生信息  3.删除学生信息  4.修改学生信息    5.查询一名学生信息 ");
			 //输入a？？？？
			
		 }
		
		}catch(MyException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println("请输入数字");
		}
		}
		while(A!=0);
		
		
	}
	

	








static int avg(int number)throws MyException{
if (number!=1&&number!=2&&number!=3&&number!=4&&number!=5){
	throw new MyException("请按照提示输入数字");
}
return number;
}

static int avg1(int number1)throws MyException{
	if(number1!=0&&number1!=1){
		throw new MyException("请按照提示输入数字");
	}
	return number1;
}



}

