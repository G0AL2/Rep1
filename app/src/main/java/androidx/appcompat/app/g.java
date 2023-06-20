package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.z0;
import androidx.core.view.f;
import androidx.core.view.g0;
import androidx.core.view.i0;
import androidx.core.view.z;
import androidx.lifecycle.i;
import com.google.android.gms.ads.AdRequest;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i.b;
import i.f;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import y.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class g extends androidx.appcompat.app.f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: h0  reason: collision with root package name */
    private static final androidx.collection.g<String, Integer> f829h0 = new androidx.collection.g<>();

    /* renamed from: i0  reason: collision with root package name */
    private static final boolean f830i0;

    /* renamed from: j0  reason: collision with root package name */
    private static final int[] f831j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final boolean f832k0;

    /* renamed from: l0  reason: collision with root package name */
    private static final boolean f833l0;

    /* renamed from: m0  reason: collision with root package name */
    private static boolean f834m0;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private v[] G;
    private v H;
    private boolean I;
    private boolean J;
    private boolean K;
    boolean L;
    private Configuration M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private r R;
    private r S;
    boolean T;
    int U;
    private final Runnable V;
    private boolean W;
    private Rect X;
    private Rect Y;
    private androidx.appcompat.app.i Z;

    /* renamed from: d  reason: collision with root package name */
    final Object f835d;

    /* renamed from: e  reason: collision with root package name */
    final Context f836e;

    /* renamed from: f  reason: collision with root package name */
    Window f837f;

    /* renamed from: g  reason: collision with root package name */
    private p f838g;

    /* renamed from: g0  reason: collision with root package name */
    private androidx.appcompat.app.j f839g0;

    /* renamed from: h  reason: collision with root package name */
    final androidx.appcompat.app.e f840h;

    /* renamed from: i  reason: collision with root package name */
    androidx.appcompat.app.a f841i;

    /* renamed from: j  reason: collision with root package name */
    MenuInflater f842j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f843k;

    /* renamed from: l  reason: collision with root package name */
    private e0 f844l;

    /* renamed from: m  reason: collision with root package name */
    private j f845m;

    /* renamed from: n  reason: collision with root package name */
    private w f846n;

    /* renamed from: o  reason: collision with root package name */
    i.b f847o;

    /* renamed from: p  reason: collision with root package name */
    ActionBarContextView f848p;

    /* renamed from: q  reason: collision with root package name */
    PopupWindow f849q;

    /* renamed from: r  reason: collision with root package name */
    Runnable f850r;

    /* renamed from: s  reason: collision with root package name */
    androidx.core.view.e0 f851s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f852t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f853u;

    /* renamed from: v  reason: collision with root package name */
    ViewGroup f854v;

    /* renamed from: w  reason: collision with root package name */
    private TextView f855w;

    /* renamed from: x  reason: collision with root package name */
    private View f856x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f857y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f858z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f859a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f859a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f859a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f859a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.U & 1) != 0) {
                gVar.Z(0);
            }
            g gVar2 = g.this;
            if ((gVar2.U & 4096) != 0) {
                gVar2.Z(108);
            }
            g gVar3 = g.this;
            gVar3.T = false;
            gVar3.U = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class c implements androidx.core.view.s {
        c() {
        }

        @Override // androidx.core.view.s
        public i0 a(View view, i0 i0Var) {
            int k10 = i0Var.k();
            int P0 = g.this.P0(i0Var, null);
            if (k10 != P0) {
                i0Var = i0Var.o(i0Var.i(), P0, i0Var.j(), i0Var.h());
            }
            return z.c0(view, i0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements i0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.i0.a
        public void a(Rect rect) {
            rect.top = g.this.P0(null, rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends g0 {
            a() {
            }

            @Override // androidx.core.view.f0
            public void b(View view) {
                g.this.f848p.setAlpha(1.0f);
                g.this.f851s.f(null);
                g.this.f851s = null;
            }

            @Override // androidx.core.view.g0, androidx.core.view.f0
            public void c(View view) {
                g.this.f848p.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f849q.showAtLocation(gVar.f848p, 55, 0, 0);
            g.this.a0();
            if (g.this.I0()) {
                g.this.f848p.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f851s = z.d(gVar2.f848p).a(1.0f);
                g.this.f851s.f(new a());
                return;
            }
            g.this.f848p.setAlpha(1.0f);
            g.this.f848p.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0034g extends g0 {
        C0034g() {
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            g.this.f848p.setAlpha(1.0f);
            g.this.f851s.f(null);
            g.this.f851s = null;
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            g.this.f848p.setVisibility(0);
            if (g.this.f848p.getParent() instanceof View) {
                z.n0((View) g.this.f848p.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private class h implements androidx.appcompat.app.b {
        h(g gVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public interface i {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class j implements j.a {
        j() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            g.this.Q(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback k02 = g.this.k0();
            if (k02 != null) {
                k02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class k implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f868a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        class a extends g0 {
            a() {
            }

            @Override // androidx.core.view.f0
            public void b(View view) {
                g.this.f848p.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f849q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f848p.getParent() instanceof View) {
                    z.n0((View) g.this.f848p.getParent());
                }
                g.this.f848p.k();
                g.this.f851s.f(null);
                g gVar2 = g.this;
                gVar2.f851s = null;
                z.n0(gVar2.f854v);
            }
        }

        public k(b.a aVar) {
            this.f868a = aVar;
        }

        @Override // i.b.a
        public boolean a(i.b bVar, MenuItem menuItem) {
            return this.f868a.a(bVar, menuItem);
        }

        @Override // i.b.a
        public void b(i.b bVar) {
            this.f868a.b(bVar);
            g gVar = g.this;
            if (gVar.f849q != null) {
                gVar.f837f.getDecorView().removeCallbacks(g.this.f850r);
            }
            g gVar2 = g.this;
            if (gVar2.f848p != null) {
                gVar2.a0();
                g gVar3 = g.this;
                gVar3.f851s = z.d(gVar3.f848p).a(0.0f);
                g.this.f851s.f(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.e eVar = gVar4.f840h;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(gVar4.f847o);
            }
            g gVar5 = g.this;
            gVar5.f847o = null;
            z.n0(gVar5.f854v);
        }

        @Override // i.b.a
        public boolean c(i.b bVar, Menu menu) {
            z.n0(g.this.f854v);
            return this.f868a.c(bVar, menu);
        }

        @Override // i.b.a
        public boolean d(i.b bVar, Menu menu) {
            return this.f868a.d(bVar, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class l {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    static class m {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class n {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class o {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class q extends r {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f873c;

        q(Context context) {
            super();
            this.f873c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.r
        IntentFilter b() {
            if (Build.VERSION.SDK_INT >= 21) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            }
            return null;
        }

        @Override // androidx.appcompat.app.g.r
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !m.a(this.f873c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.g.r
        public void d() {
            g.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class r {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f875a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                r.this.d();
            }
        }

        r() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f875a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f836e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f875a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b10 = b();
            if (b10 == null || b10.countActions() == 0) {
                return;
            }
            if (this.f875a == null) {
                this.f875a = new a();
            }
            g.this.f836e.registerReceiver(this.f875a, b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class s extends r {

        /* renamed from: c  reason: collision with root package name */
        private final androidx.appcompat.app.n f878c;

        s(androidx.appcompat.app.n nVar) {
            super();
            this.f878c = nVar;
        }

        @Override // androidx.appcompat.app.g.r
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.r
        public int c() {
            return this.f878c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.r
        public void d() {
            g.this.e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    private static class t {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class u extends ContentFrameLayout {
        public u(Context context) {
            super(context);
        }

        private boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                g.this.S(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(e.a.b(getContext(), i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        int f881a;

        /* renamed from: b  reason: collision with root package name */
        int f882b;

        /* renamed from: c  reason: collision with root package name */
        int f883c;

        /* renamed from: d  reason: collision with root package name */
        int f884d;

        /* renamed from: e  reason: collision with root package name */
        int f885e;

        /* renamed from: f  reason: collision with root package name */
        int f886f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f887g;

        /* renamed from: h  reason: collision with root package name */
        View f888h;

        /* renamed from: i  reason: collision with root package name */
        View f889i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.e f890j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.c f891k;

        /* renamed from: l  reason: collision with root package name */
        Context f892l;

        /* renamed from: m  reason: collision with root package name */
        boolean f893m;

        /* renamed from: n  reason: collision with root package name */
        boolean f894n;

        /* renamed from: o  reason: collision with root package name */
        boolean f895o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f896p;

        /* renamed from: q  reason: collision with root package name */
        boolean f897q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f898r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f899s;

        v(int i10) {
            this.f881a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f890j == null) {
                return null;
            }
            if (this.f891k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f892l, d.g.f28766j);
                this.f891k = cVar;
                cVar.d(aVar);
                this.f890j.b(this.f891k);
            }
            return this.f891k.j(this.f887g);
        }

        public boolean b() {
            if (this.f888h == null) {
                return false;
            }
            return this.f889i != null || this.f891k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f890j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f891k);
            }
            this.f890j = eVar;
            if (eVar == null || (cVar = this.f891k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(d.a.f28655a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(d.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(d.i.f28792b, true);
            }
            i.d dVar = new i.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f892l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(d.j.f28901v0);
            this.f882b = obtainStyledAttributes.getResourceId(d.j.f28916y0, 0);
            this.f886f = obtainStyledAttributes.getResourceId(d.j.f28911x0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class w implements j.a {
        w() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            g gVar = g.this;
            if (z11) {
                eVar = D;
            }
            v d02 = gVar.d0(eVar);
            if (d02 != null) {
                if (z11) {
                    g.this.P(d02.f881a, d02, D);
                    g.this.T(d02, true);
                    return;
                }
                g.this.T(d02, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback k02;
            if (eVar == eVar.D()) {
                g gVar = g.this;
                if (!gVar.A || (k02 = gVar.k0()) == null || g.this.L) {
                    return true;
                }
                k02.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 < 21;
        f830i0 = z10;
        f831j0 = new int[]{16842836};
        f832k0 = !"robolectric".equals(Build.FINGERPRINT);
        f833l0 = i10 >= 17;
        if (!z10 || f834m0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f834m0 = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void C0(v vVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (vVar.f895o || this.L) {
            return;
        }
        if (vVar.f881a == 0) {
            if ((this.f836e.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback k02 = k0();
        if (k02 != null && !k02.onMenuOpened(vVar.f881a, vVar.f890j)) {
            T(vVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f836e.getSystemService("window");
        if (windowManager != null && F0(vVar, keyEvent)) {
            ViewGroup viewGroup = vVar.f887g;
            if (viewGroup != null && !vVar.f897q) {
                View view = vVar.f889i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i10 = -1;
                    vVar.f894n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i10, -2, vVar.f884d, vVar.f885e, 1002, 8519680, -3);
                    layoutParams2.gravity = vVar.f883c;
                    layoutParams2.windowAnimations = vVar.f886f;
                    windowManager.addView(vVar.f887g, layoutParams2);
                    vVar.f895o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!n0(vVar) || vVar.f887g == null) {
                        return;
                    }
                } else if (vVar.f897q && viewGroup.getChildCount() > 0) {
                    vVar.f887g.removeAllViews();
                }
                if (m0(vVar) && vVar.b()) {
                    ViewGroup.LayoutParams layoutParams3 = vVar.f888h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    vVar.f887g.setBackgroundResource(vVar.f882b);
                    ViewParent parent = vVar.f888h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(vVar.f888h);
                    }
                    vVar.f887g.addView(vVar.f888h, layoutParams3);
                    if (!vVar.f888h.hasFocus()) {
                        vVar.f888h.requestFocus();
                    }
                } else {
                    vVar.f897q = true;
                    return;
                }
            }
            i10 = -2;
            vVar.f894n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i10, -2, vVar.f884d, vVar.f885e, 1002, 8519680, -3);
            layoutParams22.gravity = vVar.f883c;
            layoutParams22.windowAnimations = vVar.f886f;
            windowManager.addView(vVar.f887g, layoutParams22);
            vVar.f895o = true;
        }
    }

    private boolean E0(v vVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((vVar.f893m || F0(vVar, keyEvent)) && (eVar = vVar.f890j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f844l == null) {
            T(vVar, true);
        }
        return z10;
    }

    private boolean F0(v vVar, KeyEvent keyEvent) {
        e0 e0Var;
        e0 e0Var2;
        e0 e0Var3;
        if (this.L) {
            return false;
        }
        if (vVar.f893m) {
            return true;
        }
        v vVar2 = this.H;
        if (vVar2 != null && vVar2 != vVar) {
            T(vVar2, false);
        }
        Window.Callback k02 = k0();
        if (k02 != null) {
            vVar.f889i = k02.onCreatePanelView(vVar.f881a);
        }
        int i10 = vVar.f881a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (e0Var3 = this.f844l) != null) {
            e0Var3.f();
        }
        if (vVar.f889i == null && (!z10 || !(D0() instanceof androidx.appcompat.app.l))) {
            androidx.appcompat.view.menu.e eVar = vVar.f890j;
            if (eVar == null || vVar.f898r) {
                if (eVar == null && (!o0(vVar) || vVar.f890j == null)) {
                    return false;
                }
                if (z10 && this.f844l != null) {
                    if (this.f845m == null) {
                        this.f845m = new j();
                    }
                    this.f844l.d(vVar.f890j, this.f845m);
                }
                vVar.f890j.d0();
                if (!k02.onCreatePanelMenu(vVar.f881a, vVar.f890j)) {
                    vVar.c(null);
                    if (z10 && (e0Var = this.f844l) != null) {
                        e0Var.d(null, this.f845m);
                    }
                    return false;
                }
                vVar.f898r = false;
            }
            vVar.f890j.d0();
            Bundle bundle = vVar.f899s;
            if (bundle != null) {
                vVar.f890j.P(bundle);
                vVar.f899s = null;
            }
            if (!k02.onPreparePanel(0, vVar.f889i, vVar.f890j)) {
                if (z10 && (e0Var2 = this.f844l) != null) {
                    e0Var2.d(null, this.f845m);
                }
                vVar.f890j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            vVar.f896p = z11;
            vVar.f890j.setQwertyMode(z11);
            vVar.f890j.c0();
        }
        vVar.f893m = true;
        vVar.f894n = false;
        this.H = vVar;
        return true;
    }

    private void G0(boolean z10) {
        e0 e0Var = this.f844l;
        if (e0Var != null && e0Var.a() && (!ViewConfiguration.get(this.f836e).hasPermanentMenuKey() || this.f844l.g())) {
            Window.Callback k02 = k0();
            if (this.f844l.e() && z10) {
                this.f844l.b();
                if (this.L) {
                    return;
                }
                k02.onPanelClosed(108, i0(0, true).f890j);
                return;
            } else if (k02 == null || this.L) {
                return;
            } else {
                if (this.T && (this.U & 1) != 0) {
                    this.f837f.getDecorView().removeCallbacks(this.V);
                    this.V.run();
                }
                v i02 = i0(0, true);
                androidx.appcompat.view.menu.e eVar = i02.f890j;
                if (eVar == null || i02.f898r || !k02.onPreparePanel(0, i02.f889i, eVar)) {
                    return;
                }
                k02.onMenuOpened(108, i02.f890j);
                this.f844l.c();
                return;
            }
        }
        v i03 = i0(0, true);
        i03.f897q = true;
        T(i03, false);
        C0(i03, null);
    }

    private int H0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i10;
        }
    }

    private boolean J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f837f.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || z.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean L(boolean z10) {
        if (this.L) {
            return false;
        }
        int O = O();
        boolean N0 = N0(s0(this.f836e, O), z10);
        if (O == 0) {
            h0(this.f836e).e();
        } else {
            r rVar = this.R;
            if (rVar != null) {
                rVar.a();
            }
        }
        if (O == 3) {
            g0(this.f836e).e();
        } else {
            r rVar2 = this.S;
            if (rVar2 != null) {
                rVar2.a();
            }
        }
        return N0;
    }

    private void L0() {
        if (this.f853u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f854v.findViewById(16908290);
        View decorView = this.f837f.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f836e.obtainStyledAttributes(d.j.f28901v0);
        obtainStyledAttributes.getValue(d.j.H0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(d.j.I0, contentFrameLayout.getMinWidthMinor());
        int i10 = d.j.F0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = d.j.G0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = d.j.D0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = d.j.E0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private androidx.appcompat.app.d M0() {
        for (Context context = this.f836e; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void N(Window window) {
        if (this.f837f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof p)) {
                p pVar = new p(callback);
                this.f838g = pVar;
                window.setCallback(pVar);
                z0 u10 = z0.u(this.f836e, null, f831j0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.w();
                this.f837f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean N0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f836e
            r1 = 0
            android.content.res.Configuration r0 = r6.U(r0, r7, r1)
            boolean r2 = r6.q0()
            android.content.res.Configuration r3 = r6.M
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.f836e
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.J
            if (r8 == 0) goto L4b
            boolean r8 = androidx.appcompat.app.g.f832k0
            if (r8 != 0) goto L34
            boolean r8 = r6.K
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f835d
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f835d
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.a.p(r8)
            r8 = 1
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.O0(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f835d
            boolean r0 = r8 instanceof androidx.appcompat.app.d
            if (r0 == 0) goto L62
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.d) r8
            r8.onNightModeChanged(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.N0(int, boolean):boolean");
    }

    private int O() {
        int i10 = this.N;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.l();
    }

    private void O0(int i10, boolean z10, Configuration configuration) {
        Resources resources = this.f836e.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            androidx.appcompat.app.k.a(resources);
        }
        int i12 = this.O;
        if (i12 != 0) {
            this.f836e.setTheme(i12);
            if (i11 >= 23) {
                this.f836e.getTheme().applyStyle(this.O, true);
            }
        }
        if (z10) {
            Object obj = this.f835d;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.p) {
                    if (((androidx.lifecycle.p) activity).getLifecycle().b().a(i.c.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (!this.K || this.L) {
                } else {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void Q0(View view) {
        int d10;
        if ((z.M(view) & Constants.BUFFER_SIZE) != 0) {
            d10 = androidx.core.content.b.d(this.f836e, d.c.f28683b);
        } else {
            d10 = androidx.core.content.b.d(this.f836e, d.c.f28682a);
        }
        view.setBackgroundColor(d10);
    }

    private void R() {
        r rVar = this.R;
        if (rVar != null) {
            rVar.a();
        }
        r rVar2 = this.S;
        if (rVar2 != null) {
            rVar2.a();
        }
    }

    private Configuration U(Context context, int i10, Configuration configuration) {
        int i11;
        if (i10 != 1) {
            i11 = i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup V() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f836e.obtainStyledAttributes(d.j.f28901v0);
        int i10 = d.j.A0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(d.j.J0, false)) {
                C(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                C(108);
            }
            if (obtainStyledAttributes.getBoolean(d.j.B0, false)) {
                C(109);
            }
            if (obtainStyledAttributes.getBoolean(d.j.C0, false)) {
                C(10);
            }
            this.D = obtainStyledAttributes.getBoolean(d.j.f28906w0, false);
            obtainStyledAttributes.recycle();
            c0();
            this.f837f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f836e);
            if (!this.E) {
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(d.g.f28762f, (ViewGroup) null);
                    this.B = false;
                    this.A = false;
                } else if (this.A) {
                    TypedValue typedValue = new TypedValue();
                    this.f836e.getTheme().resolveAttribute(d.a.f28660f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new i.d(this.f836e, typedValue.resourceId);
                    } else {
                        context = this.f836e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(d.g.f28772p, (ViewGroup) null);
                    e0 e0Var = (e0) viewGroup.findViewById(d.f.f28746p);
                    this.f844l = e0Var;
                    e0Var.setWindowCallback(k0());
                    if (this.B) {
                        this.f844l.h(109);
                    }
                    if (this.f857y) {
                        this.f844l.h(2);
                    }
                    if (this.f858z) {
                        this.f844l.h(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.C ? (ViewGroup) from.inflate(d.g.f28771o, (ViewGroup) null) : (ViewGroup) from.inflate(d.g.f28770n, (ViewGroup) null);
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    z.D0(viewGroup, new c());
                } else if (viewGroup instanceof androidx.appcompat.widget.i0) {
                    ((androidx.appcompat.widget.i0) viewGroup).setOnFitSystemWindowsListener(new d());
                }
                if (this.f844l == null) {
                    this.f855w = (TextView) viewGroup.findViewById(d.f.M);
                }
                g1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d.f.f28732b);
                ViewGroup viewGroup2 = (ViewGroup) this.f837f.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f837f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A + ", windowActionBarOverlay: " + this.B + ", android:windowIsFloating: " + this.D + ", windowActionModeOverlay: " + this.C + ", windowNoTitle: " + this.E + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void b0() {
        if (this.f853u) {
            return;
        }
        this.f854v = V();
        CharSequence j02 = j0();
        if (!TextUtils.isEmpty(j02)) {
            e0 e0Var = this.f844l;
            if (e0Var != null) {
                e0Var.setWindowTitle(j02);
            } else if (D0() != null) {
                D0().y(j02);
            } else {
                TextView textView = this.f855w;
                if (textView != null) {
                    textView.setText(j02);
                }
            }
        }
        M();
        B0(this.f854v);
        this.f853u = true;
        v i02 = i0(0, false);
        if (this.L) {
            return;
        }
        if (i02 == null || i02.f890j == null) {
            p0(108);
        }
    }

    private void c0() {
        if (this.f837f == null) {
            Object obj = this.f835d;
            if (obj instanceof Activity) {
                N(((Activity) obj).getWindow());
            }
        }
        if (this.f837f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                n.a(configuration, configuration2, configuration3);
            } else if (!h0.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & DownloadResource.STATUS_RUNNING;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & DownloadResource.STATUS_RUNNING)) {
                configuration3.screenLayout |= i30 & DownloadResource.STATUS_RUNNING;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                o.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            if (i14 >= 17) {
                l.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private r g0(Context context) {
        if (this.S == null) {
            this.S = new q(context);
        }
        return this.S;
    }

    private r h0(Context context) {
        if (this.R == null) {
            this.R = new s(androidx.appcompat.app.n.a(context));
        }
        return this.R;
    }

    private void l0() {
        b0();
        if (this.A && this.f841i == null) {
            Object obj = this.f835d;
            if (obj instanceof Activity) {
                this.f841i = new androidx.appcompat.app.o((Activity) this.f835d, this.B);
            } else if (obj instanceof Dialog) {
                this.f841i = new androidx.appcompat.app.o((Dialog) this.f835d);
            }
            androidx.appcompat.app.a aVar = this.f841i;
            if (aVar != null) {
                aVar.s(this.W);
            }
        }
    }

    private boolean m0(v vVar) {
        View view = vVar.f889i;
        if (view != null) {
            vVar.f888h = view;
            return true;
        } else if (vVar.f890j == null) {
            return false;
        } else {
            if (this.f846n == null) {
                this.f846n = new w();
            }
            View view2 = (View) vVar.a(this.f846n);
            vVar.f888h = view2;
            return view2 != null;
        }
    }

    private boolean n0(v vVar) {
        vVar.d(f0());
        vVar.f887g = new u(vVar.f892l);
        vVar.f883c = 81;
        return true;
    }

    private boolean o0(v vVar) {
        Context context = this.f836e;
        int i10 = vVar.f881a;
        if ((i10 == 0 || i10 == 108) && this.f844l != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(d.a.f28660f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(d.a.f28661g, typedValue, true);
            } else {
                theme.resolveAttribute(d.a.f28661g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                i.d dVar = new i.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        vVar.c(eVar);
        return true;
    }

    private void p0(int i10) {
        this.U = (1 << i10) | this.U;
        if (this.T) {
            return;
        }
        z.i0(this.f837f.getDecorView(), this.V);
        this.T = true;
    }

    private boolean q0() {
        if (!this.Q && (this.f835d instanceof Activity)) {
            PackageManager packageManager = this.f836e.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f836e, this.f835d.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.P = (activityInfo == null || (activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.P = false;
            }
        }
        this.Q = true;
        return this.P;
    }

    private boolean v0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            v i02 = i0(i10, true);
            if (i02.f895o) {
                return false;
            }
            return F0(i02, keyEvent);
        }
        return false;
    }

    private boolean y0(int i10, KeyEvent keyEvent) {
        boolean z10;
        e0 e0Var;
        if (this.f847o != null) {
            return false;
        }
        boolean z11 = true;
        v i02 = i0(i10, true);
        if (i10 == 0 && (e0Var = this.f844l) != null && e0Var.a() && !ViewConfiguration.get(this.f836e).hasPermanentMenuKey()) {
            if (!this.f844l.e()) {
                if (!this.L && F0(i02, keyEvent)) {
                    z11 = this.f844l.c();
                }
                z11 = false;
            } else {
                z11 = this.f844l.b();
            }
        } else {
            boolean z12 = i02.f895o;
            if (!z12 && !i02.f894n) {
                if (i02.f893m) {
                    if (i02.f898r) {
                        i02.f893m = false;
                        z10 = F0(i02, keyEvent);
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        C0(i02, keyEvent);
                    }
                }
                z11 = false;
            } else {
                T(i02, true);
                z11 = z12;
            }
        }
        if (z11) {
            AudioManager audioManager = (AudioManager) this.f836e.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z11;
    }

    void A0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a p10 = p();
            if (p10 != null) {
                p10.h(false);
            }
        } else if (i10 == 0) {
            v i02 = i0(i10, true);
            if (i02.f895o) {
                T(i02, false);
            }
        }
    }

    void B0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f
    public boolean C(int i10) {
        int H0 = H0(i10);
        if (this.E && H0 == 108) {
            return false;
        }
        if (this.A && H0 == 1) {
            this.A = false;
        }
        if (H0 == 1) {
            L0();
            this.E = true;
            return true;
        } else if (H0 == 2) {
            L0();
            this.f857y = true;
            return true;
        } else if (H0 == 5) {
            L0();
            this.f858z = true;
            return true;
        } else if (H0 == 10) {
            L0();
            this.C = true;
            return true;
        } else if (H0 == 108) {
            L0();
            this.A = true;
            return true;
        } else if (H0 != 109) {
            return this.f837f.requestFeature(H0);
        } else {
            L0();
            this.B = true;
            return true;
        }
    }

    @Override // androidx.appcompat.app.f
    public void D(int i10) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f854v.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f836e).inflate(i10, viewGroup);
        this.f838g.a().onContentChanged();
    }

    final androidx.appcompat.app.a D0() {
        return this.f841i;
    }

    @Override // androidx.appcompat.app.f
    public void E(View view) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f854v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f838g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void F(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ViewGroup viewGroup = (ViewGroup) this.f854v.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f838g.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.f
    public void H(Toolbar toolbar) {
        if (this.f835d instanceof Activity) {
            androidx.appcompat.app.a p10 = p();
            if (!(p10 instanceof androidx.appcompat.app.o)) {
                this.f842j = null;
                if (p10 != null) {
                    p10.n();
                }
                this.f841i = null;
                if (toolbar != null) {
                    androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(toolbar, j0(), this.f838g);
                    this.f841i = lVar;
                    this.f838g.b(lVar.f919c);
                } else {
                    this.f838g.b(null);
                }
                r();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.appcompat.app.f
    public void I(int i10) {
        this.O = i10;
    }

    final boolean I0() {
        ViewGroup viewGroup;
        return this.f853u && (viewGroup = this.f854v) != null && z.U(viewGroup);
    }

    @Override // androidx.appcompat.app.f
    public final void J(CharSequence charSequence) {
        this.f843k = charSequence;
        e0 e0Var = this.f844l;
        if (e0Var != null) {
            e0Var.setWindowTitle(charSequence);
        } else if (D0() != null) {
            D0().y(charSequence);
        } else {
            TextView textView = this.f855w;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public i.b K(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar != null) {
            i.b bVar = this.f847o;
            if (bVar != null) {
                bVar.c();
            }
            k kVar = new k(aVar);
            androidx.appcompat.app.a p10 = p();
            if (p10 != null) {
                i.b z10 = p10.z(kVar);
                this.f847o = z10;
                if (z10 != null && (eVar = this.f840h) != null) {
                    eVar.onSupportActionModeStarted(z10);
                }
            }
            if (this.f847o == null) {
                this.f847o = K0(kVar);
            }
            return this.f847o;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    i.b K0(i.b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.K0(i.b$a):i.b");
    }

    void P(int i10, v vVar, Menu menu) {
        if (menu == null) {
            if (vVar == null && i10 >= 0) {
                v[] vVarArr = this.G;
                if (i10 < vVarArr.length) {
                    vVar = vVarArr[i10];
                }
            }
            if (vVar != null) {
                menu = vVar.f890j;
            }
        }
        if ((vVar == null || vVar.f895o) && !this.L) {
            this.f838g.a().onPanelClosed(i10, menu);
        }
    }

    final int P0(androidx.core.view.i0 i0Var, Rect rect) {
        int i10;
        boolean z10;
        boolean z11;
        if (i0Var != null) {
            i10 = i0Var.k();
        } else {
            i10 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f848p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f848p.getLayoutParams();
            if (this.f848p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect2 = this.X;
                Rect rect3 = this.Y;
                if (i0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(i0Var.i(), i0Var.k(), i0Var.j(), i0Var.h());
                }
                g1.a(this.f854v, rect2, rect3);
                int i11 = rect2.top;
                int i12 = rect2.left;
                int i13 = rect2.right;
                androidx.core.view.i0 J = z.J(this.f854v);
                int i14 = J == null ? 0 : J.i();
                int j10 = J == null ? 0 : J.j();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && this.f856x == null) {
                    View view = new View(this.f836e);
                    this.f856x = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i14;
                    layoutParams.rightMargin = j10;
                    this.f854v.addView(this.f856x, -1, layoutParams);
                } else {
                    View view2 = this.f856x;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != i14 || marginLayoutParams2.rightMargin != j10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = i14;
                            marginLayoutParams2.rightMargin = j10;
                            this.f856x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f856x;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    Q0(this.f856x);
                }
                if (!this.C && r5) {
                    i10 = 0;
                }
                z10 = r5;
                r5 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r5 = false;
            }
            if (r5) {
                this.f848p.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f856x;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return i10;
    }

    void Q(androidx.appcompat.view.menu.e eVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.f844l.l();
        Window.Callback k02 = k0();
        if (k02 != null && !this.L) {
            k02.onPanelClosed(108, eVar);
        }
        this.F = false;
    }

    void S(int i10) {
        T(i0(i10, true), true);
    }

    void T(v vVar, boolean z10) {
        ViewGroup viewGroup;
        e0 e0Var;
        if (z10 && vVar.f881a == 0 && (e0Var = this.f844l) != null && e0Var.e()) {
            Q(vVar.f890j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f836e.getSystemService("window");
        if (windowManager != null && vVar.f895o && (viewGroup = vVar.f887g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                P(vVar.f881a, vVar, null);
            }
        }
        vVar.f893m = false;
        vVar.f894n = false;
        vVar.f895o = false;
        vVar.f888h = null;
        vVar.f897q = true;
        if (this.H == vVar) {
            this.H = null;
        }
    }

    public View W(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.Z == null) {
            String string = this.f836e.obtainStyledAttributes(d.j.f28901v0).getString(d.j.f28921z0);
            if (string == null) {
                this.Z = new androidx.appcompat.app.i();
            } else {
                try {
                    this.Z = (androidx.appcompat.app.i) this.f836e.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.Z = new androidx.appcompat.app.i();
                }
            }
        }
        boolean z12 = f830i0;
        if (z12) {
            if (this.f839g0 == null) {
                this.f839g0 = new androidx.appcompat.app.j();
            }
            if (this.f839g0.a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                        z11 = true;
                    }
                } else {
                    z11 = J0((ViewParent) view);
                }
                z10 = z11;
            }
        } else {
            z10 = false;
        }
        return this.Z.createView(view, str, context, attributeSet, z10, z12, true, f1.c());
    }

    void X() {
        androidx.appcompat.view.menu.e eVar;
        e0 e0Var = this.f844l;
        if (e0Var != null) {
            e0Var.l();
        }
        if (this.f849q != null) {
            this.f837f.getDecorView().removeCallbacks(this.f850r);
            if (this.f849q.isShowing()) {
                try {
                    this.f849q.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f849q = null;
        }
        a0();
        v i02 = i0(0, false);
        if (i02 == null || (eVar = i02.f890j) == null) {
            return;
        }
        eVar.close();
    }

    boolean Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f835d;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.h)) && (decorView = this.f837f.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f838g.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? u0(keyCode, keyEvent) : x0(keyCode, keyEvent);
    }

    void Z(int i10) {
        v i02;
        v i03 = i0(i10, true);
        if (i03.f890j != null) {
            Bundle bundle = new Bundle();
            i03.f890j.Q(bundle);
            if (bundle.size() > 0) {
                i03.f899s = bundle;
            }
            i03.f890j.d0();
            i03.f890j.clear();
        }
        i03.f898r = true;
        i03.f897q = true;
        if ((i10 != 108 && i10 != 0) || this.f844l == null || (i02 = i0(0, false)) == null) {
            return;
        }
        i02.f893m = false;
        F0(i02, null);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        v d02;
        Window.Callback k02 = k0();
        if (k02 == null || this.L || (d02 = d0(eVar.D())) == null) {
            return false;
        }
        return k02.onMenuItemSelected(d02.f881a, menuItem);
    }

    void a0() {
        androidx.core.view.e0 e0Var = this.f851s;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        G0(true);
    }

    @Override // androidx.appcompat.app.f
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        b0();
        ((ViewGroup) this.f854v.findViewById(16908290)).addView(view, layoutParams);
        this.f838g.a().onContentChanged();
    }

    v d0(Menu menu) {
        v[] vVarArr = this.G;
        int length = vVarArr != null ? vVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            v vVar = vVarArr[i10];
            if (vVar != null && vVar.f890j == menu) {
                return vVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public boolean e() {
        return L(true);
    }

    final Context f0() {
        androidx.appcompat.app.a p10 = p();
        Context k10 = p10 != null ? p10.k() : null;
        return k10 == null ? this.f836e : k10;
    }

    @Override // androidx.appcompat.app.f
    public Context h(Context context) {
        this.J = true;
        int s02 = s0(context, O());
        Configuration configuration = null;
        if (f833l0 && (context instanceof ContextThemeWrapper)) {
            try {
                t.a((ContextThemeWrapper) context, U(context, s02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i.d) {
            try {
                ((i.d) context).a(U(context, s02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f832k0) {
            return super.h(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = l.a(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = e0(configuration3, configuration4);
            }
        }
        Configuration U = U(context, s02, configuration);
        i.d dVar = new i.d(context, d.i.f28793c);
        dVar.a(U);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.e.a(dVar.getTheme());
        }
        return super.h(dVar);
    }

    protected v i0(int i10, boolean z10) {
        v[] vVarArr = this.G;
        if (vVarArr == null || vVarArr.length <= i10) {
            v[] vVarArr2 = new v[i10 + 1];
            if (vVarArr != null) {
                System.arraycopy(vVarArr, 0, vVarArr2, 0, vVarArr.length);
            }
            this.G = vVarArr2;
            vVarArr = vVarArr2;
        }
        v vVar = vVarArr[i10];
        if (vVar == null) {
            v vVar2 = new v(i10);
            vVarArr[i10] = vVar2;
            return vVar2;
        }
        return vVar;
    }

    final CharSequence j0() {
        Object obj = this.f835d;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f843k;
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T k(int i10) {
        b0();
        return (T) this.f837f.findViewById(i10);
    }

    final Window.Callback k0() {
        return this.f837f.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public final androidx.appcompat.app.b m() {
        return new h(this);
    }

    @Override // androidx.appcompat.app.f
    public int n() {
        return this.N;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater o() {
        if (this.f842j == null) {
            l0();
            androidx.appcompat.app.a aVar = this.f841i;
            this.f842j = new i.g(aVar != null ? aVar.k() : this.f836e);
        }
        return this.f842j;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return W(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a p() {
        l0();
        return this.f841i;
    }

    @Override // androidx.appcompat.app.f
    public void q() {
        LayoutInflater from = LayoutInflater.from(this.f836e);
        if (from.getFactory() == null) {
            androidx.core.view.g.b(from, this);
        } else if (from.getFactory2() instanceof g) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.f
    public void r() {
        androidx.appcompat.app.a p10 = p();
        if (p10 == null || !p10.l()) {
            p0(0);
        }
    }

    public boolean r0() {
        return this.f852t;
    }

    @Override // androidx.appcompat.app.f
    public void s(Configuration configuration) {
        androidx.appcompat.app.a p10;
        if (this.A && this.f853u && (p10 = p()) != null) {
            p10.m(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f836e);
        this.M = new Configuration(this.f836e.getResources().getConfiguration());
        L(false);
    }

    int s0(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 == 0) {
                    if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                        return h0(context).c();
                    }
                    return -1;
                } else if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        return g0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // androidx.appcompat.app.f
    public void t(Bundle bundle) {
        this.J = true;
        L(false);
        c0();
        Object obj = this.f835d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                androidx.appcompat.app.a D0 = D0();
                if (D0 == null) {
                    this.W = true;
                } else {
                    D0.s(true);
                }
            }
            androidx.appcompat.app.f.c(this);
        }
        this.M = new Configuration(this.f836e.getResources().getConfiguration());
        this.K = true;
    }

    boolean t0() {
        i.b bVar = this.f847o;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a p10 = p();
        return p10 != null && p10.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f835d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.A(r3)
        L9:
            boolean r0 = r3.T
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f837f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.V
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.L = r0
            int r0 = r3.N
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f835d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.f829h0
            java.lang.Object r1 = r3.f835d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.N
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.g.f829h0
            java.lang.Object r1 = r3.f835d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f841i
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.u():void");
    }

    boolean u0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.I = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            v0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void v(Bundle bundle) {
        b0();
    }

    @Override // androidx.appcompat.app.f
    public void w() {
        androidx.appcompat.app.a p10 = p();
        if (p10 != null) {
            p10.w(true);
        }
    }

    boolean w0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a p10 = p();
        if (p10 == null || !p10.o(i10, keyEvent)) {
            v vVar = this.H;
            if (vVar != null && E0(vVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                v vVar2 = this.H;
                if (vVar2 != null) {
                    vVar2.f894n = true;
                }
                return true;
            }
            if (this.H == null) {
                v i02 = i0(0, true);
                F0(i02, keyEvent);
                boolean E0 = E0(i02, keyEvent.getKeyCode(), keyEvent, 1);
                i02.f893m = false;
                if (E0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void x(Bundle bundle) {
    }

    boolean x0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.I;
            this.I = false;
            v i02 = i0(0, false);
            if (i02 != null && i02.f895o) {
                if (!z10) {
                    T(i02, true);
                }
                return true;
            } else if (t0()) {
                return true;
            }
        } else if (i10 == 82) {
            y0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void y() {
        e();
    }

    @Override // androidx.appcompat.app.f
    public void z() {
        androidx.appcompat.app.a p10 = p();
        if (p10 != null) {
            p10.w(false);
        }
    }

    void z0(int i10) {
        androidx.appcompat.app.a p10;
        if (i10 != 108 || (p10 = p()) == null) {
            return;
        }
        p10.h(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private g(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.collection.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.d M0;
        this.f851s = null;
        this.f852t = true;
        this.N = -100;
        this.V = new b();
        this.f836e = context;
        this.f840h = eVar;
        this.f835d = obj;
        if (this.N == -100 && (obj instanceof Dialog) && (M0 = M0()) != null) {
            this.N = M0.getDelegate().n();
        }
        if (this.N == -100 && (num = (gVar = f829h0).get(obj.getClass().getName())) != null) {
            this.N = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            N(window);
        }
        androidx.appcompat.widget.k.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class p extends i.i {

        /* renamed from: b  reason: collision with root package name */
        private i f871b;

        p(Window.Callback callback) {
            super(callback);
        }

        void b(i iVar) {
            this.f871b = iVar;
        }

        final ActionMode c(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f836e, callback);
            i.b K = g.this.K(aVar);
            if (K != null) {
                return aVar.e(K);
            }
            return null;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.w0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // i.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View onCreatePanelView;
            i iVar = this.f871b;
            return (iVar == null || (onCreatePanelView = iVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : onCreatePanelView;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g.this.z0(i10);
            return true;
        }

        @Override // i.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            g.this.A0(i10);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            boolean z10 = true;
            if (eVar != null) {
                eVar.a0(true);
            }
            i iVar = this.f871b;
            z10 = (iVar == null || !iVar.a(i10)) ? false : false;
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return z10;
        }

        @Override // i.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            v i02 = g.this.i0(0, true);
            if (i02 != null && (eVar = i02.f890j) != null) {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            }
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (g.this.r0()) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (g.this.r0() && i10 == 0) {
                return c(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
