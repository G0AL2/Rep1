package com.iab.omid.library.ironsrc.b;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes3.dex */
public class b {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    private static b f24271a = new b();

    /* renamed from: b  reason: collision with root package name */
    private Context f24272b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f24273c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24274d;

    /* renamed from: e  reason: collision with root package name */
    private a f24275e;

    /* loaded from: classes3.dex */
    public interface a {
    }

    private b() {
    }

    public static b a() {
        return f24271a;
    }

    private void e() {
        boolean z10 = !this.f24274d;
        for (com.iab.omid.library.ironsrc.adsession.a aVar : com.iab.omid.library.ironsrc.b.a.a().b()) {
            aVar.getAdSessionStatePublisher().a(z10);
        }
    }

    public void a(Context context) {
        this.f24272b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f24275e = aVar;
    }

    public void b() {
        this.f24273c = true;
        e();
    }

    public void c() {
        this.f24273c = false;
        this.f24274d = false;
        this.f24275e = null;
    }

    public boolean d() {
        return !this.f24274d;
    }
}
