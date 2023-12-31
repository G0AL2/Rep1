package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class s extends Service implements p {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f3404a = new d0(this);

    @Override // androidx.lifecycle.p
    public i getLifecycle() {
        return this.f3404a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f3404a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f3404a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f3404a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f3404a.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
