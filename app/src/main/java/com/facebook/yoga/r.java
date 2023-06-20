package com.facebook.yoga;

/* compiled from: YogaNodeJNIFinalizer.java */
/* loaded from: classes.dex */
public class r extends YogaNodeJNIBase {
    public r() {
    }

    protected void finalize() throws Throwable {
        try {
            n0();
        } finally {
            super.finalize();
        }
    }

    public void n0() {
        long j10 = this.f16585e;
        if (j10 != 0) {
            this.f16585e = 0L;
            YogaNative.jni_YGNodeFreeJNI(j10);
        }
    }

    public r(c cVar) {
        super(cVar);
    }
}
