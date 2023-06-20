package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.b.d;
import com.iab.omid.library.ironsrc.b.f;
import com.iab.omid.library.ironsrc.d.e;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f24267a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        return "1.3.12-Ironsrc";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.ironsrc.b.b.a().a(context);
        com.iab.omid.library.ironsrc.d.b.a(context);
        d.a().a(context);
    }

    void a(boolean z10) {
        this.f24267a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.f24267a;
    }
}
