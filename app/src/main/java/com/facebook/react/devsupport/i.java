package com.facebook.react.devsupport;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;

/* compiled from: ViewHierarchyUtil.java */
/* loaded from: classes.dex */
public class i {
    public static Pair<View, Integer> a(View view) {
        LinkedList linkedList = new LinkedList();
        Pair<View, Integer> pair = new Pair<>(view, 1);
        linkedList.add(pair);
        while (!linkedList.isEmpty()) {
            Pair<View, Integer> pair2 = (Pair) linkedList.poll();
            if (((Integer) pair2.second).intValue() > ((Integer) pair.second).intValue()) {
                pair = pair2;
            }
            Object obj = pair2.first;
            if (obj instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) obj;
                Integer valueOf = Integer.valueOf(((Integer) pair2.second).intValue() + 1);
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    linkedList.add(new Pair(viewGroup.getChildAt(i10), valueOf));
                }
            }
        }
        return pair;
    }
}
