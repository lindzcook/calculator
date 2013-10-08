package cs1302.calc;

public class IterativeMath implements Math {
    public int inc(int n) {
	return ++n;
    }

    public int dec(int n) {
	return --n;
    }

    public int add(int lhs, int rhs){
	 int sum = lhs;
	 while(rhs > 0) {
	     sum = inc(sum);
	     rhs = dec(rhs);
	 }
	 return sum;
     }

    public int sub(int lhs, int rhs) {
	int diff = lhs;
	while(rhs > 0){
	    diff = dec(diff);
	    rhs = dec(rhs);
	}
	return diff;
    }

    public int mul(int lhs, int rhs){
	if(rhs == 0 || lhs == 0 ) return 0;
	int prod = lhs;
	while(rhs > 1){
	    prod = add(lhs, prod);
	    rhs = dec(rhs);
	}
	return prod;
    }

    public int div(int lhs, int rhs){
	if(rhs == 0) throw new ArithmeticException();
	if(lhs == 0) return 0;
	int diff = 0;
	while(lhs >= rhs){
	    diff = inc(diff);
	    lhs = sub(lhs,rhs);
	}
	return diff;
    }

    public int fac(int num){
	int fact = num;
	while(num > 1) {
	    num = dec(num);
	    fact = mul(fact, num);
	}
	return fact;
    }

    public int pow(int lhs, int rhs) {
	int po = lhs;
	while (rhs > 1) {
	    rhs = dec(rhs);
	    po = mul(po, po);
	}
	return po;
    }

    public int lshift(int lhs, int rhs) {
	if(rhs == 0) return lhs; 
	int shift = mul(lhs, 2);
	while(rhs > 1) {
	    shift = mul(shift, 2);
	    rhs = dec(rhs);
	}
        return shift;
    }
    
    public int rshift(int lhs, int rhs) {
	if(rhs == 0) return lhs;
	int shift = div(lhs, 2);
	if(rhs == 1) shift = div(shift, 2);
	while(rhs >  1) {
	    shift = div(shift, 2);
	    rhs = dec(rhs);
	}
	return shift;
}

}
