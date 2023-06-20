package z6;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

/* compiled from: LayoutAnimationController.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static Handler f40077h;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40082e;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f40084g;

    /* renamed from: a  reason: collision with root package name */
    private final z6.a f40078a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final z6.a f40079b = new k();

    /* renamed from: c  reason: collision with root package name */
    private final z6.a f40080c = new i();

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<j> f40081d = new SparseArray<>(0);

    /* renamed from: f  reason: collision with root package name */
    private long f40083f = -1;

    /* compiled from: LayoutAnimationController.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f40085a;

        a(e eVar, Callback callback) {
            this.f40085a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f40085a.invoke(Boolean.TRUE);
        }
    }

    /* compiled from: LayoutAnimationController.java */
    /* loaded from: classes.dex */
    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f40086a;

        b(int i10) {
            this.f40086a = i10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            e.this.f40081d.remove(this.f40086a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e.this.f40081d.put(this.f40086a, (j) animation);
        }
    }

    /* compiled from: LayoutAnimationController.java */
    /* loaded from: classes.dex */
    class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f40088a;

        c(e eVar, f fVar) {
            this.f40088a = fVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f40088a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void d(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                d(viewGroup.getChildAt(i10));
            }
        }
    }

    private void g(long j10) {
        if (f40077h == null) {
            f40077h = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.f40084g;
        if (runnable != null) {
            f40077h.removeCallbacks(runnable);
            f40077h.postDelayed(this.f40084g, j10);
        }
    }

    public void b(View view, int i10, int i11, int i12, int i13) {
        z6.a aVar;
        UiThreadUtil.assertOnUiThread();
        int id2 = view.getId();
        j jVar = this.f40081d.get(id2);
        if (jVar != null) {
            jVar.a(i10, i11, i12, i13);
            return;
        }
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            aVar = this.f40079b;
        } else {
            aVar = this.f40078a;
        }
        Animation a10 = aVar.a(view, i10, i11, i12, i13);
        if (a10 instanceof j) {
            a10.setAnimationListener(new b(id2));
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
        }
        if (a10 != null) {
            long duration = a10.getDuration();
            if (duration > this.f40083f) {
                this.f40083f = duration;
                g(duration);
            }
            view.startAnimation(a10);
        }
    }

    public void c(View view, f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation a10 = this.f40080c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a10 != null) {
            d(view);
            a10.setAnimationListener(new c(this, fVar));
            long duration = a10.getDuration();
            if (duration > this.f40083f) {
                g(duration);
                this.f40083f = duration;
            }
            view.startAnimation(a10);
            return;
        }
        fVar.a();
    }

    public void e(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            f();
            return;
        }
        this.f40082e = false;
        int i10 = readableMap.hasKey("duration") ? readableMap.getInt("duration") : 0;
        g gVar = g.CREATE;
        if (readableMap.hasKey(g.a(gVar))) {
            this.f40078a.d(readableMap.getMap(g.a(gVar)), i10);
            this.f40082e = true;
        }
        g gVar2 = g.UPDATE;
        if (readableMap.hasKey(g.a(gVar2))) {
            this.f40079b.d(readableMap.getMap(g.a(gVar2)), i10);
            this.f40082e = true;
        }
        g gVar3 = g.DELETE;
        if (readableMap.hasKey(g.a(gVar3))) {
            this.f40080c.d(readableMap.getMap(g.a(gVar3)), i10);
            this.f40082e = true;
        }
        if (!this.f40082e || callback == null) {
            return;
        }
        this.f40084g = new a(this, callback);
    }

    public void f() {
        this.f40078a.f();
        this.f40079b.f();
        this.f40080c.f();
        this.f40084g = null;
        this.f40082e = false;
        this.f40083f = -1L;
    }

    public boolean h(View view) {
        if (view == null) {
            return false;
        }
        return (this.f40082e && view.getParent() != null) || this.f40081d.get(view.getId()) != null;
    }
}
