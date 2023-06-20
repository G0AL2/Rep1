package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: MraidMediaProcessor.java */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public final class db {

    /* renamed from: f  reason: collision with root package name */
    private static final String f25071f = "db";

    /* renamed from: a  reason: collision with root package name */
    public q f25072a;

    /* renamed from: b  reason: collision with root package name */
    public cy f25073b;

    /* renamed from: c  reason: collision with root package name */
    public b f25074c;

    /* renamed from: d  reason: collision with root package name */
    public c f25075d;

    /* renamed from: e  reason: collision with root package name */
    public a f25076e;

    /* compiled from: MraidMediaProcessor.java */
    /* loaded from: classes3.dex */
    public final class a extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private String f25081b;

        public a(String str) {
            this.f25081b = str;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("state", 0);
            String unused = db.f25071f;
            db.b(db.this, this.f25081b, 1 == intExtra);
        }
    }

    /* compiled from: MraidMediaProcessor.java */
    /* loaded from: classes3.dex */
    public final class b extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        private String f25083b;

        public b(String str) {
            this.f25083b = str;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            String unused = db.f25071f;
            db.a(db.this, this.f25083b, 2 != intExtra);
        }
    }

    /* compiled from: MraidMediaProcessor.java */
    /* loaded from: classes3.dex */
    public final class c extends ContentObserver {

        /* renamed from: b  reason: collision with root package name */
        private Context f25085b;

        /* renamed from: c  reason: collision with root package name */
        private int f25086c;

        /* renamed from: d  reason: collision with root package name */
        private String f25087d;

        public c(String str, Context context, Handler handler) {
            super(handler);
            this.f25087d = str;
            this.f25085b = context;
            this.f25086c = -1;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            AudioManager audioManager;
            super.onChange(z10);
            Context context = this.f25085b;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                return;
            }
            try {
                int streamVolume = audioManager.getStreamVolume(3);
                if (streamVolume != this.f25086c) {
                    this.f25086c = streamVolume;
                    db.a(db.this, this.f25087d, streamVolume);
                }
            } catch (Exception unused) {
                String unused2 = db.f25071f;
            }
        }
    }

    public db(q qVar) {
        this.f25072a = qVar;
    }

    public static boolean d() {
        AudioManager audioManager;
        Context c10 = ho.c();
        return (c10 == null || (audioManager = (AudioManager) c10.getSystemService("audio")) == null || !audioManager.isWiredHeadsetOn()) ? false : true;
    }

    public final void b() {
        b bVar;
        Context c10 = ho.c();
        if (c10 == null || (bVar = this.f25074c) == null) {
            return;
        }
        c10.unregisterReceiver(bVar);
        this.f25074c = null;
    }

    public final void c() {
        Context c10 = ho.c();
        if (c10 == null || this.f25075d == null) {
            return;
        }
        c10.getContentResolver().unregisterContentObserver(this.f25075d);
        this.f25075d = null;
    }

    public final void e() {
        a aVar;
        Context c10 = ho.c();
        if (c10 == null || (aVar = this.f25076e) == null) {
            return;
        }
        c10.unregisterReceiver(aVar);
        this.f25076e = null;
    }

    public static boolean a() {
        AudioManager audioManager;
        Context c10 = ho.c();
        return (c10 == null || (audioManager = (AudioManager) c10.getSystemService("audio")) == null || 2 == audioManager.getRingerMode()) ? false : true;
    }

    static /* synthetic */ void a(db dbVar, String str, boolean z10) {
        q qVar = dbVar.f25072a;
        if (qVar != null) {
            qVar.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    static /* synthetic */ void b(db dbVar, String str, boolean z10) {
        q qVar = dbVar.f25072a;
        if (qVar != null) {
            qVar.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }

    static /* synthetic */ void a(db dbVar, String str, int i10) {
        q qVar = dbVar.f25072a;
        if (qVar != null) {
            qVar.a(str, "fireDeviceVolumeChangeEvent(" + i10 + ");");
        }
    }
}
