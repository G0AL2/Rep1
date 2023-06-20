package ob;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tb.w;

/* compiled from: FirebaseApp.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: k */
    private static final Object f35173k = new Object();

    /* renamed from: l */
    private static final Executor f35174l = new d();

    /* renamed from: m */
    static final Map<String, e> f35175m = new androidx.collection.a();

    /* renamed from: a */
    private final Context f35176a;

    /* renamed from: b */
    private final String f35177b;

    /* renamed from: c */
    private final m f35178c;

    /* renamed from: d */
    private final tb.n f35179d;

    /* renamed from: g */
    private final w<yc.a> f35182g;

    /* renamed from: h */
    private final sc.b<qc.g> f35183h;

    /* renamed from: e */
    private final AtomicBoolean f35180e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f35181f = new AtomicBoolean();

    /* renamed from: i */
    private final List<b> f35184i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<f> f35185j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: classes3.dex */
    public interface b {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes3.dex */
    public static class c implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<c> f35186a = new AtomicReference<>();

        private c() {
        }

        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f35186a.get() == null) {
                    c cVar = new c();
                    if (f35186a.compareAndSet(null, cVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z10) {
            synchronized (e.f35173k) {
                Iterator it = new ArrayList(e.f35175m.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f35180e.get()) {
                        eVar.B(z10);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    /* loaded from: classes3.dex */
    private static class d implements Executor {

        /* renamed from: a */
        private static final Handler f35187a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f35187a.post(runnable);
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* renamed from: ob.e$e */
    /* loaded from: classes3.dex */
    public static class C0467e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C0467e> f35188b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f35189a;

        public C0467e(Context context) {
            this.f35189a = context;
        }

        public static void b(Context context) {
            if (f35188b.get() == null) {
                C0467e c0467e = new C0467e(context);
                if (f35188b.compareAndSet(null, c0467e)) {
                    context.registerReceiver(c0467e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f35189a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f35173k) {
                for (e eVar : e.f35175m.values()) {
                    eVar.s();
                }
            }
            c();
        }
    }

    protected e(final Context context, String str, m mVar) {
        this.f35176a = (Context) Preconditions.checkNotNull(context);
        this.f35177b = Preconditions.checkNotEmpty(str);
        this.f35178c = (m) Preconditions.checkNotNull(mVar);
        tb.n e10 = tb.n.i(f35174l).d(tb.g.c(context, ComponentDiscoveryService.class).b()).c(new FirebaseCommonRegistrar()).b(tb.d.p(context, Context.class, new Class[0])).b(tb.d.p(this, e.class, new Class[0])).b(tb.d.p(mVar, m.class, new Class[0])).e();
        this.f35179d = e10;
        this.f35182g = new w<>(new sc.b() { // from class: ob.d
            @Override // sc.b
            public final Object get() {
                return e.b(e.this, context);
            }
        });
        this.f35183h = e10.d(qc.g.class);
        g(new b() { // from class: ob.c
            @Override // ob.e.b
            public final void onBackgroundStateChanged(boolean z10) {
                e.a(e.this, z10);
            }
        });
    }

    private static String A(String str) {
        return str.trim();
    }

    public void B(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (b bVar : this.f35184i) {
            bVar.onBackgroundStateChanged(z10);
        }
    }

    private void C() {
        for (f fVar : this.f35185j) {
            fVar.a(this.f35177b, this.f35178c);
        }
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        eVar.z(z10);
    }

    public static /* synthetic */ yc.a b(e eVar, Context context) {
        return eVar.y(context);
    }

    private void h() {
        Preconditions.checkState(!this.f35181f.get(), "FirebaseApp was deleted");
    }

    private static List<String> k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f35173k) {
            for (e eVar : f35175m.values()) {
                arrayList.add(eVar.p());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List<e> m(Context context) {
        ArrayList arrayList;
        synchronized (f35173k) {
            arrayList = new ArrayList(f35175m.values());
        }
        return arrayList;
    }

    public static e n() {
        e eVar;
        synchronized (f35173k) {
            eVar = f35175m.get("[DEFAULT]");
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e o(String str) {
        e eVar;
        List<String> k10;
        String str2;
        synchronized (f35173k) {
            eVar = f35175m.get(A(str));
            if (eVar != null) {
                eVar.f35183h.get().n();
            } else {
                if (k().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", k10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return eVar;
    }

    public void s() {
        if (!e0.k.a(this.f35176a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + p());
            C0467e.b(this.f35176a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + p());
        this.f35179d.l(x());
        this.f35183h.get().n();
    }

    public static e t(Context context) {
        synchronized (f35173k) {
            if (f35175m.containsKey("[DEFAULT]")) {
                return n();
            }
            m a10 = m.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return u(context, a10);
        }
    }

    public static e u(Context context, m mVar) {
        return v(context, mVar, "[DEFAULT]");
    }

    public static e v(Context context, m mVar, String str) {
        e eVar;
        c.b(context);
        String A = A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f35173k) {
            Map<String, e> map = f35175m;
            boolean z10 = !map.containsKey(A);
            Preconditions.checkState(z10, "FirebaseApp name " + A + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            eVar = new e(context, A, mVar);
            map.put(A, eVar);
        }
        eVar.s();
        return eVar;
    }

    public /* synthetic */ yc.a y(Context context) {
        return new yc.a(context, r(), (pc.c) this.f35179d.a(pc.c.class));
    }

    public /* synthetic */ void z(boolean z10) {
        if (z10) {
            return;
        }
        this.f35183h.get().n();
    }

    public void D(boolean z10) {
        h();
        if (this.f35180e.compareAndSet(!z10, z10)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z10 && isInBackground) {
                B(true);
            } else if (z10 || !isInBackground) {
            } else {
                B(false);
            }
        }
    }

    @KeepForSdk
    public void E(Boolean bool) {
        h();
        this.f35182g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void F(boolean z10) {
        E(Boolean.valueOf(z10));
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f35177b.equals(((e) obj).p());
        }
        return false;
    }

    @KeepForSdk
    public void g(b bVar) {
        h();
        if (this.f35180e.get() && BackgroundDetector.getInstance().isInBackground()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.f35184i.add(bVar);
    }

    public int hashCode() {
        return this.f35177b.hashCode();
    }

    public void i() {
        if (this.f35181f.compareAndSet(false, true)) {
            synchronized (f35173k) {
                f35175m.remove(this.f35177b);
            }
            C();
        }
    }

    @KeepForSdk
    public <T> T j(Class<T> cls) {
        h();
        return (T) this.f35179d.a(cls);
    }

    public Context l() {
        h();
        return this.f35176a;
    }

    public String p() {
        h();
        return this.f35177b;
    }

    public m q() {
        h();
        return this.f35178c;
    }

    @KeepForSdk
    public String r() {
        return Base64Utils.encodeUrlSafeNoPadding(p().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(q().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f35177b).add("options", this.f35178c).toString();
    }

    @KeepForSdk
    public boolean w() {
        h();
        return this.f35182g.get().b();
    }

    @KeepForSdk
    public boolean x() {
        return "[DEFAULT]".equals(p());
    }
}
