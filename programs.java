import java.util.Arrays;
class Practical5{
static int[]num={1,2,3,4,5};
	public static void main(String args[]){
		Practical5 p=new Practical5();
		System.out.println(p.factorial1(5));
		System.out.println(p.factorial2(5));
		System.out.println(p.factorial3(5));
		System.out.println(p.getSum(num));
	}
int factorial1(int num) {
  if(num>=0){
  if (num<2){
  return 1;
  } else {
    int fact = 2;
    for (;num>2;) {
      fact=fact*num--;
    }
    return fact;
  }
  }
  else
  {
  return -1;
  }
}

int factorial2(int num) {
	if(num>=0){
        if (num < 2) {
            return 1;
        } else {
            int fact = 2;
            

            while (num>2) {
                fact *= num--;
            }

            return fact;
        }
        }
        else
        {
        return -1;
        }
    }
    

int factorial3(int num) {
    if(num>=0){
    if (num <= 1) {
        return 1;
    }
    return num*factorial3(num - 1);
    }
    else
    {
    return -1;
    }
}

int getSum(int[] num) {
    if (num.length==0) {
        return 0;}
    else if(num.length==1){
    return num[0];
     }else {
        return num[0] + getSum(Arrays.copyOfRange(num, 1, num.length));
    }
}
}
