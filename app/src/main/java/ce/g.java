package ce;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: ReactNativeFirebaseEventEmitter.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: g */
    private static g f5489g = new g();

    /* renamed from: d */
    private ReactContext f5493d;

    /* renamed from: f */
    private int f5495f;

    /* renamed from: a */
    private final List<de.a> f5490a = new ArrayList();

    /* renamed from: b */
    private final Handler f5491b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final HashMap<String, Integer> f5492c = new HashMap<>();

    /* renamed from: e */
    private Boolean f5494e = Boolean.FALSE;

    public static /* synthetic */ void a(g gVar, ReactContext reactContext) {
        gVar.j(reactContext);
    }

    public static /* synthetic */ void b(g gVar, de.a aVar) {
        gVar.l(aVar);
    }

    public static /* synthetic */ void c(g gVar) {
        gVar.p();
    }

    public static /* synthetic */ void d(g gVar, Boolean bool) {
        gVar.k(bool);
    }

    private boolean g(de.a aVar) {
        ReactContext reactContext;
        if (this.f5494e.booleanValue() && (reactContext = this.f5493d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f5493d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.b(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.b(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f5489g;
    }

    public /* synthetic */ void j(ReactContext reactContext) {
        this.f5493d = reactContext;
        p();
    }

    public /* synthetic */ void k(Boolean bool) {
        this.f5494e = bool;
        p();
    }

    public /* synthetic */ void l(de.a aVar) {
        synchronized (this.f5492c) {
            if (!this.f5492c.containsKey(aVar.b()) || !g(aVar)) {
                this.f5490a.add(aVar);
            }
        }
    }

    public void p() {
        synchronized (this.f5492c) {
            Iterator it = new ArrayList(this.f5490a).iterator();
            while (it.hasNext()) {
                de.a aVar = (de.a) it.next();
                if (this.f5492c.containsKey(aVar.b())) {
                    this.f5490a.remove(aVar);
                    o(aVar);
                }
            }
        }
    }

    public void e(String str) {
        synchronized (this.f5492c) {
            this.f5495f++;
            if (!this.f5492c.containsKey(str)) {
                this.f5492c.put(str, 1);
            } else {
                this.f5492c.put(str, Integer.valueOf(this.f5492c.get(str).intValue() + 1));
            }
        }
        this.f5491b.post(new Runnable() { // from class: ce.c
            @Override // java.lang.Runnable
            public final void run() {
                g.c(g.this);
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f5491b.post(new Runnable() { // from class: ce.d
            @Override // java.lang.Runnable
            public final void run() {
                g.a(g.this, reactContext);
            }
        });
    }

    public WritableMap h() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("listeners", this.f5495f);
        createMap.putInt("queued", this.f5490a.size());
        synchronized (this.f5492c) {
            for (Map.Entry<String, Integer> entry : this.f5492c.entrySet()) {
                createMap2.putInt(entry.getKey(), entry.getValue().intValue());
            }
        }
        createMap.putMap("events", createMap2);
        return createMap;
    }

    public void m(final Boolean bool) {
        this.f5491b.post(new Runnable() { // from class: ce.f
            @Override // java.lang.Runnable
            public final void run() {
                g.d(g.this, bool);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(java.lang.String r6, java.lang.Boolean r7) {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.f5492c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f5492c     // Catch: java.lang.Throwable -> L41
            boolean r1 = r1.containsKey(r6)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L3f
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r5.f5492c     // Catch: java.lang.Throwable -> L41
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L41
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L41
            r2 = 1
            if (r1 <= r2) goto L2d
            boolean r3 = r7.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L21
            goto L2d
        L21:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f5492c     // Catch: java.lang.Throwable -> L41
            int r4 = r1 + (-1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L41
            goto L32
        L2d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f5492c     // Catch: java.lang.Throwable -> L41
            r3.remove(r6)     // Catch: java.lang.Throwable -> L41
        L32:
            int r6 = r5.f5495f     // Catch: java.lang.Throwable -> L41
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 1
        L3c:
            int r6 = r6 - r1
            r5.f5495f = r6     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L41:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.g.n(java.lang.String, java.lang.Boolean):void");
    }

    public void o(final de.a aVar) {
        this.f5491b.post(new Runnable() { // from class: ce.e
            @Override // java.lang.Runnable
            public final void run() {
                g.b(g.this, aVar);
            }
        });
    }
}
