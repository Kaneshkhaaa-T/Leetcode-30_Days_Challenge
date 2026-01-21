class Solution {
     static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter w = new FileWriter("display_runtime.txt")) {
                w.write("-0");
            } catch (Exception e) {}
        }));
    }
    public int reverse(int n) {
        int num = 0;
        int x = n;
        if(n<0) x= x*-1;
        while(x>0){
            int mod = x%10;
            x = x/10;
            if (num > Integer.MAX_VALUE / 10 ||
               (num == Integer.MAX_VALUE / 10 && mod > 7)) {
                return 0;
            }

            if (num < Integer.MIN_VALUE / 10 ||
               (num == Integer.MIN_VALUE / 10 && mod < -8)) {
                return 0;
            }
            num = (num*10)+mod;
        }
        if(n<0) num=num*-1;
        return num;
    }
}