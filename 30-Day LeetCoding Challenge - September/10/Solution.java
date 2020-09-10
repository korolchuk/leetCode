class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        int[] count = new int[10];
        for(int i = 0; i < secret.length(); i++) {
            count[secret.charAt(i) - 48]++;
        }
        
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                bull++;
                count[guess.charAt(i) - 48]--;
            }
        }
        
        for (int i = 0; i < guess.length(); i++) {
            if (count[guess.charAt(i) - 48] > 0 && guess.charAt(i) != secret.charAt(i)) {
                cow++;
                count[guess.charAt(i) - 48]--;
            }
        }
        
        return String.valueOf(bull) + "A" + String.valueOf(cow) + "B";
    }
}