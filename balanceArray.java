 double a = Double.parseDouble(A[0]);
        double b = Double.parseDouble(A[1]);
        double c = Double.parseDouble(A[2]);

        for(int i=3; i<A.length; i++) {
            if(a+b+c > 1 && a+b+c < 2)
                return 1;

            if(a+b+c > 2) {
                if(a > b && a > c) 
                    a = Double.parseDouble(A[i]);
                else if(b > a && b > c) 
                    b = Double.parseDouble(A[i]);
                else if(c > a && c > b) 
                    c = Double.parseDouble(A[i]);
                
            }
            else {
                if(a < b && a < c) 
                    a = Double.parseDouble(A[i]);
                else if(b < a && b < c) 
                    b = Double.parseDouble(A[i]);
                else if(c < a && c < b) 
                    c = Double.parseDouble(A[i]);
                
            }
        }

        if(a+b+c > 1 && a+b+c < 2)
            return 1;
        
        return 0;
}
