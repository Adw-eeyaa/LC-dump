 String str;
        for(int i = 0;i < s.length() - 1;i++){
            for(int j =i+1;j < s.length() - 1;j++){
                str = s.substring(i,j);
                
            }
        }  
        StringBuilder st = new StringBuilder(str);
        String rev = st.toString();
        if(str == rev){
            return str;
        }
        return str;
    }
