package Prac28July;

import java.util.Scanner;

public class SpeedConverter {
    // write your code here
	public static void main(String[] args) {
		/*System.out.println(toMilesPerHour(1.5));
		System.out.println(toMilesPerHour(10.25));
		System.out.println(toMilesPerHour(-5.6));
		System.out.println(toMilesPerHour(25.42));
		System.out.println(toMilesPerHour(75.114));
		
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);*/
		//System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.176));
		//printYearsAndDays(561600);
		//sum3And5Challenge();
		//System.out.println(sumOdd(100, 1000));
		//System.out.println(digitSum(75875897));
		//System.out.println(isPalindrome(12343210));
		//System.out.println(sumFirstAndLastDigit(-10));
		//getEvenPositionDigitSum(2000);
		//getEvenDigitSum(76546789);
		//System.out.println(hasSharedDigit(12, 13));
		//System.out.println(getGreatestCommonDivisor(13, 21));
		//printFactors(1);
		//System.out.println(isPerfectNumber(7));
		//System.out.println(getDigitCount(0));
		//System.out.println(reverse(-12));
		//numberToWords(-12);
		//System.out.println(canPack(1, 0, 5));
		//System.out.println(getLargestPrime(16));
		//printSquareStar(23);
		//readingUserinput();
		//minAndMaxInput();
		//inputThenPrintSumAndAverage();
		//System.out.println(getBucketCount(2.75,3.25,2.5,1));
		//System.out.println(getBucketCount(7.25, 4.3,2.35));
		//System.out.println(getBucketCount(3.26,0.75));
		/*Cylinder cy=new Cylinder(2, 2);
		System.out.println(cy.getVolume());*/
//		int[] aa= {1,2,3,4,5};
//		int[] abc;
//		abc= reverseArray(aa);
//		for(int aaaa:abc) {
//			System.out.print(aaaa+" ");
//		}
		String[] names = {};
		System.out.println(whoLikesIt(names));
				
	}
    public static long toMilesPerHour(double KilometersPerHour){
        if(KilometersPerHour<0)
        return -1;
        else
        return Math.round(KilometersPerHour/1.609);
    }
    
