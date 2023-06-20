package com.iab.omid.library.inmobi.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24134a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f24135b;

    /* renamed from: c  reason: collision with root package name */
    private final a f24136c;

    /* renamed from: d  reason: collision with root package name */
    private final c f24137d;

    /* renamed from: e  reason: collision with root package name */
    private float f24138e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24134a = context;
        this.f24135b = (AudioManager) context.getSystemService("audio");
        this.f24136c = aVar;
        this.f24137d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f24138e;
    }

    private float c() {
        return this.f24136c.a(this.f24135b.getStreamVolume(3), this.f24135b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24137d.a(this.f24138e);
    }

    public void a() {
        this.f24138e = c();
        d();
        this.f24134a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f24134a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f24138e = c10;
            d();
        }
    }
}
