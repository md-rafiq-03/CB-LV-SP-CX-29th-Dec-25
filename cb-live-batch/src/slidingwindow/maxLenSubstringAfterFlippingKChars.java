package slidingwindow;

public class maxLenSubstringAfterFlippingKChars {

    public  static int findLen(String s,char toFlipChar,int k ){
        //String s = "a a b a b a b a b b  b b b b";
        int flipCnt = 0;
        int len = 0;
        int i=0,j=0;
        int n = s.length();
        while(j<n){
            if(s.charAt(j)==toFlipChar){
                flipCnt++;
            }

            //inavlid , flipCnt>2
            if(flipCnt>k){
//                System.out.println("invalid window : "+s.substring(i,j+1));
//                System.out.println(i+ " "+j);
                while(flipCnt>k && i<j){
                    //i++;
                    if(s.charAt(i)==toFlipChar){
                        flipCnt--;
                    }
                    i++;
                }
            }

            // flipCnt<=k
            if(flipCnt<=k){
                System.out.println(i+ " "+j);
                len=Math.max(len,j-i+1);
            }

            j++;
        }

        return len;
    }
    public static void main(String[] args) {
        String s = "aababababbbbbb";
        int k = 2;
        // toKeep = 'a' , toFlip = 'b'
       int ans1 = findLen(s, 'b', k);
        // toKeep 'b' , toFlip = 'a'
        int ans2 = findLen(s, 'a', k);


       System.out.println(Math.max(ans1, ans2));
    }
}
