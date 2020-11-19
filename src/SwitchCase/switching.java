package SwitchCase;

//Switch used for Duplicate elements , in multi selection s.
public class switching {

	public static void main(String[] args) {
		int week=8;
        String day;
        
        switch (week) {
        case 1:
        	day="sunday";
        	break;
        	
        case 2:
        	day="monday";
        	break;
        	
        case 3:
        	day="tuesday";
        	break;
        	
        case 4:
        	day="wednesday";
        	break;
        	
        case 5:
        	day="thursday";
        	break;
        	
        case 6:
        	day="Friday";
        	break;
        	
        case 7:
        	day="saturday";
        	break;
        	
        	//if condition is not true then print Invalid- 8 ,9,10, 12
        	default:
        		day="Invalid Day";
        		break;
        
        }
        System.out.println("the Days : "+ day);
	}

}
