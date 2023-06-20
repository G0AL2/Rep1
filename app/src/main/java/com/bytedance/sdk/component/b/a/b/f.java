package com.bytedance.sdk.component.b.a.b;

/* compiled from: SegmentPool.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    static e f10021a;

    /* renamed from: b  reason: collision with root package name */
    static long f10022b;

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e a() {
        synchronized (f.class) {
            e eVar = f10021a;
            if (eVar != null) {
                f10021a = eVar.f10019f;
                eVar.f10019f = null;
                f10022b -= 8192;
                return eVar;
            }
            return new e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(e eVar) {
        if (eVar.f10019f == null && eVar.f10020g == null) {
            if (eVar.f10017d) {
                return;
            }
            synchronized (f.class) {
                long j10 = f10022b;
                if (j10 + 8192 > 65536) {
                    return;
                }
                f10022b = j10 + 8192;
                eVar.f10019f = f10021a;
                eVar.f10016c = 0;
                eVar.f10015b = 0;
                f10021a = eVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
