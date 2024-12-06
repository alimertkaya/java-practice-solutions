public static boolean canWin(int leap, int[] game) {
    int n = game.length;
    Stack<Integer> stack = new Stack<>();
    stack.push(0); // baslangic konumu

    while (!stack.isEmpty()) {
        int position = stack.pop();

        if (position >= n)
            return true;

        if (position < 0 || game[position] == 1) {
            continue;
        }

        // visited
        game[position] = 1;

        stack.push(position + leap);
        stack.push(position + 1);
        stack.push(position - 1);
    }
    return false;
}