    public static void printConversion(double KilometersPerHour) {
    	if(KilometersPerHour<0)
    		System.out.println("Invalid Value");
    	else
    		System.out.println(KilometersPerHour+" km/h = "+Math.round(KilometersPerHour/1.609)+" mi/h");
    	
    	}
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0)
        	System.out.println("Invalid Value");
        else
        	System.out.println(kiloBytes+" KB = "+kiloBytes/1024+" MB and "+kiloBytes%1024+" KB");
        
    }
    
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
    	if(hourOfDay<0||hourOfDay>23)
    		return false;
    	else if(barking&&(hourOfDay<8||hourOfDay>22))
    		return true;
    	else return false;
    }
    
    public static boolean isLeapYear(int year) {
    	if(year<1||year>9999)
    		return false;
    	else {
    		if(year%4==0) {
    			if(year%100==0) {
    				if(year%400==0)
    					return true;
    				else return false;
    			}
    			else return true;
    		}
    		else
    			return false;
    	}
    }
    
    public static boolean areEqualByThreeDecimalPlaces(double param1,double param2) {
    	if((int) (param1*1000)==(int) (param2*1000))
    		return true;
    	else return false;
    }
    
    public static boolean hasEqualSum(int param1,int param2,int param3) {
    	if(param1+param2==param3)
    		return true;
    	else return false;
    }
    
    public static double area(double radius) {
    	if(radius<0)
    		return -1.0;
    	else return Math.PI*radius*radius;
    }
    
    public static double area(double x,double y) {
    	if(x<0||y<0)
    		return -1.0;
    	else return x*y;
    }
    
    public static void printYearsAndDays(long minutes) {
    	if(minutes<0)
    		System.out.println("Invalid Value");
    	else {
    		long years=((minutes/60)/24)/365;
    		long days=((minutes/60)/24)%365;
    		System.out.println(minutes+" min = "+years+" y and "+days+" d");
    	}
    }
    
    public static void printEqual(int p1,int p2,int p3) {
    	if(p1<0||p2<0||p3<00)
    		System.out.println("Invalid Value");
    	if(p1==p2&&p2==p3)
    		System.out.println("All numbers are equal");
    	if(p1!=p2&&p2!=p3)
    		System.out.println("All numbers are different");
    	else System.out.println("Neither all are equal or different");
    }
    
    public static boolean isCatPlaying(boolean summer,int temperature){
        if(temperature>=25 && temperature<=35)
        	return (summer?false:true);
        else if(temperature>=25 && temperature<=45)
        	return (summer?true:false);
        else return false;
    }
    
    public static void printNumberInWord(int number) {
    	switch(number) {
    	case 0:
    		System.out.println("ZERO");
    		break;
    	case 1:
    		System.out.println("ONE");
    		break;
    	case 2:
    		System.out.println("TWO");
    		break;
    	case 3:
    		System.out.println("THREE");
    		break;
    	case 4:
    		System.out.println("FOUR");
    		break;
    	case 5:
    		System.out.println("FIVE");
    		break;
    	case 6:
    		System.out.println("SIX");
    		break;
    	case 7:
    		System.out.println("SEVEN");
    		break;
    	case 8:
    		System.out.println("EIGHT");
    		break;
    	case 9:
    		System.out.println("NINE");
    		break;
    	default:
    		System.out.println("OTHER");
    		break;
    	}
    }
    
    public static boolean isLeapYearr(int year) {
    	if(year>=1&&year<=9999)
    		return false;
    	else {
    	if(year%4==0) {
    		if(year%100==0)
    			return false;
    		else return true;
    	}
    	else return false;
    	}
    	
    }
    
    public static int getDaysInMonth(int month,int year) {
    	if(month<1||month>12)
    		return -1;
    	else if(year<1||year>9999)
    		return -1;
    	switch(month) {
    	case 1:
    		return 31;
    	case 2:
    		if(isLeapYearr(year))
    			return 29;
    		else return 28;
    	case 3:
    		return 31;
    	case 4:
    		return 30;
    	case 5:
    		return 31;
    	case 6:
    		return 30;
    	case 7:
    		return 31;
    	case 8:
    		return 31;
    	case 9:
    		return 30;
    	case 10:
    		return 31;
    	case 11:
    		return 31;
    	case 12:
    		return 31;
    	default:
    		return 0;
    	}
    }
    
    public static void sum3And5Challenge() {
    	int sum=0,count=0;
    	for(int i=1;i<=1000;i++) {
    		if(i%3==0) {
    			if(i%5==0) {
    				System.out.println(i);
    				sum+=i;
    				count++;    	
    				if(count==5)
    					break;
    			}
    		}
    	}
    	System.out.println("Sum ="+sum);
    }
    
    public static boolean isOdd(int num) {
    	if(num<=0)
    		return false;
    	return (num%2==0)?false:true;
    }
    
    public static int sumOdd(int start, int end) {
    	int sum=0;
    if(end>=start&&start>0&&end>0) {
    	for(int i=start;i<=end;i++) {
    		if(isOdd(i))
    			sum+=i;
    	}
    	return sum;
    }
    else return -1;
    }
    
    public static int digitSum(int number) {
    	int sum=0;
    	if(number<=9)
    		return -1;
    	else {
    		while(number!=0) {
    		sum+=number%10;
    		number/=10;
    		}
    		return sum;
    	}
    }
    
    public static boolean isPalindrome(int num) {
    	int number=num,reverse=0;	
    	while(num!=0) {
    		reverse=reverse*10+(num%10);
    		num/=10;
    	}
    	return reverse==number?true:false;
    }
    
    public static int sumFirstAndLastDigit(int number) {
    	int sum=number%10,firstdigit=0;
    	if(number<0)
    		return -1;
    	else {
    		while(number!=0) {
    		firstdigit=number%10;
    		number/=10;
    		}
    		return sum+firstdigit;
    	}
    }
    
    public static int getEvenPositionDigitSum(int number) {
    	
    	int i=0,num=number;
    	int sum=0;
    	if(number<=0)
    		return -1;
    	while(number!=0) {
    		number/=10;
    		i++;
    		}
    	if(!(i%2==0))
    		num=num/10;
    	for(int j=0;j<i;j++) {
    		if(j%2==0)
    			sum+=num%10;
    		num/=10;
    	} 
    	return sum;
    }
    
    public static int getEvenDigitSum(int number) {
    	int sum=0;
    	if(number<0)
    		return -1;
    	else {
    		while(number!=0) {
    			if((number%10)%2==0)
    				sum+=number%10;
    		number/=10;
    		}
    		return sum;
    	}
    }
    
    public static boolean hasSharedDigit(int num1,int num2) {
    	int num11=0;
    	int num12=num2;
    	if(!(num1>=10&&num1<=99&&num2>=10&&num2<=99))
    		return false;
    	while(num1!=0) {
    		num11=num1%10;
    		num2=num12;
    		while(num2!=0) {
    			if(num2%10==num11)
    				return true;
    		num2/=10;
    		}
    		num1/=10;
		}
    	return false;
    }
    
    public static boolean hasSameLastDigit(int num1,int num2,int num3) {
    	if(isValid(num1)&&isValid(num2)&&isValid(num3)) {
    		if(num1%10==num2%10||num2%10==num3%10||num3%10==num1%10)
    			return true;
    		else return false;
    	}
    	else return false;
    }
    
    public static boolean isValid(int num) {
    	if(num>=10&&num<=1000) {
    		return true;
    	}
    	else return false;
    }
    
    public static int getGreatestCommonDivisor(int num1,int num2) {
    	int greatest=0;
    	if(num1<10||num2<10)
    		return -1;
    	else {
    		int i=1;
    		while(i<=num1&&i<=num2) {
    			if(num1%i==0&&num2%i==0) {
    				greatest=i;
    			}
    			i++;
    		}
    		return greatest;
    		/*if(greatest>0)
    		return greatest;
    		else return -1;*/
    	}
    }
    
    public static void printFactors(int num){
    	if(num<1)
    		System.out.print("Invalid Value");
    	else {
    		int i=1;
    		while(i<=num) {
    			if(num%i==0) {
    				if(i!=1) 
    					System.out.print(" ");
    				System.out.print(i);
    			}
    			i++;
    		}
    	}
    }
    
    public static boolean isPerfectNumber(int num) {
    	if(num<1)
    		return false;
    	else {
    		int i=1,perfect=0;
    		while(i<num) {
    			if(num%i==0) {
    				perfect+=i;
    			}
    			i++;
    		}
    		if(perfect==num)
    			return true;
    		else return false;
    	}
    }
    
    public static int getDigitCount(int num) {
    	if(num<0) return -1;
    	else if(num==0)
    		return 1;
    	else {
    		int i=0;
    		while(num!=0) {
    			num/=10;
    			i++;
    		}
    		return i;
    	}
    }
    
    public static int reverse(int num) {
    	int reverse=0;
    	if(num==0)
    		return 0;
    	else {
    		while(num!=0) {
        		reverse=reverse*10+(num%10);
        		num/=10;
        	}
    		return reverse;
    	}
    }
    
    public static void numberToWords(int num) {
    	if(num<0) System.out.println("Invalid Value");
    	else {
    		int numrev=reverse(num);
    		int diffcount=getDigitCount(num)-getDigitCount(numrev);
    		
    		if(num==0) System.out.print("Zero");
    		while(numrev!=0) {
    		int last=numrev%10;
    		numrev/=10;
    		if(last==0) System.out.print("Zero");
    		else if(last==1) System.out.print("One");
    		else if(last==2) System.out.print("Two");
    		else if(last==3) System.out.print("Three");
    		else if(last==4) System.out.print("Four");
    		else if(last==5) System.out.print("Five");
    		else if(last==6) System.out.print("Six");
    		else if(last==7) System.out.print("Seven");
    		else if(last==8) System.out.print("Eight");
    		else if(last==9) System.out.print("Nine");
    		
    		if(numrev!=0) System.out.print(" ");
    		}
    		if(diffcount>0) {
    			System.out.print(" ");
    			for(int i=0;i<diffcount;i++) {
    				System.out.print("Zero");
    				if(i+1!=diffcount) System.out.print(" ");
    			}
    		}
    	}
    }
    
    public static boolean canPack(int bigCount,int smallCount,int goal) {
    	/*if(goal<0||bigCount<0||smallCount<0)
    		return false;
    	else {
    		 if(bigCount*5+smallCount==goal)
    				return true;
    		 else if(goal%5==0&&goal<bigCount*5)
    			 return true;
    		else if((bigCount*5==goal&&smallCount==0)||(bigCount==0&&smallCount==goal))    				
    			return true;
    			else if(bigCount*5<goal&&(bigCount*5+smallCount>=goal))
    				return true;
    			else return false;
    	}*/
    	int totalKilos = (5 * bigCount) + smallCount;
        int count =0;
        int temp = 0;
        if(!(bigCount<0&&goal<0&&smallCount<0))
        	return false;
        else if (totalKilos < goal){                     //Checks if the total number of Kilos is sufficient or not.
            return false;
        }
        else if (totalKilos == goal){              //This case will always be true.
            return true;
        }
        else{                                      //If the total number of kilos is greater than our goal.(Packaging problem)
            for(int i=0;i<goal;i++){               //For loop that gets the largest number that is divisible by 5 in the number 'goal'.
                temp = goal - i;
                if (temp % 5 == 0){
                    break;
                }
            }
            if (bigCount>= temp/5) {               //If the number of big bags is bigger than the biggest number divisible by 5
                goal -= temp;
                if (smallCount >= goal) {          //Compares the remaining kilos with the small bags
                    return true;
                }
                return false;
            }
            else{                                   //If the number of big bags is smaller than the biggest number divisible by 5
                goal -= (temp-bigCount*5);
                if (smallCount >= goal) {
                    return true;
                }
                return false;
            }
        }
    }
    
    public static int getLargestPrime(int num) {
    	if(num<0)
    		return -1;
    	else {
    		int largestprime=-1,prime=0;
    		for(int i=2;i<=num;i++) {
    			if(num%i==0) {
    				for(int j=2;j<=i/2;j++) {
    					if(i%j==0)
    						prime++;
    				}
    				if(prime==0) {
    					largestprime=i;
    				}
    				//else largestprime=-1;
    				
    			}
    			prime=0;
    		}
    		return largestprime;
    	}
    }
    
    public static void printSquareStar(int num) {
    	if(num<5)
    		System.out.println("Invalid Value");
    	else {
    	for(int i=0;i<num;i++)
    		System.out.print("*");
    	System.out.println();
    	for(int i=0;i<num-2;i++) {
    		System.out.print("*");
    		for(int j=0;j<num-2;j++) {
    			if(i==j)
    				System.out.print("*");
    			else if(j==num-i-3)
    				System.out.print("*");
    			else System.out.print(" ");
    		}
    		System.out.print("*");
    		System.out.println();
    	}
    	for(int i=0;i<num;i++)
    		System.out.print("*");
    }
    }
    
    public static void readingUserinput() {
    	int count=1,sum=0;
    	Scanner scanner= new Scanner(System.in);
    	while(count<=10) {
    		System.out.println("Enter number #"+count+":");
    		boolean hasint=scanner.hasNextInt();
    		if(hasint) {
    			sum+=scanner.nextInt();
    			count++;
    		}
    		else System.out.println("Invalid Number");
    		scanner.nextLine();
    	}
    	System.out.println("Sum = "+sum);
    	scanner.close();
    }
    
    public static void minAndMaxInput() {
    	int min=0,max=0,currentnum=0;
    	boolean first=true;
    	Scanner scanner= new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter number:");
    		boolean hasint=scanner.hasNextInt();
    		if(hasint) {
    			currentnum=scanner.nextInt();
    			if(first) {
    				first=false;
    				min=currentnum;
    				max=currentnum;
    			}
    			if(currentnum<min)
    				min=currentnum;
    			else if(currentnum>max)
    				max=currentnum;
    		}
    		else break;
    		scanner.nextLine();
    	}
    	System.out.println("Min = "+min+" and Max = "+max);
    	scanner.close();
    }
    public static void inputThenPrintSumAndAverage() {
    	double sum=0,currentnum=0;
    	double count=0;
    	int Average=0;
    	boolean first=true;
    	Scanner scanner= new Scanner(System.in);
    	while(true) {
    		boolean hasint=scanner.hasNextInt();
    		if(hasint) {
    			currentnum=scanner.nextInt();
    			count++;
    			sum+=currentnum;
    			Average=(int)Math.round(sum/count);
    		}
    		else break;
    		scanner.nextLine();
    	}
    	System.out.println("SUM = "+(int)sum+" AVG = "+Average);
    	scanner.close();
    }
    
    /*public static int getBucketCount(double width,double height,double areaPerBucket,double extraBuckets) {
    	
    }*/
    
    public static int getBucketCount(double width,double height,double areaPerBucket,int extrabuckets) {
    	if(width<=0||height<=0||areaPerBucket<=0||extrabuckets<0) {
    		return -1;
    	}
    	else return getBucketCount(width, height, areaPerBucket)-extrabuckets;
    }
    public static int getBucketCount(double width,double height,double areaPerBucket) {
    	if(width<=0||height<=0||areaPerBucket<=0)
    		return -1;
    	else {
    		return getBucketCount(width*height, areaPerBucket);//(int)Math.ceil((width*height)/areaPerBucket);
    	}
    	
    }
    public static int getBucketCount(double area,double areaPerBucket) {
    	if(area<=0||areaPerBucket<=0)
    		return -1;
    	else {
    		return (int)Math.ceil(area/areaPerBucket);
    	}
    }
    
    public static int[] reverseArray(int[] a) {
        int[] arr=new int[a.length];
    for (int i = a.length-1,j=0; i >=0&&j<a.length; i--,j++) {
            arr[j]=a[i];
        }
    return arr;
    }
    
    public static String whoLikesIt(String... names) {
        //Do your magic here
      int length= names.length;
      if(length==0)
        return "no one likes this";
      else{
      switch(length){
          case 1: return names[0]+" likes this";
          case 2: return names[0]+" and "+names[1]+" likes this";
          case 3: return names[0]+", "+names[1]+" and "+names[2]+" likes this";
          default: return names[0]+", "+names[1]+" and "+(length-2)+" others likes this";
      }
        }
    }
    
    public static void whichAreIn() {
    	
    }
}