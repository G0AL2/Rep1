package wb;

import android.os.Bundle;

/* compiled from: CrashlyticsOriginAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private final rb.a f38541a;

    public e(rb.a aVar) {
        this.f38541a = aVar;
    }

    @Override // wb.a
    public void a(String str, Bundle bundle) {
        this.f38541a.a("clx", str, bundle);
    }
}
