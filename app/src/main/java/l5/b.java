package l5;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import o5.f;
import p5.i;
import t3.d;
import w5.c;

/* compiled from: AnimatedFactoryProvider.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33699a;

    /* renamed from: b  reason: collision with root package name */
    private static a f33700b;

    public static a a(f fVar, r5.f fVar2, i<d, c> iVar, boolean z10, ExecutorService executorService) {
        if (!f33699a) {
            try {
                f33700b = (a) AnimatedFactoryV2Impl.class.getConstructor(f.class, r5.f.class, i.class, Boolean.TYPE, w3.f.class).newInstance(fVar, fVar2, iVar, Boolean.valueOf(z10), executorService);
            } catch (Throwable unused) {
            }
            if (f33700b != null) {
                f33699a = true;
            }
        }
        return f33700b;
    }
}
