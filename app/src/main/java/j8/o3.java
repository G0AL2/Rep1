package j8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: WakeLockManager.java */
/* loaded from: classes2.dex */
final class o3 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f32667a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f32668b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32669c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32670d;

    public o3(Context context) {
        this.f32667a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f32668b;
        if (wakeLock == null) {
            return;
        }
        if (this.f32669c && this.f32670d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f32668b == null) {
            PowerManager powerManager = this.f32667a;
            if (powerManager == null) {
                ea.r.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f32668b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f32669c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f32670d = z10;
        c();
    }
}
