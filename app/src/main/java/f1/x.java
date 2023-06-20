package f1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30070a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new v(viewGroup);
        }
        return u.g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void b(ViewGroup viewGroup, boolean z10) {
        if (f30070a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f30070a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (i10 >= 18) {
            b(viewGroup, z10);
        } else {
            y.b(viewGroup, z10);
        }
    }
}
