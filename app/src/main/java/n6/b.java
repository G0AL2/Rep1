package n6;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HeadlessJsTaskContext.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    private static final WeakHashMap<ReactContext, b> f34651g = new WeakHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<ReactContext> f34652a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<n6.c> f34653b = new CopyOnWriteArraySet();

    /* renamed from: c  reason: collision with root package name */
    private final Handler f34654c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Integer> f34655d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, n6.a> f34656e;

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<Runnable> f34657f;

    /* compiled from: HeadlessJsTaskContext.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n6.a f34658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f34659b;

        a(n6.a aVar, int i10) {
            this.f34658a = aVar;
            this.f34659b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l(this.f34658a, this.f34659b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeadlessJsTaskContext.java */
    /* renamed from: n6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0457b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34661a;

        RunnableC0457b(int i10) {
            this.f34661a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (n6.c cVar : b.this.f34653b) {
                cVar.onHeadlessJsTaskFinish(this.f34661a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeadlessJsTaskContext.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34663a;

        c(int i10) {
            this.f34663a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.f34663a);
        }
    }

    private b(ReactContext reactContext) {
        new AtomicInteger(0);
        this.f34654c = new Handler();
        this.f34655d = new CopyOnWriteArraySet();
        this.f34656e = new ConcurrentHashMap();
        this.f34657f = new SparseArray<>();
        this.f34652a = new WeakReference<>(reactContext);
    }

    public static b e(ReactContext reactContext) {
        WeakHashMap<ReactContext, b> weakHashMap = f34651g;
        b bVar = weakHashMap.get(reactContext);
        if (bVar == null) {
            b bVar2 = new b(reactContext);
            weakHashMap.put(reactContext, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private void i(int i10) {
        Runnable runnable = this.f34657f.get(i10);
        if (runnable != null) {
            this.f34654c.removeCallbacks(runnable);
            this.f34657f.remove(i10);
        }
    }

    private void k(int i10, long j10) {
        c cVar = new c(i10);
        this.f34657f.append(i10, cVar);
        this.f34654c.postDelayed(cVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l(n6.a aVar, int i10) {
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) f6.a.d(this.f34652a.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED && !aVar.e()) {
            throw new IllegalStateException("Tried to start task " + aVar.c() + " while in foreground, but this is not allowed.");
        }
        this.f34655d.add(Integer.valueOf(i10));
        this.f34656e.put(Integer.valueOf(i10), new n6.a(aVar));
        if (reactContext.hasActiveReactInstance()) {
            ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(i10, aVar.c(), aVar.a());
        } else {
            ReactSoftExceptionLogger.logSoftException("HeadlessJsTaskContext", new RuntimeException("Cannot start headless task, CatalystInstance not available"));
        }
        if (aVar.d() > 0) {
            k(i10, aVar.d());
        }
        for (n6.c cVar : this.f34653b) {
            cVar.onHeadlessJsTaskStart(i10);
        }
    }

    public void c(n6.c cVar) {
        this.f34653b.add(cVar);
    }

    public synchronized void d(int i10) {
        boolean remove = this.f34655d.remove(Integer.valueOf(i10));
        f6.a.b(remove, "Tried to finish non-existent task with id " + i10 + ".");
        boolean z10 = this.f34656e.remove(Integer.valueOf(i10)) != null;
        f6.a.b(z10, "Tried to remove non-existent task config with id " + i10 + ".");
        i(i10);
        UiThreadUtil.runOnUiThread(new RunnableC0457b(i10));
    }

    public boolean f() {
        return this.f34655d.size() > 0;
    }

    public synchronized boolean g(int i10) {
        return this.f34655d.contains(Integer.valueOf(i10));
    }

    public void h(n6.c cVar) {
        this.f34653b.remove(cVar);
    }

    public synchronized boolean j(int i10) {
        n6.a aVar = this.f34656e.get(Integer.valueOf(i10));
        boolean z10 = aVar != null;
        f6.a.b(z10, "Tried to retrieve non-existent task config with id " + i10 + ".");
        d b10 = aVar.b();
        if (b10.a()) {
            i(i10);
            UiThreadUtil.runOnUiThread(new a(new n6.a(aVar.c(), aVar.a(), aVar.d(), aVar.e(), b10.c()), i10), b10.b());
            return true;
        }
        return false;
    }
}
