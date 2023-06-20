package com.facebook.yoga;

/* compiled from: YogaConfigJNIFinalizer.java */
/* loaded from: classes.dex */
public class f extends e {
    public void c() {
        long j10 = this.f16599a;
        if (j10 != 0) {
            this.f16599a = 0L;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
