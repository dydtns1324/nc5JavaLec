package Study;

public class Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		double dNum1 = 1.2;
//		float fNum2 = 0.9F;
//		
//		int iNum3 = (int)dNum1 + (int)fNum2;
//		int iNum4 = (int)(dNum1+fNum2);
//		System.out.println(iNum3);
//		System.out.println(iNum4);
//		
//		
//		int a = 10;
//		double b = 2.0;
//		
//		int add = a + (int)b;
//		int sub = a - (int)b;
//		int div = a / (int)b;
//		int mul = a * (int)b;
//		
//		System.out.println(mul);
//		
//		int mathScore = 90;
//		int engScore = 70;
//		int korScore = 85;
//		
//		int totalScore = mathScore + engScore + korScore;
//		System.out.println(totalScore);
//		
//		double avgScore = totalScore / 3;
//		System.out.println(avgScore);
//		
//		int num = 10;
//		
//		boolean isEven;
//		
//		isEven = num % 2 == 0 ? true : false;
//		
//		System.out.println(isEven);
//		
//		int myAge = 23;
//		int teacherAge = 38;
//		
//		boolean value = (myAge > 25);
//		System.out.println(value);
//		
//		System.out.println(myAge <= 25);
//		System.out.println(myAge == teacherAge);
//		
//		char ch;
//		
//		ch = myAge > teacherAge ? 'T' : 'F';
//		
//		System.out.println(ch);
		
//		int num;
//		num = -5 + 3 * 10 / 2;
//		System.out.println(num);
//		
//				
//		int num1 = 10;
//		
//		System.out.println(num1);
//		System.out.println(num1++);
//		System.out.println(num1);
//		System.out.println(--num1);
//		
//		
//		int num1 = 10;
//		int num2 = 20;
//		boolean result;
//		
//		result = (num1 > 10) && (num2 > 10); 
//		System.out.println(result);
//		
//		result = (num1 == 10) || (num2 < 10);
//		System.out.println(result);
//		System.out.println(!result);
		
//
//		int myScore = 65;
//		char grade;
//		
//		if( myScore >= 90) {
//			grade = 'A';
//			
//		}else if ( myScore >= 80) {
//			grade = 'B';
//		}else if ( myScore >= 70) {
//			grade = 'C';
//		}else if ( myScore >= 60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
//		
//		System.out.println(grade);
//		
//		grade = myScore >= 90 ? 'A' : 
//			    myScore >= 80 ? 'B' : 
//				myScore >= 70 ? 'C' : 
//			    myScore >= 60 ? 'D' : 'F';f
		
		
//			int floor = 1;
//			
//			switch(floor) {
//			
//			case 1 : System.out.println("약국 입니다");
//			break;
//			case 2 : System.out.println("정형외과 입니다.");
//			break;
//			case 3 : System.out.println("피부과 입니다.");
//			break;
//			case 4 : System.out.println("치과입니다");
//			break;
//			case 5 : System.out.println("헬스 클럽입니다.");
//			break;
//			default : System.out.println("존재하지 않는 층입니다.");
//			break;
		
		
//			int num = 1;
//			
//			int sum = 0;
//			
//			while(num <= 50) {
//				sum+=num;
//				
//				num++;
//				
//				
//				System.out.println(sum);
		
		
				
//			for ( int i = 1; i <= 10; i++) {
//				
//				
//				System.out.println("안녕하세요"+i);
				
				
				
//			int dan;
//			int times;
//			
//			for( dan = 1; dan <= 9; dan++) {
//				for ( times = 1; times <= 9; times++) {
//					int answer = dan * times;
//					
//					System.out.println(dan + "*" + times +" = " + answer);
//					
//			}
//				System.out.println( );
//				
//		}
//		
//		int total = 0;
//		
//		
//		for ( int i = 1; i <= 100; i++) {
//			
//			if ( i % 2 != 0) {
//				continue;																		
//		  }
//			total += i;
//			System.out.println(total);
//						
//		}
		
//		int sum = 0;
//		int num = 0;
//		
//		for ( num = 0; ; num++) {
//			sum += num;
//			
//			if( sum >= 100) 
//				break;
//					
//			}
//			System.out.println(num);
//			System.out.println(sum);
		
//		int sum = 0;
//		int num;
//		
//		for( num = 1; ; num++) {
//			sum+=num;
//			
//			if( sum >= 500) {
//				break;
//			}
//						
//		}
//		System.out.println(sum);
//		System.out.println(num);
		
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
//		switch(operator) {
//		 
//		case '+' : System.out.println(num1 + num2);
//		break;
//		case '-' : System.out.println(num1 - num2);
//		break;
//		case '*' : System.out.println(num1 * num2);
//		break;
//		case '/' : System.out.println(num1 / num2);
//		break;
//		default : System.out.println("허용되지 않는 값입니다.");
		
