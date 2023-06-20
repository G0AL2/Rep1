package ib;

import java.util.Objects;

/* compiled from: MoreObjects.java */
/* loaded from: classes3.dex */
public final class g {
    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }
}
