class Solution {
    public int compress(char[] chars) {

        if (chars.length == 1) {
            return 1;
        }

        StringBuilder string = new StringBuilder();

        int i = 0;
        int j = 1;
        int count = 1;

        while (j < chars.length) {

            if (chars[i] == chars[j]) {
                count++;
                j++;
            } else {
                string.append(chars[i]);

                if (count > 1) {
                    string.append(count);
                }

                count = 1;
                i = j;
                j++;
            }
        }

        // Process the last group
        string.append(chars[i]);
        if (count > 1) {
            string.append(count);
        }

        // Copy compressed string back to chars
        for (int k = 0; k < string.length(); k++) {
            chars[k] = string.charAt(k);
        }

        return string.length();
    }
}