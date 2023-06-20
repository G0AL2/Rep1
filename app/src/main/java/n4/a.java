package n4;

import android.util.SparseIntArray;

/* compiled from: DebugOverlayImageOriginColor.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f34632a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f34632a = sparseIntArray;
        sparseIntArray.append(1, -7829368);
        sparseIntArray.append(2, -65536);
        sparseIntArray.append(3, -256);
        sparseIntArray.append(4, -256);
        sparseIntArray.append(5, -16711936);
        sparseIntArray.append(6, -16711936);
        sparseIntArray.append(7, -16711936);
    }

    public static int a(int i10) {
        return f34632a.get(i10, -1);
    }
}
