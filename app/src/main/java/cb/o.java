package cb;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o<T extends IInterface> {

    /* renamed from: l  reason: collision with root package name */
    private static final Map<String, Handler> f5446l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    private final Context f5447a;

    /* renamed from: b  reason: collision with root package name */
    private final e f5448b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5449c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5451e;

    /* renamed from: f  reason: collision with root package name */
    private final Intent f5452f;

    /* renamed from: g  reason: collision with root package name */
    private final k<T> f5453g;

    /* renamed from: j  reason: collision with root package name */
    private ServiceConnection f5456j;

    /* renamed from: k  reason: collision with root package name */
    private T f5457k;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f5450d = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final IBinder.DeathRecipient f5455i = new IBinder.DeathRecipient(this) { // from class: cb.g

        /* renamed from: a  reason: collision with root package name */
        private final o f5436a;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.f5436a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f5436a.k();
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final WeakReference<j> f5454h = new WeakReference<>(null);

    public o(Context context, e eVar, String str, Intent intent, k<T> kVar) {
        this.f5447a = context;
        this.f5448b = eVar;
        this.f5449c = str;
        this.f5452f = intent;
        this.f5453g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(o oVar, f fVar) {
        if (oVar.f5457k != null || oVar.f5451e) {
            if (!oVar.f5451e) {
                fVar.run();
                return;
            }
            oVar.f5448b.f("Waiting to bind to the service.", new Object[0]);
            oVar.f5450d.add(fVar);
            return;
        }
        oVar.f5448b.f("Initiate binding to the service.", new Object[0]);
        oVar.f5450d.add(fVar);
        n nVar = new n(oVar);
        oVar.f5456j = nVar;
        oVar.f5451e = true;
        if (oVar.f5447a.bindService(oVar.f5452f, nVar, 1)) {
            return;
        }
        oVar.f5448b.f("Failed to bind to the service.", new Object[0]);
        oVar.f5451e = false;
        List<f> list = oVar.f5450d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            gb.p<?> b10 = list.get(i10).b();
            if (b10 != null) {
                b10.d(new p());
            }
        }
        oVar.f5450d.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(f fVar) {
        Handler handler;
        Map<String, Handler> map = f5446l;
        synchronized (map) {
            if (!map.containsKey(this.f5449c)) {
                HandlerThread handlerThread = new HandlerThread(this.f5449c, 10);
                handlerThread.start();
                map.put(this.f5449c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f5449c);
        }
        handler.post(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void n(o oVar) {
        oVar.f5448b.f("linkToDeath", new Object[0]);
        try {
            oVar.f5457k.asBinder().linkToDeath(oVar.f5455i, 0);
        } catch (RemoteException e10) {
            oVar.f5448b.d(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void p(o oVar) {
        oVar.f5448b.f("unlinkToDeath", new Object[0]);
        oVar.f5457k.asBinder().unlinkToDeath(oVar.f5455i, 0);
    }

    public final void b() {
        h(new i(this));
    }

    public final void c(f fVar) {
        h(new h(this, fVar.b(), fVar));
    }

    public final T f() {
        return this.f5457k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void k() {
        this.f5448b.f("reportBinderDeath", new Object[0]);
        j jVar = this.f5454h.get();
        if (jVar != null) {
            this.f5448b.f("calling onBinderDied", new Object[0]);
            jVar.a();
            return;
        }
        this.f5448b.f("%s : Binder has died.", this.f5449c);
        List<f> list = this.f5450d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            gb.p<?> b10 = list.get(i10).b();
            if (b10 != null) {
                b10.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f5449c).concat(" : Binder has died.")));
            }
        }
        this.f5450d.clear();
    }
}
