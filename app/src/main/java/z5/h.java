package z5;

import android.util.SparseIntArray;

/* compiled from: DefaultFlexByteArrayPoolParams.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int f40008a = Runtime.getRuntime().availableProcessors();

    public static SparseIntArray a(int i10, int i11, int i12) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i10 <= i11) {
            sparseIntArray.put(i10, i12);
            i10 *= 2;
        }
        return sparseIntArray;
    }

    public static s b() {
        int i10 = f40008a;
        return new s(4194304, i10 * 4194304, a(131072, 4194304, i10), 131072, 4194304, i10);
    }
}
