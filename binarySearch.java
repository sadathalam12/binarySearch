 public static int binarySearch(int value, int [] r){
        int index = 0; 
         int firstIndex = 0; 
        int lastIndex = r.length;
        int middleIndex = (firstIndex+lastIndex)/2; 
        
        while(value != r[middleIndex]){
            
            
            if(value == r[middleIndex]){
                index = middleIndex; 
                break; 
            }else if(value > r[middleIndex]){
                firstIndex = middleIndex;
            }else if(value < r[middleIndex]){
                lastIndex = middleIndex; 
            }
            
        }
        return index; 
    
}