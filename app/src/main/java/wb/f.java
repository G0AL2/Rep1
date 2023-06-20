package wb;

import android.os.Bundle;

/* compiled from: UnavailableAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class f implements a {
    @Override // wb.a
    public void a(String str, Bundle bundle) {
        vb.f.f().b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
