package l6;

import android.text.Spannable;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.text.p;
import com.facebook.react.views.text.y;
import com.facebook.yoga.n;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MountingManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final String f33710i = "c";

    /* renamed from: c  reason: collision with root package name */
    private d f33713c;

    /* renamed from: d  reason: collision with root package name */
    private d f33714d;

    /* renamed from: f  reason: collision with root package name */
    private final c1 f33716f;

    /* renamed from: g  reason: collision with root package name */
    private final b f33717g;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Integer, d> f33711a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<Integer> f33712b = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final v6.a f33715e = new v6.a();

    /* renamed from: h  reason: collision with root package name */
    private final RootViewManager f33718h = new RootViewManager();

    /* compiled from: MountingManager.java */
    /* loaded from: classes.dex */
    class a implements p {
        a(c cVar) {
        }

        @Override // com.facebook.react.views.text.p
        public void a(Spannable spannable) {
        }
    }

    /* compiled from: MountingManager.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Queue<m6.d> queue);
    }

    public c(c1 c1Var, b bVar) {
        this.f33716f = c1Var;
        this.f33717g = bVar;
    }

    public void a(int i10, View view, n0 n0Var) {
        d e10 = e(i10, "attachView");
        if (e10.C()) {
            ReactSoftExceptionLogger.logSoftException(f33710i, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            e10.n(view, n0Var);
        }
    }

    public void b() {
        this.f33715e.b();
    }

    public EventEmitterWrapper c(int i10, int i11) {
        d f10 = i10 == -1 ? f(i11) : d(i10);
        if (f10 == null) {
            return null;
        }
        return f10.u(i11);
    }

    public d d(int i10) {
        d dVar = this.f33714d;
        if (dVar != null && dVar.w() == i10) {
            return this.f33714d;
        }
        d dVar2 = this.f33713c;
        if (dVar2 != null && dVar2.w() == i10) {
            return this.f33713c;
        }
        d dVar3 = this.f33711a.get(Integer.valueOf(i10));
        this.f33714d = dVar3;
        return dVar3;
    }

    public d e(int i10, String str) {
        d d10 = d(i10);
        if (d10 != null) {
            return d10;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i10 + "]. Context: " + str);
    }

    public d f(int i10) {
        d dVar = this.f33713c;
        if (dVar != null && dVar.y(i10)) {
            return this.f33713c;
        }
        for (Map.Entry<Integer, d> entry : this.f33711a.entrySet()) {
            d value = entry.getValue();
            if (value != this.f33713c && value.y(i10)) {
                if (this.f33713c == null) {
                    this.f33713c = value;
                }
                return value;
            }
        }
        return null;
    }

    public d g(int i10) {
        d f10 = f(i10);
        if (f10 != null) {
            return f10;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i10 + "]");
    }

    public boolean h(int i10) {
        return f(i10) != null;
    }

    public void i(String str) {
        this.f33716f.a(str);
    }

    public boolean j(int i10) {
        d d10 = d(i10);
        if (d10 == null || d10.C()) {
            return false;
        }
        return !d10.B();
    }

    public long k(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, n nVar, float f11, n nVar2, float[] fArr) {
        return this.f33716f.a(str).measure(reactContext, readableMap, readableMap2, readableMap3, f10, nVar, f11, nVar2, fArr);
    }

    public long l(ReactContext reactContext, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f10, n nVar, float f11, n nVar2, float[] fArr) {
        return y.g(reactContext, readableMapBuffer, readableMapBuffer2, f10, nVar, f11, nVar2, new a(this), fArr);
    }

    @Deprecated
    public void m(int i10, int i11, int i12, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        e(i10, "receiveCommand:int").H(i11, i12, readableArray);
    }

    public void n(int i10, int i11, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        e(i10, "receiveCommand:string").I(i11, str, readableArray);
    }

    public void o(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (i10 == -1) {
            g(i11).K(i11, i12);
        } else {
            e(i10, "sendAccessibilityEvent").K(i11, i12);
        }
    }

    public d p(int i10, n0 n0Var, View view) {
        d dVar = new d(i10, this.f33715e, this.f33716f, this.f33718h, this.f33717g, n0Var);
        this.f33711a.putIfAbsent(Integer.valueOf(i10), dVar);
        if (this.f33711a.get(Integer.valueOf(i10)) != dVar) {
            String str = f33710i;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i10 + "]"));
        }
        this.f33713c = this.f33711a.get(Integer.valueOf(i10));
        if (view != null) {
            dVar.n(view, n0Var);
        }
        return dVar;
    }

    public void q(int i10) {
        d dVar = this.f33711a.get(Integer.valueOf(i10));
        if (dVar != null) {
            while (this.f33712b.size() >= 15) {
                Integer num = this.f33712b.get(0);
                this.f33711a.remove(Integer.valueOf(num.intValue()));
                this.f33712b.remove(num);
                z3.a.c(f33710i, "Removing stale SurfaceMountingManager: [%d]", Integer.valueOf(num.intValue()));
            }
            this.f33712b.add(Integer.valueOf(i10));
            dVar.M();
            if (dVar == this.f33713c) {
                this.f33713c = null;
                return;
            }
            return;
        }
        String str = f33710i;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i10 + "]"));
    }

    public boolean r(int i10) {
        if (this.f33712b.contains(Integer.valueOf(i10))) {
            return true;
        }
        d d10 = d(i10);
        return d10 != null && d10.C();
    }

    public void s(int i10, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        g(i10).R(i10, readableMap);
    }
}
