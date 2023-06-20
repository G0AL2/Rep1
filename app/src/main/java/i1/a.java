package i1;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import j1.c;
import j1.d;
import j1.e;

/* compiled from: WebSettingsCompat.java */
/* loaded from: classes.dex */
public class a {
    private static c a(WebSettings webSettings) {
        return e.c().a(webSettings);
    }

    @SuppressLint({"NewApi"})
    public static void b(WebSettings webSettings, int i10) {
        d dVar = d.FORCE_DARK;
        if (dVar.k()) {
            webSettings.setForceDark(i10);
        } else if (dVar.l()) {
            a(webSettings).a(i10);
        } else {
            throw d.h();
        }
    }

    @SuppressLint({"NewApi"})
    public static void c(WebSettings webSettings, int i10) {
        if (d.FORCE_DARK_STRATEGY.l()) {
            a(webSettings).b(i10);
            return;
        }
        throw d.h();
    }
}
