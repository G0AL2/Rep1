package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2661a;

    private d(Object obj) {
        this.f2661a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2661a).getSafeInsetBottom();
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2661a).getSafeInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2661a).getSafeInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f2661a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return h0.c.a(this.f2661a, ((d) obj).f2661a);
    }

    public int hashCode() {
        Object obj = this.f2661a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2661a + "}";
    }
}
