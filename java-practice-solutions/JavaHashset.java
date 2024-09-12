HashSet<String> nameSet = new HashSet<>();

        for (int i = 0; i < t; i++) {
        nameSet.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(nameSet.size());
        }