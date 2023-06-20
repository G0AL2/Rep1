package j8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32267a;

    /* renamed from: b  reason: collision with root package name */
    private final a f32268b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32269c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes2.dex */
    private final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0414b f32270a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f32271b;

        public a(Handler handler, InterfaceC0414b interfaceC0414b) {
            this.f32271b = handler;
            this.f32270a = interfaceC0414b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f32271b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f32269c) {
                this.f32270a.h();
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* renamed from: j8.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0414b {
        void h();
    }

    public b(Context context, Handler handler, InterfaceC0414b interfaceC0414b) {
        this.f32267a = context.getApplicationContext();
        this.f32268b = new a(handler, interfaceC0414b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f32269c) {
            this.f32267a.registerReceiver(this.f32268b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f32269c = true;
        } else if (z10 || !this.f32269c) {
        } else {
            this.f32267a.unregisterReceiver(this.f32268b);
            this.f32269c = false;
        }
    }
}
