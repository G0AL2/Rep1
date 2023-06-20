package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.k;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: MultiInstanceInvalidationService.kt */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private int f3828a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f3829b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final RemoteCallbackList<j> f3830c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final k.a f3831d = new a();

    /* compiled from: MultiInstanceInvalidationService.kt */
    /* loaded from: classes.dex */
    public static final class a extends k.a {
        a() {
        }

        @Override // androidx.room.k
        public int D(j jVar, String str) {
            qe.k.f(jVar, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                int c10 = multiInstanceInvalidationService.c();
                if (multiInstanceInvalidationService.a().register(jVar, Integer.valueOf(c10))) {
                    multiInstanceInvalidationService.b().put(Integer.valueOf(c10), str);
                    i10 = c10;
                } else {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                    multiInstanceInvalidationService.c();
                }
            }
            return i10;
        }

        @Override // androidx.room.k
        public void V(j jVar, int i10) {
            qe.k.f(jVar, "callback");
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                multiInstanceInvalidationService.a().unregister(jVar);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.k
        public void k(int i10, String[] strArr) {
            qe.k.f(strArr, "tables");
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                    qe.k.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = multiInstanceInvalidationService.b().get(Integer.valueOf(intValue));
                    if (i10 != intValue && qe.k.a(str, str2)) {
                        try {
                            multiInstanceInvalidationService.a().getBroadcastItem(i11).d(strArr);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                ee.u uVar = ee.u.f29813a;
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<j> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(j jVar, Object obj) {
            qe.k.f(jVar, "callback");
            qe.k.f(obj, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) obj);
        }
    }

    public final RemoteCallbackList<j> a() {
        return this.f3830c;
    }

    public final Map<Integer, String> b() {
        return this.f3829b;
    }

    public final int c() {
        return this.f3828a;
    }

    public final void d(int i10) {
        this.f3828a = i10;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        qe.k.f(intent, "intent");
        return this.f3831d;
    }
}
