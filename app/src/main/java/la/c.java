package la;

import android.os.Build;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34026a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f34026a = 2;
        } else if (i10 >= 18) {
            f34026a = 1;
        } else {
            f34026a = 0;
        }
    }
}
