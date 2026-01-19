import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } 
            else {
                // 🔹 KEY FIX: keep checking collisions in a loop
                while (!stack.isEmpty() && stack.peek() > 0) {  
                    int peek = stack.peek();
                    int num = -asteroids[i];

                    if (num > peek) {
                        stack.pop();   // destroy right-moving asteroid
                    } 
                    else if (peek > num) {
                        asteroids[i] = 0; // destroy current left-moving asteroid
                        break;
                    } 
                    else {  // both equal -> both destroyed
                        stack.pop();
                        asteroids[i] = 0;
                        break;
                    }
                }

                if (asteroids[i] != 0) {
                    stack.push(asteroids[i]);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        int[] arr = new int[list.size()];
        int j=0;
        for (int i = list.size() - 1; i >= 0; i--) {
            arr[i] = list.get(j);
            j++;
        }

        return arr;
    }
}
