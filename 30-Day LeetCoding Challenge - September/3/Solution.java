class Solution {
  public boolean repeatedSubstringPattern(String s) {
    int len = s.length();
    for(int i = len / 2; i > 0; --i ) {
      if(len % i == 0) {
        int count = len / i;
        String first = s.substring(0, i);
        boolean mark = true;
        for(int j = 1; j < count; j++) {
          if (!first.equals(s.substring(i * j, i * (j + 1)))) {
            mark = false;
            break;
          };
        }
        if (mark == true) {
          return true; 
        }
      }
    }
    return false;
  }
}