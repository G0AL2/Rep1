package com.iab.omid.library.applovin.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23899a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f23900b;

    /* renamed from: c  reason: collision with root package name */
    private final a f23901c;

    /* renamed from: d  reason: collision with root package name */
    private final c f23902d;

    /* renamed from: e  reason: collision with root package name */
    private float f23903e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23899a = context;
        this.f23900b = (AudioManager) context.getSystemService("audio");
        this.f23901c = aVar;
        this.f23902d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f23903e;
    }

    private float c() {
        return this.f23901c.a(this.f23900b.getStreamVolume(3), this.f23900b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f23902d.a(this.f23903e);
    }

    public void a() {
        this.f23903e = c();
        d();
        this.f23899a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.f23899a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float c10 = c();
        if (a(c10)) {
            this.f23903e = c10;
            d();
        }
    }
}
