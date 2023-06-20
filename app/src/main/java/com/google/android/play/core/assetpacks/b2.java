package com.google.android.play.core.assetpacks;

/* loaded from: classes3.dex */
final /* synthetic */ class b2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f22778a;

    private b2(a0 a0Var) {
        this.f22778a = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable a(a0 a0Var) {
        return new b2(a0Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22778a.p();
    }
}
