/**
 * Created by Ambition on 5/21/16.
 */
public class AList {
    int a[];
    int lastItem;

    public AList() {
        a = new int[10];
        lastItem = -1;
    }

    public void insertItem(int newItem, int location) {
        if (lastItem + 1 == a.length) {
            int b[] = new int[2 * a.length];
            for (int i = 0; i <= lastItem; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        for (int j = lastItem; j >= location; j--) {
            a[j + 1] = a[j];
        }
        a[location] = newItem;
        lastItem++;
    }

}
