import java.util.Scanner;

public class Game {
	
	/* Rock Scissors Paper Game competing with two computers in Java 
	 +------------+------------+-----------+ 
	 | computer 1 | computer 2 |  Users    | 
	 +============+============+===========+ 
	 | Random     | Random     | Input     | 
	 +------------+------------+-----------+ 
	 | Only enter English, not other lg    | 
	 +------------+------------+-----------+
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner s = new Scanner(System.in);
	
	  int a=(int)Math.round(Math.random()*3);  
	  int b=(int)Math.round(Math.random()*3);
	  
	  /*������ ������ ������ �������� �Ͽ���
	  * ����ڿ� ���������� ��� �� 2���� �̸� ����
	  */
	  
	  String game , name; // �Է¹��� ���� ������ ������
	  int comwin = 0, mewin=0 ;
	  
	  System.out.println("(��ǻ�Ϳ� �ϴ� ���������� ����)");
	  System.out.print("������� �̸��� �Է��ϼ���>>");
	  name = s.next();
	  
	 //������� �̸� �Է¹ޱ�

	  for(int i=0; i<11; i++){
		  
		  System.out.print("����,����,�� �� �ϳ��� �Է��ϼ��� >> ");
		  game = s.next();
		  
		  switch(game){  
		    case "����":
		    {
		     if(a==1 && b==1){
		      break;
		     }
		     else if(a==2 &&  b==3){
		      break;
		     }
		     else if(a==3 &&  b==2){
		      break;
		      }
		     else if(a==3 &&  b==3){
		      mewin++;
		      break;
		     }
		     else{
		      comwin++;
		      break;
		      }
		  
		    }
		    case "����":
		     if(a==2 &&  b==2){
		      break;
		      }
		     else if(a==1 &&  b==3){
		      break;
		      }
		     else if(a==3 &&  b==1){
		      break;
		     }
		     else if(a==3 &&  b==3){
		      comwin++;
		      break; 
		     }
		     else{
		      mewin++;
		      break;
		     }
		    case "��":
		     if(a==3 &&  b==3){
		      break;
		      }
		     else if(a==1 &&  b==2){
		      break;
		     }
		     else if(a==2 &&  b==1){
		      break;
		     }
		     else if(a==1 &&  b==1){
		      comwin++;
		      break;
		      }
		     else{
		      mewin++;
		      break;
		     }
		    }
			}
	  // ���� �Է��ϴ� ���� �޾Ƽ� �׿����� ������ ��ǻ�� �δ밡 ���������� ������ ����� ������ �� �����Ͽ���
	
	  	if(mewin>comwin){
	  		System.out.println(name+"���� �̱�̽��ϴ�.");
	  	}
	  	else{
		  System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	  		}
	  	// �̱涧���� ���� ������ �������� ũ�⸦ , ������ ���������־� �� ������ ������ if���� ������ ���� �̰���� �˷��� 
		}
	}
		  