//		if ( operator == '+') {
//		  System.out.println(num1 + num2);			
//	  }else if ( operator == '-') {
//		  System.out.println(num1 - num2);
//	  }else if ( operator == '*') {
//		  System.out.println(num1 * num2);
//	  }else {
//		  System.out.println(num1 / num2);
//	  }
				

//		for ( int line = 1; line <= 4; line++) {
//			
//			for (int j = 4-line; j > 0; j--) {
//			System.out.print(" ");
//			}
//			
//			for ( int star = 1; star <= line * 2 - 1; star++) {
//			System.out.print("*");
//			
//			}	
//			   			
//			System.out.println("");		
//			} 
		
//		int num = 4;
//		                     
//		for ( int i = 0; i < num; i++) {
//			
//			for ( int j = num-i-1; j > 0; j--) {
//				System.out.print(" ");
//			}
//			
//			for ( int k = 0; k < i*2+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println( );
//			
//		}
//		int num = 8;
//		for ( int i = 3; i >= 0; i--) {
//			
//			for ( int j = 1; j < i+1; j++) {
//				System.out.print(" ");
//			}
//			for ( int k = (num-i-1)*2-1; k > 0; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		   }
		
		
//		int num = 12;
//		for(int i = 0; i <= 9; i++) {
//			
//			for ( int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for( int k = (num-i-1)*2-1; k > 1; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		 for (int i = 8; i >= 0; i--) {
//			
//			for ( int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for( int k = (num-i-1)*2-1; k > 1; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	      int num = 16;
//		  for ( int i = 12; i > 2; i -= 2) {
//			  for ( int j = 0; j < i; j++) {
//				  System.out.print(" ");
//			  }
//			  
//			  for ( int k = (num-i-1)*2-1; k > 1; k--) {
//				  System.out.print("*");
//			  }
//			  
//			  for ( int j = (9-i-1)*2-1; j < 11; j++) {
//				  System.out.print(" ");
//			  }
//			  
//			  for ( int k = (num-i-1)*2-1; k > 1; k--) {
//				  System.out.print("*");
//			  }
//			  System.out.println();
//		      }
//		  
//		  for ( int i = 5; i < num+num; i+=2) {
//			  for( int j = 0; j < i; j++)
//				  System.out.print(" ");
//			  
//			  
//			  
//			  for ( int k = (28-i-1)*2-1; k > 1; k--) {
//				  System.out.print("*");
//			  }
//			  System.out.println(); 
//		  }
		
//		 Scanner sc = new Scanner(System.in);
//		 
//		
//		 int n = sc.nextInt();
//		 int i;
//		 
//		 for (i = n; i > 0;  i--) {
//			 for( int j = 0; j < i; j++) {
//				 for(int k = 0; k < n; k++) {
//				 System.out.print("*");
//				 }
//				 System.out.print(" ");
//			 }
//			 			 
//			
//			 System.out.println();
//		 }
//		 
//		 
		int[][] board = new int[5][5];
		
		int bomb = 1;
		int life = 0;
		
		for(int i=0; i<5; i++) {
		    for(int j=0; j<5; j++) {
		      int answer = (i+1)*(j+1);
		      System.out.println(answer);
		      if ( board[3][2] == bomb) {
		    	  answer -= 9;
		     }else if ( board)
		      
		    }
		}
//		       for(int i=0; i<5; i++) {
//		    	    int count = 0;
//		    	    for(int j=0; j<5; j++) {
//		    	        if(board[i][j] == 1) {
//		    	            count++;
//		    	            System.out.println(count);
//		    	        } else {
//		    	            count = 0;
//		    	        }
//		    	        if(count == 3) {
//		    	            life++;
//		    	        }
//		    	    }
//		    	    count = 0;
//		    	    for(int j=0; j<5; j++) {
//		    	        if(board[i][j] == 0) {
//		    	            count++;
//		    	        } else {
//		    	            count = 0;
//		    	        }
//		    	        if(count == 3) {
//		    	            bomb++;
//		    	        }
//		    	    }
//		    	}

		       		    	  	    		   
		     		       		       		      		       		     
		  }		
	   }			
    	
					
	 
									

									
	
		 	  			
			

			
		
				
		    
		
			
			

		
		
		
		
	


