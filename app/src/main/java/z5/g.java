package z5;

import android.util.SparseIntArray;

/* compiled from: DefaultByteArrayPoolParams.java */
/* loaded from: classes.dex */
public class g {
    public static s a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        return new s(81920, 1048576, sparseIntArray);
    }
}
