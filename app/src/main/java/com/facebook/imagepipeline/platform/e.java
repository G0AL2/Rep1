package com.facebook.imagepipeline.platform;

import android.os.Build;
import h0.f;
import java.lang.reflect.InvocationTargetException;
import r5.m;
import z5.r;

/* compiled from: PlatformDecoderFactory.java */
/* loaded from: classes.dex */
public class e {
    public static d a(r rVar, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            int e10 = rVar.e();
            return new c(rVar.b(), e10, new f(e10));
        } else if (i10 < 21 && m.a()) {
            try {
                if (!z10 || i10 >= 19) {
                    int i11 = KitKatPurgeableDecoder.f14870d;
                    return (d) KitKatPurgeableDecoder.class.getConstructor(com.facebook.imagepipeline.memory.f.class).newInstance(rVar.d());
                }
                int i12 = GingerbreadPurgeableDecoder.f14868e;
                return (d) GingerbreadPurgeableDecoder.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e12);
            } catch (InstantiationException e13) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e13);
            } catch (NoSuchMethodException e14) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e14);
            } catch (InvocationTargetException e15) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e15);
            }
        } else {
            int e16 = rVar.e();
            return new a(rVar.b(), e16, new f(e16));
        }
    }
}
