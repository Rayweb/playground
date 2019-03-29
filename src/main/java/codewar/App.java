package codewar;

public final class App {
  
    public static void main(String[] args) {
        boolean result = isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'});
        System.out.println(result);
    }
    public static boolean isValid(char[] walk) {
        if(walk.length > 10) {
          return false;  
        }
        int north = 0;
        int south = 0;
        int east = 0;
        int west = 0;
        for(char direction : walk){
          switch(direction){
            case 'n': 
              north = north + 1;
              break;
            case 's': 
              south = south + 1;
              break;
            case 'e':
              east = east +1;
              break;
            case 'w': 
              west = west +1;
              break;
            default: 
              break;
          }
        }
       return north - south == 0 && 
              east - west == 0;
      }
}
