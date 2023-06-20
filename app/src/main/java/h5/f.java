package h5;

import android.net.Uri;

/* compiled from: MultiUriHelper.java */
/* loaded from: classes.dex */
public abstract class f {
    public static <T> Uri a(T t10, T t11, T[] tArr, y3.e<T, Uri> eVar) {
        Uri apply;
        Uri apply2;
        if (t10 == null || (apply2 = eVar.apply(t10)) == null) {
            if (tArr == null || tArr.length <= 0 || tArr[0] == null || (apply = eVar.apply(tArr[0])) == null) {
                if (t11 != null) {
                    return eVar.apply(t11);
                }
                return null;
            }
            return apply;
        }
        return apply2;
    }
}
