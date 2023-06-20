package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private Object f2722a;

    private w(Object obj) {
        this.f2722a = obj;
    }

    public static w b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new w(PointerIcon.getSystemIcon(context, i10));
        }
        return new w(null);
    }

    public Object a() {
        return this.f2722a;
    }
}
