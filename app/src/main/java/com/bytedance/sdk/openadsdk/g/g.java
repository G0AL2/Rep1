package com.bytedance.sdk.openadsdk.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* compiled from: VolumeChangeObserver.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    private f f13250b;

    /* renamed from: c  reason: collision with root package name */
    private a f13251c;

    /* renamed from: d  reason: collision with root package name */
    private Context f13252d;

    /* renamed from: e  reason: collision with root package name */
    private AudioManager f13253e;

    /* renamed from: a  reason: collision with root package name */
    private int f13249a = -1;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13254f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13255g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f13256h = -1;

    /* compiled from: VolumeChangeObserver.java */
    /* loaded from: classes.dex */
    private static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<g> f13257a;

        public a(g gVar) {
            this.f13257a = new WeakReference<>(gVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f h10;
            int g10;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    l.b("VolumeChangeObserver", "Media volume change notification.......");
                    g gVar = this.f13257a.get();
                    if (gVar == null || (h10 = gVar.h()) == null || (g10 = gVar.g()) == gVar.a()) {
                        return;
                    }
                    gVar.a(g10);
                    if (g10 >= 0) {
                        h10.b(g10);
                    }
                }
            } catch (Throwable th) {
                l.a("VolumeChangeObserver", "onVolumeChangedError: ", th);
            }
        }
    }

    public g(Context context) {
        this.f13252d = context;
        this.f13253e = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int a() {
        return this.f13256h;
    }

    public int b() {
        return this.f13249a;
    }

    public boolean c() {
        if (this.f13255g) {
            this.f13255g = false;
            return true;
        }
        return false;
    }

    public int d() {
        try {
            AudioManager audioManager = this.f13253e;
            if (audioManager != null) {
                return audioManager.getStreamMaxVolume(3);
            }
            return 15;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "getMaxMusicVolumeError: ", th);
            return 15;
        }
    }

    public void e() {
        try {
            this.f13251c = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f13252d.registerReceiver(this.f13251c, intentFilter);
            this.f13254f = true;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "registerReceiverError: ", th);
        }
    }

    public void f() {
        if (this.f13254f) {
            try {
                this.f13252d.unregisterReceiver(this.f13251c);
                this.f13250b = null;
                this.f13254f = false;
            } catch (Throwable th) {
                l.a("VolumeChangeObserver", "unregisterReceiverError: ", th);
            }
        }
    }

    public int g() {
        try {
            AudioManager audioManager = this.f13253e;
            if (audioManager != null) {
                return audioManager.getStreamVolume(3);
            }
            return -1;
        } catch (Throwable th) {
            l.a("VolumeChangeObserver", "getCurrentMusicVolumeError: ", th);
            return -1;
        }
    }

    public f h() {
        return this.f13250b;
    }

    public void a(int i10) {
        this.f13256h = i10;
    }

    public void b(int i10) {
        this.f13249a = i10;
    }

    public void a(boolean z10) {
        a(z10, false);
    }

    public void a(boolean z10, boolean z11) {
        if (this.f13253e == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int g10 = g();
            if (g10 != 0) {
                this.f13249a = g10;
            }
            l.b("VolumeChangeObserver", "mute set volume to 0");
            this.f13253e.setStreamVolume(3, 0, 0);
            this.f13255g = true;
            return;
        }
        int i11 = this.f13249a;
        if (i11 == 0) {
            i11 = d() / 15;
        } else {
            if (i11 == -1) {
                if (!z11) {
                    return;
                }
                i11 = d() / 15;
            }
            l.b("VolumeChangeObserver", "not mute set volume to " + i11 + " mLastVolume=" + this.f13249a);
            this.f13249a = -1;
            this.f13253e.setStreamVolume(3, i11, i10);
            this.f13255g = true;
        }
        i10 = 1;
        l.b("VolumeChangeObserver", "not mute set volume to " + i11 + " mLastVolume=" + this.f13249a);
        this.f13249a = -1;
        this.f13253e.setStreamVolume(3, i11, i10);
        this.f13255g = true;
    }

    public void a(f fVar) {
        this.f13250b = fVar;
    }
}
