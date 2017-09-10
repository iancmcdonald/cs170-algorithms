import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

class MergeSort {

    static <T extends Comparable<T>> List<T> mergeSort(List<T> list) {
        if (list.size() > 1) {
            return merge(mergeSort(list.subList(0, (list.size() / 2))),
                    mergeSort(list.subList((list.size() / 2), list.size())));
        } else {
            return list;
        }
    }

    static <T extends Comparable<T>> List<T> mergeSortIterative(List<T> list) {
        ArrayDeque<List<T>> q = new ArrayDeque<>();
        for (T num : list) {
            List<T> toInsert = new ArrayList<>();
            toInsert.add(num);
            q.addLast(toInsert);
        }
        while (q.size() > 1) {
            q.addLast(merge(q.pop(), q.pop()));
        }
        return q.pop();
    }

    private static <T extends Comparable<T>> List<T> merge(List<T> x, List<T> y) {
        int k = x.size();
        int l = y.size();
        if (k == 0) {
            return y;
        }
        if (l == 0) {
            return x;
        }
        ArrayList<T> result = new ArrayList<>();
        if (x.get(0).compareTo(y.get(0)) == 0 || x.get(0).compareTo(y.get(0)) < 0) {
            result.add(x.get(0));
            result.addAll(merge(x.subList(1, k), y));
        } else {
            result.add(y.get(0));
            result.addAll(merge(x, y.subList(1, l)));
        }
        return result;
    }
}

