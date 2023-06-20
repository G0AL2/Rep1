package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.z0;
import androidx.core.view.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f31438e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f31439f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f31440a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f31441b;

    /* renamed from: c  reason: collision with root package name */
    Context f31442c;

    /* renamed from: d  reason: collision with root package name */
    private Object f31443d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f31444c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f31445a;

        /* renamed from: b  reason: collision with root package name */
        private Method f31446b;

        public a(Object obj, String str) {
            this.f31445a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f31446b = cls.getMethod(str, f31444c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f31446b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f31446b.invoke(this.f31445a, menuItem)).booleanValue();
                }
                this.f31446b.invoke(this.f31445a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f31447a;

        /* renamed from: b  reason: collision with root package name */
        private int f31448b;

        /* renamed from: c  reason: collision with root package name */
        private int f31449c;

        /* renamed from: d  reason: collision with root package name */
        private int f31450d;

        /* renamed from: e  reason: collision with root package name */
        private int f31451e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f31452f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f31453g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f31454h;

        /* renamed from: i  reason: collision with root package name */
        private int f31455i;

        /* renamed from: j  reason: collision with root package name */
        private int f31456j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f31457k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f31458l;

        /* renamed from: m  reason: collision with root package name */
        private int f31459m;

        /* renamed from: n  reason: collision with root package name */
        private char f31460n;

        /* renamed from: o  reason: collision with root package name */
        private int f31461o;

        /* renamed from: p  reason: collision with root package name */
        private char f31462p;

        /* renamed from: q  reason: collision with root package name */
        private int f31463q;

        /* renamed from: r  reason: collision with root package name */
        private int f31464r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f31465s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f31466t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f31467u;

        /* renamed from: v  reason: collision with root package name */
        private int f31468v;

        /* renamed from: w  reason: collision with root package name */
        private int f31469w;

        /* renamed from: x  reason: collision with root package name */
        private String f31470x;

        /* renamed from: y  reason: collision with root package name */
        private String f31471y;

        /* renamed from: z  reason: collision with root package name */
        private String f31472z;

        public b(Menu menu) {
            this.f31447a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f31442c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f31465s).setVisible(this.f31466t).setEnabled(this.f31467u).setCheckable(this.f31464r >= 1).setTitleCondensed(this.f31458l).setIcon(this.f31459m);
            int i10 = this.f31468v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f31472z != null) {
                if (!g.this.f31442c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f31472z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f31464r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof j.c) {
                    ((j.c) menuItem).h(true);
                }
            }
            String str = this.f31470x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f31438e, g.this.f31440a));
                z10 = true;
            }
            int i11 = this.f31469w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                j.a(menuItem, bVar);
            }
            j.c(menuItem, this.B);
            j.g(menuItem, this.C);
            j.b(menuItem, this.f31460n, this.f31461o);
            j.f(menuItem, this.f31462p, this.f31463q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                j.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                j.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f31454h = true;
            i(this.f31447a.add(this.f31448b, this.f31455i, this.f31456j, this.f31457k));
        }

        public SubMenu b() {
            this.f31454h = true;
            SubMenu addSubMenu = this.f31447a.addSubMenu(this.f31448b, this.f31455i, this.f31456j, this.f31457k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f31454h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f31442c.obtainStyledAttributes(attributeSet, d.j.f28842j1);
            this.f31448b = obtainStyledAttributes.getResourceId(d.j.f28852l1, 0);
            this.f31449c = obtainStyledAttributes.getInt(d.j.f28862n1, 0);
            this.f31450d = obtainStyledAttributes.getInt(d.j.f28867o1, 0);
            this.f31451e = obtainStyledAttributes.getInt(d.j.f28872p1, 0);
            this.f31452f = obtainStyledAttributes.getBoolean(d.j.f28857m1, true);
            this.f31453g = obtainStyledAttributes.getBoolean(d.j.f28847k1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            z0 u10 = z0.u(g.this.f31442c, attributeSet, d.j.f28877q1);
            this.f31455i = u10.n(d.j.f28892t1, 0);
            this.f31456j = (u10.k(d.j.f28907w1, this.f31449c) & (-65536)) | (u10.k(d.j.f28912x1, this.f31450d) & 65535);
            this.f31457k = u10.p(d.j.f28917y1);
            this.f31458l = u10.p(d.j.f28922z1);
            this.f31459m = u10.n(d.j.f28882r1, 0);
            this.f31460n = c(u10.o(d.j.A1));
            this.f31461o = u10.k(d.j.H1, 4096);
            this.f31462p = c(u10.o(d.j.B1));
            this.f31463q = u10.k(d.j.L1, 4096);
            int i10 = d.j.C1;
            if (u10.s(i10)) {
                this.f31464r = u10.a(i10, false) ? 1 : 0;
            } else {
                this.f31464r = this.f31451e;
            }
            this.f31465s = u10.a(d.j.f28897u1, false);
            this.f31466t = u10.a(d.j.f28902v1, this.f31452f);
            this.f31467u = u10.a(d.j.f28887s1, this.f31453g);
            this.f31468v = u10.k(d.j.M1, -1);
            this.f31472z = u10.o(d.j.D1);
            this.f31469w = u10.n(d.j.E1, 0);
            this.f31470x = u10.o(d.j.G1);
            String o10 = u10.o(d.j.F1);
            this.f31471y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f31469w == 0 && this.f31470x == null) {
                this.A = (androidx.core.view.b) e(o10, g.f31439f, g.this.f31441b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u10.p(d.j.I1);
            this.C = u10.p(d.j.N1);
            int i11 = d.j.K1;
            if (u10.s(i11)) {
                this.E = g0.e(u10.k(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = d.j.J1;
            if (u10.s(i12)) {
                this.D = u10.c(i12);
            } else {
                this.D = null;
            }
            u10.w();
            this.f31454h = false;
        }

        public void h() {
            this.f31448b = 0;
            this.f31449c = 0;
            this.f31450d = 0;
            this.f31451e = 0;
            this.f31452f = true;
            this.f31453g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f31438e = clsArr;
        f31439f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f31442c = context;
        Object[] objArr = {context};
        this.f31440a = objArr;
        this.f31441b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            i.g$b r0 = new i.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f31443d == null) {
            this.f31443d = a(this.f31442c);
        }
        return this.f31443d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof b0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f31442c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
