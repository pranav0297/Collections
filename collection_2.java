class collection_2 {

    int unique(String s){

        StringBuffer sb = new StringBuffer(s);

        for (int i = 0; i < sb.length(); i++) {
            int count = 0;
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    j--;

                    count++;
                }
            }
            if (count >= 1) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        int len = sb.length();
        return len ;
    }

    public static void main (String[] args) {

        collection_2 c = new collection_2();
        String s= "PranavMishra";
        System.out.println("Total nummber of unique character in String is :  "+c.unique(s));
    }
}
