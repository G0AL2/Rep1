package f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.o0;
import androidx.collection.h;
import f.b;
import f.d;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.i;

/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends f.d implements a0.a {

    /* renamed from: o  reason: collision with root package name */
    private c f29840o;

    /* renamed from: p  reason: collision with root package name */
    private g f29841p;

    /* renamed from: q  reason: collision with root package name */
    private int f29842q;

    /* renamed from: r  reason: collision with root package name */
    private int f29843r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f29844s;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f29845a;

        b(Animatable animatable) {
            super();
            this.f29845a = animatable;
        }

        @Override // f.a.g
        public void c() {
            this.f29845a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f29845a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        androidx.collection.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.d<>();
            this.L = new h<>();
        }

        private static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.j(z10, Integer.valueOf(i10));
            return z10;
        }

        int C(int i10, int i11, Drawable drawable, boolean z10) {
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = a10;
            this.K.a(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.f(i10, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i10, int i11) {
            return (int) this.K.g(D(i10, i11), -1L).longValue();
        }

        boolean H(int i10, int i11) {
            return (this.K.g(D(i10, i11), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i10, int i11) {
            return (this.K.g(D(i10, i11), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // f.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // f.d.a, f.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // f.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f29846a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f29846a = bVar;
        }

        @Override // f.a.g
        public void c() {
            this.f29846a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f29846a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f29847a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29848b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            if (Build.VERSION.SDK_INT >= 18) {
                g.b.a(ofInt, true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f29848b = z11;
            this.f29847a = ofInt;
        }

        @Override // f.a.g
        public boolean a() {
            return this.f29848b;
        }

        @Override // f.a.g
        public void b() {
            this.f29847a.reverse();
        }

        @Override // f.a.g
        public void c() {
            this.f29847a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f29847a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f29849a;

        /* renamed from: b  reason: collision with root package name */
        private int f29850b;

        /* renamed from: c  reason: collision with root package name */
        private int f29851c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f29851c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f29850b = numberOfFrames;
            int[] iArr = this.f29849a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f29849a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f29849a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f29851c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f29851c) + 0.5f);
            int i11 = this.f29850b;
            int[] iArr = this.f29849a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f29851c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, g.e.f30414h);
        int resourceId = k10.getResourceId(g.e.f30415i, 0);
        int resourceId2 = k10.getResourceId(g.e.f30416j, -1);
        Drawable j10 = resourceId2 > 0 ? o0.h().j(context, resourceId2) : null;
        k10.recycle();
        int[] k11 = k(attributeSet);
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    j10 = androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j10 = g.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 != null) {
            return this.f29840o.B(k11, j10, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k10 = i.k(resources, theme, attributeSet, g.e.f30417k);
        int resourceId = k10.getResourceId(g.e.f30420n, -1);
        int resourceId2 = k10.getResourceId(g.e.f30419m, -1);
        int resourceId3 = k10.getResourceId(g.e.f30418l, -1);
        Drawable j10 = resourceId3 > 0 ? o0.h().j(context, resourceId3) : null;
        boolean z10 = k10.getBoolean(g.e.f30421o, false);
        k10.recycle();
        if (j10 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    j10 = androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j10 = g.c.a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j10 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j10 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f29840o.C(resourceId, resourceId2, j10, z10);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i10) {
        int c10;
        int G;
        g bVar;
        g gVar = this.f29841p;
        if (gVar != null) {
            if (i10 == this.f29842q) {
                return true;
            }
            if (i10 == this.f29843r && gVar.a()) {
                gVar.b();
                this.f29842q = this.f29843r;
                this.f29843r = i10;
                return true;
            }
            c10 = this.f29842q;
            gVar.d();
        } else {
            c10 = c();
        }
        this.f29841p = null;
        this.f29843r = -1;
        this.f29842q = -1;
        c cVar = this.f29840o;
        int E = cVar.E(c10);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.b) {
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.f29841p = bVar;
        this.f29843r = c10;
        this.f29842q = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f29840o;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f29869d |= g.c.b(typedArray);
        }
        cVar.x(typedArray.getBoolean(g.e.f30410d, cVar.f29874i));
        cVar.t(typedArray.getBoolean(g.e.f30411e, cVar.f29877l));
        cVar.u(typedArray.getInt(g.e.f30412f, cVar.A));
        cVar.v(typedArray.getInt(g.e.f30413g, cVar.B));
        setDither(typedArray.getBoolean(g.e.f30408b, cVar.f29889x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.d, f.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f29840o = (c) dVar;
        }
    }

    @Override // f.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f29841p;
        if (gVar != null) {
            gVar.d();
            this.f29841p = null;
            g(this.f29842q);
            this.f29842q = -1;
            this.f29843r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.d
    /* renamed from: l */
    public c j() {
        return new c(this.f29840o, this, null);
    }

    @Override // f.d, f.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f29844s && super.mutate() == this) {
            this.f29840o.r();
            this.f29844s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k10 = i.k(resources, theme, attributeSet, g.e.f30407a);
        setVisible(k10.getBoolean(g.e.f30409c, true), true);
        t(k10);
        i(resources);
        k10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f.d, f.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.f29840o.F(iArr);
        boolean z10 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z10 | current.setState(iArr) : z10;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f29841p;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f29842q = -1;
        this.f29843r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
