package t2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: AudioBecomingNoisyReceiver.java */
/* loaded from: classes.dex */
public class a extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37088a;

    /* renamed from: b  reason: collision with root package name */
    private b f37089b = b.f37090e0;

    public a(Context context) {
        this.f37088a = context.getApplicationContext();
    }

    public void a() {
        this.f37089b = b.f37090e0;
        try {
            this.f37088a.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }

    public void b(b bVar) {
        this.f37089b = bVar;
        this.f37088a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f37089b.h();
        }
    }
}
