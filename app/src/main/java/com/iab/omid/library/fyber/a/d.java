package com.iab.omid.library.fyber.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f24017a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f24018b;

    /* renamed from: c  reason: collision with root package name */
    private final a f24019c;

    /* renamed from: d  reason: collision with root package name */
    private final c f24020d;

    /* renamed from: e  reason: collision with root package name */
    private float f24021e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24017a = context;
        this.f24018b = (AudioManager) context.getSystemService("audio");
        this.f24019c = aVar;
        this.f24020d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f24021e;
    }

    private float c() {
        return this.f24019c.a(this.f24018b.getStreamVolume(3), this.f24018b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24020d.a(this.f24021e);
    }

    public void a() {
        this.f24021e = c();
        d();
        this.f24017a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f24017a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f24021e = c10;
            d();
        }
    }
}
