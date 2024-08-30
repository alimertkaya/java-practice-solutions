int sum = 0;
int biggestNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size() - 2; i++) {
        for (int j = 0; j < arr.size() - 2; j++) {
sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
sum += arr.get(i + 1).get(j + 1);
sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (biggestNum < sum)
biggestNum = sum;
            }
                    }
                    System.out.println(biggestNum);