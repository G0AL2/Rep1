package o5;

import android.os.Build;
import z5.r;

/* compiled from: PlatformBitmapFactoryProvider.java */
/* loaded from: classes.dex */
public class g {
    public static f a(r rVar, com.facebook.imagepipeline.platform.d dVar, r5.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            return new a(rVar.b(), aVar);
        }
        if (i10 >= 11) {
            return new e(new b(rVar.h()), dVar, aVar);
        }
        return new c();
    }
}
