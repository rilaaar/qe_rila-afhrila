package Problem4;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashSet;

public class ArrayUnique {
    public static void main(String[] args) {
        class A {

            static int minIncrementForUnique(int[] A)
            {
                TreeMap<Integer, Integer> dict
                        = new TreeMap<Integer, Integer>();
                HashSet<Integer> used = new HashSet<Integer>();

                for (int i : A) {
                    if (dict.containsKey(i))
                        dict.put(i, dict.get(i) + 1);
                    else {
                        dict.put(i, 1);
                        used.add(i);
                    }
                }

                int maxUsed = 0;
                int ans = 0;

                for (Map.Entry<Integer, Integer> entry :
                        dict.entrySet()) {

                    int value = entry.getKey();
                    int freq = entry.getValue();

                    if (freq <= 1)
                        continue;

                    int duplicates = freq - 1;


                    int cur = Math.max(value + 1, maxUsed);
                    while (duplicates > 0) {
                        if (!used.contains(cur)) {
                            ans += cur - value;
                            used.add(cur);
                            duplicates--;
                            maxUsed = cur;
                        }
                        cur++;
                    }
                }

                return ans;
            }


            public static void main(String[] args)
            {
                int[] A = {1, 2, 3, 4, 1, 3, 5, 10, 16};
                System.out.print(minIncrementForUnique(A));
            }
        }

    }
}
