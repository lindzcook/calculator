package cs1302.calc;

public class RecursiveMath implements Math{
    public int inc(int n)
    {
	return ++n;
    }

    //decrement function
    public int dec(int n)
    {
	return --n;
    }

    //add 
    public int add(int lhs, int rhs)
    {
	if(rhs == 0) return lhs;
	return add(inc(lhs),dec(rhs));
    }

    //subtract
    public int  sub(int lhs, int rhs)
    {
	if (rhs == 0) return lhs;
	return sub(dec(lhs),dec(rhs));
    }

    //multiply
    public int  mul(int lhs, int rhs)
    {
	if (lhs == 0 || rhs==0) return 0;
	if (rhs == 1) return lhs;
	return add(lhs, mul(lhs,dec(rhs)));
    }

    //divison
    public int  div( int lhs, int rhs)
    {
	if(rhs == 0) throw new ArithmeticException();
	if(lhs < rhs) return 0;
	return inc(div(sub(lhs,rhs), rhs));
    }

    //factorial
    public int fac(int num)
    {
	//if (num > 0) return (mul(num,fac(sub(num,1))));
	if(num > 0) return (fac(sub(num,1)) * num);
		
	return 1;
    }
    
    //power
    public int pow(int lhs, int rhs)
    {
	if (rhs >= 1)
	    {
		return (mul(lhs, (pow(lhs, dec(rhs)))));
	    }//if
	return 1;
	
    }//pow

    //left shift
    public int lshift(int lhs, int rhs)
    {
	if(rhs == 0) return lhs;
	return lshift(mul(2, lhs), dec(rhs));
    }

    //right shift
    public int rshift(int lhs, int rhs)
    {
	if (rhs == 0) return lhs;
	return rshift(div(lhs, 2), dec(rhs));
    }
}