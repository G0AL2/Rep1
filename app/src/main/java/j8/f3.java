package j8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import j8.f3;

/* compiled from: StreamVolumeManager.java */
/* loaded from: classes2.dex */
public final class f3 {

    /* renamed from: a */
    private final Context f32413a;

    /* renamed from: b */
    private final Handler f32414b;

    /* renamed from: c */
    private final b f32415c;

    /* renamed from: d */
    private final AudioManager f32416d;

    /* renamed from: e */
    private c f32417e;

    /* renamed from: f */
    private int f32418f;

    /* renamed from: g */
    private int f32419g;

    /* renamed from: h */
    private boolean f32420h;

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes2.dex */
    public interface b {
        void d(int i10);

        void z(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes2.dex */
    public final class c extends BroadcastReceiver {
        private c() {
            f3.this = r1;
        }

        public static /* synthetic */ void a(f3 f3Var) {
            f3.b(f3Var);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = f3.this.f32414b;
            final f3 f3Var = f3.this;
            handler.post(new Runnable() { // from class: j8.g3
                @Override // java.lang.Runnable
                public final void run() {
                    f3.c.a(f3.this);
                }
            });
        }
    }

    public f3(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f32413a = applicationContext;
        this.f32414b = handler;
        this.f32415c = bVar;
        AudioManager audioManager = (AudioManager) ea.a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f32416d = audioManager;
        this.f32418f = 3;
        this.f32419g = f(audioManager, 3);
        this.f32420h = e(audioManager, this.f32418f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f32417e = cVar;
        } catch (RuntimeException e10) {
            ea.r.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static /* synthetic */ void b(f3 f3Var) {
        f3Var.i();
    }

    private static boolean e(AudioManager audioManager, int i10) {
        if (ea.n0.f29709a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            ea.r.i("StreamVolumeManager", sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public void i() {
        int f10 = f(this.f32416d, this.f32418f);
        boolean e10 = e(this.f32416d, this.f32418f);
        if (this.f32419g == f10 && this.f32420h == e10) {
            return;
        }
        this.f32419g = f10;
        this.f32420h = e10;
        this.f32415c.z(f10, e10);
    }

    public int c() {
        return this.f32416d.getStreamMaxVolume(this.f32418f);
    }

    public int d() {
        if (ea.n0.f29709a >= 28) {
            return this.f32416d.getStreamMinVolume(this.f32418f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f32417e;
        if (cVar != null) {
            try {
                this.f32413a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                ea.r.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f32417e = null;
        }
    }

    public void h(int i10) {
        if (this.f32418f == i10) {
            return;
        }
        this.f32418f = i10;
        i();
        this.f32415c.d(i10);
    }
}
