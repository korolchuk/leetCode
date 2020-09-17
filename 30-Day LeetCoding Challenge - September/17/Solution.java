class Solution {
    public boolean isRobotBounded(String instructions) {
        int direction = 0;
        int[][] movement = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int x = 0;
        int y = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < instructions.length(); j++) {
                switch(instructions.charAt(j)) {
                    case 'G':
                        x += movement[direction][0];
                        y += movement[direction][1];
                        break;
                    case 'L':
                        direction = (direction + 3 ) % 4;
                        break;
                    case 'R':
                        direction = (direction + 1 ) % 4;
                        break;
                }
            }
            if(x == 0 && y == 0) {
                return true;
            }
        }
            
        if(x == 0 && y == 0) {
            return true;
        }
        
        return false;
    }
}