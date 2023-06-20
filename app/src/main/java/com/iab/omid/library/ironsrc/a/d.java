package com.iab.omid.library.ironsrc.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24247a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f24248b;

    /* renamed from: c  reason: collision with root package name */
    private final a f24249c;

    /* renamed from: d  reason: collision with root package name */
    private final c f24250d;

    /* renamed from: e  reason: collision with root package name */
    private float f24251e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24247a = context;
        this.f24248b = (AudioManager) context.getSystemService("audio");
        this.f24249c = aVar;
        this.f24250d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f24251e;
    }

    private float c() {
        return this.f24249c.a(this.f24248b.getStreamVolume(3), this.f24248b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24250d.a(this.f24251e);
    }

    public final void a() {
        this.f24251e = c();
        d();
        this.f24247a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f24247a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f24251e = c10;
            d();
        }
    }
}
