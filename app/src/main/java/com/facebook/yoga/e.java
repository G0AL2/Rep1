package com.facebook.yoga;

/* compiled from: YogaConfigJNIBase.java */
/* loaded from: classes.dex */
public abstract class e extends c {

    /* renamed from: a  reason: collision with root package name */
    long f16599a;

    private e(long j10) {
        if (j10 != 0) {
            this.f16599a = j10;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.c
    public void a(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f16599a, f10);
    }

    @Override // com.facebook.yoga.c
    public void b(boolean z10) {
        YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.f16599a, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
