package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.b.d;
import com.iab.omid.library.fyber.b.f;
import com.iab.omid.library.fyber.d.e;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f24038a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.3.30-Fyber";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.fyber.b.b.a().a(context);
        com.iab.omid.library.fyber.d.b.a(context);
        d.a().a(context);
    }

    void a(boolean z10) {
        this.f24038a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f24038a;
    }
}
