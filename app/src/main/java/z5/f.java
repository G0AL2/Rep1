package z5;

import android.util.SparseIntArray;

/* compiled from: DefaultBitmapPoolParams.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f40007a = new SparseIntArray(0);

    public static s a() {
        return new s(0, b(), f40007a);
    }

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
