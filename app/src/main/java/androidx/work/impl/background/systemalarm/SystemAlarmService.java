package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.s;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.l;
import p1.u;

/* loaded from: classes.dex */
public class SystemAlarmService extends s implements g.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f4482d = l.i("SystemAlarmService");

    /* renamed from: b  reason: collision with root package name */
    private g f4483b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4484c;

    private void e() {
        g gVar = new g(this);
        this.f4483b = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void b() {
        this.f4484c = true;
        l.e().a(f4482d, "All commands completed in dispatcher");
        u.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f4484c = false;
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4484c = true;
        this.f4483b.j();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4484c) {
            l.e().f(f4482d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f4483b.j();
            e();
            this.f4484c = false;
        }
        if (intent != null) {
            this.f4483b.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
