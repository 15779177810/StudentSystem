package kechen;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan= new Scanner(System.in);
		MyLink list =new MyLink();
		Student m =new Student("С��","һ��",1,"��");
		Student m1 =new Student("С��","����",2,"��");
		Student m2 =new Student("С��","����",3,"Ů");
		Student m3 =new Student("С��","�İ�",4,"��");
		list.addNode(m);//���
		list.addNode(m1);
		list.addNode(m2);
		list.addNode(m3);
		
		
		
		System.out.println("��ӭʹ��ѧ������ϵͳ��������ʹ�����¹���");
		System.out.println("1.��ѯ����ѧ����Ϣ  2.����ѧ����Ϣ  3.ɾ��ѧ����Ϣ  4.�޸�ѧ����Ϣ   5.��ѯһ��ѧ����Ϣ ");
		
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
			System.out.println("���������ѧ�����֣����ڰ༶��ѧ�ţ��Ա�");
			String name=scan.next();
			String classes=scan.next();
			int id=scan.nextInt();
			String sex=scan.next();
			Student m4 =new Student(name,classes,id,sex);
			list.addNode(m4);
			System.out.println("��Ӻ������ѧ����Ϣ");
			list.printAll();
			break;
		case 3:
			System.out.println("��������Ҫɾ����ѧ����ѧ��");//����ѧ���ҵ�ѧ������  ɾ��
			
			int b=scan.nextInt();
			list.deleteNode(b);
			System.out.println("ɾ���������ѧ����Ϣ");
			list.printAll();
			break;
		case 4:
			//�����쳣
			System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");//����ѧ���ҵ�ѧ������ �޸�
			int c=scan.nextInt();
			System.out.println("��Ҫ�޸�ѧ������  ������1 �޸�ѧ�����ڰ༶ ������2");
			int d=scan.nextInt();
			if(d==1){
			System.out.println("�������޸ĺ��ѧ������");
			String e=scan.next();
			list.editNode(c,1, e);
			System.out.println("�޸ĺ�����ѧ����Ϣ");
			list.printAll();
			}	
			if(d==2){
			System.out.println("�������޸ĺ��ѧ�����ڰ༶");
			String f=scan.next();
			list.editNode(c, 2, f);
			System.out.println("�޸ĺ�����ѧ����Ϣ");
			list.printAll();
			}
			break;
		case 5:
			
			System.out.println("��Ҫ����ѧ�����ֲ�ѯ  ������1����Ҫ����ѧ��id��ѯ  ������2");
			int f=scan.nextInt();
			if(f==1){
				System.out.println("��������");
				String g=scan.next();
				//list.searchNodename(g);		
				list.printNodename(g);
			
			}
			if(f==2){
				System.out.println("����ѧ��id");
				int h=scan.nextInt();
				list.printNode(h);
				
			}
		}
			}catch(MyException e){
				System.out.println(e);
			}catch(Exception e){
				System.out.println("����������");
			}
			
		System.out.println("�Ƿ������ѧ����Ϣ���в���  1.�� 0.��");//�쳣
		
	
		
		A=scan.nextInt();
		try{
			
		
		int B=avg1(A);
		 if(A==1){
		 System.out.println("1.��ѯ����ѧ����Ϣ  2.����ѧ����Ϣ  3.ɾ��ѧ����Ϣ  4.�޸�ѧ����Ϣ    5.��ѯһ��ѧ����Ϣ ");
		 }
		 else if(A==0){//ע��
		 System.out.println("ллʹ��ѧ������ϵͳ���´��ټ�");
		 }
		 else{
			 System.out.println("�������");
			 System.out.println("1.��ѯ����ѧ����Ϣ  2.����ѧ����Ϣ  3.ɾ��ѧ����Ϣ  4.�޸�ѧ����Ϣ    5.��ѯһ��ѧ����Ϣ ");
			 //����a��������
			
		 }
		
		}catch(MyException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println("����������");
		}
		}
		while(A!=0);
		
		
	}
	

	








static int avg(int number)throws MyException{
if (number!=1&&number!=2&&number!=3&&number!=4&&number!=5){
	throw new MyException("�밴����ʾ��������");
}
return number;
}

static int avg1(int number1)throws MyException{
	if(number1!=0&&number1!=1){
		throw new MyException("�밴����ʾ��������");
	}
	return number1;
}



}

