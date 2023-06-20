package cb;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class n implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f5445a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(o oVar) {
        this.f5445a = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e eVar;
        eVar = this.f5445a.f5448b;
        eVar.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f5445a.h(new l(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar;
        eVar = this.f5445a.f5448b;
        eVar.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f5445a.h(new m(this));
    }
}
