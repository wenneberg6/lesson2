public class Cprno {
    private long cprno;

    public Cprno(Long cprInd) {
       cprno = cprInd;
    }
    
    public long getCprno() {
        return this.cprno;
    }
    
    public String toString() {
        String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
        if (!this.checkCprno())
            aString += ", invalid";
        return aString;
    }
    
    public boolean checkCprno() {
        long sum;
        long restcpr = this.cprno;
        sum = 0L;

        sum += (restcpr % 10) * 1;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 5;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 6;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 7;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 2;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 3;
        restcpr = restcpr / 10;
        sum += (restcpr % 10) * 4;
        restcpr = restcpr / 10;
        if (sum % 11 == 0 && sum != 0)
          return true;
        else
          return false;
     }

    public static void main(String[] args) {
    	Cprno c = new Cprno(1212120012L);
    	System.out.println(c);
    }
}
