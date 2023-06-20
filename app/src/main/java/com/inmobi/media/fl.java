package com.inmobi.media;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.bw;
import com.inmobi.media.cb;
import com.inmobi.media.cc;
import com.inmobi.media.ez;
import com.squareup.picasso.Callback;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/* compiled from: NativeViewFactory.java */
/* loaded from: classes3.dex */
public class fl {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25439a = "fl";

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class, Byte> f25440c;

    /* renamed from: e  reason: collision with root package name */
    private static volatile WeakReference<fl> f25441e = null;

    /* renamed from: f  reason: collision with root package name */
    private static WeakReference<Context> f25442f = null;

    /* renamed from: g  reason: collision with root package name */
    private static int f25443g = 1;

    /* renamed from: h  reason: collision with root package name */
    private static int f25444h = 1;

    /* renamed from: b  reason: collision with root package name */
    private int f25445b;

    /* renamed from: d  reason: collision with root package name */
    private Map<Byte, d> f25446d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeViewFactory.java */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f25461a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ImageView> f25462b;

        a(Context context, ImageView imageView) {
            this.f25461a = new WeakReference<>(context);
            this.f25462b = new WeakReference<>(imageView);
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context = this.f25461a.get();
            ImageView imageView = this.f25462b.get();
            if (context == null || imageView == null) {
                return;
            }
            fl.b(context, imageView);
        }
    }

    /* compiled from: NativeViewFactory.java */
    @SuppressLint({"AppCompatCustomView"})
    /* loaded from: classes3.dex */
    static final class b extends TextView {
        public b(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            int lineHeight = getLineHeight() > 0 ? i11 / getLineHeight() : 0;
            if (lineHeight > 0) {
                setSingleLine(false);
                setLines(lineHeight);
            }
            if (lineHeight == 1) {
                setSingleLine();
            }
        }

        @Override // android.widget.TextView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeViewFactory.java */
    /* loaded from: classes3.dex */
    public static class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<Context> f25463a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<ImageView> f25464b;

        /* renamed from: c  reason: collision with root package name */
        private bt f25465c;

        c(Context context, ImageView imageView, bt btVar) {
            this.f25463a = new WeakReference<>(context);
            this.f25464b = new WeakReference<>(imageView);
            this.f25465c = btVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = fl.f25439a;
            if (method == null || !"onError".equalsIgnoreCase(method.getName())) {
                return null;
            }
            fl.a(this.f25463a.get(), this.f25464b.get(), this.f25465c);
            return null;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f25440c = hashMap;
        hashMap.put(fe.class, (byte) 0);
        hashMap.put(fo.class, (byte) 1);
        hashMap.put(fn.class, (byte) 2);
        hashMap.put(ez.class, (byte) 3);
        hashMap.put(ImageView.class, (byte) 6);
        hashMap.put(fk.class, (byte) 7);
        hashMap.put(b.class, (byte) 4);
        hashMap.put(Button.class, (byte) 5);
        hashMap.put(ce.class, (byte) 8);
        hashMap.put(q.class, (byte) 9);
        hashMap.put(ex.class, (byte) 10);
    }

    @SuppressLint({"UseSparseArrays"})
    private fl(Context context) {
        f25442f = new WeakReference<>(context);
        this.f25446d = new HashMap();
        this.f25446d.put((byte) 0, new d() { // from class: com.inmobi.media.fl.1
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new fe(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a(view, btVar.f24811c);
            }
        });
        this.f25446d.put((byte) 3, new d() { // from class: com.inmobi.media.fl.5
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new ez(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a(view, btVar.f24811c);
            }
        });
        this.f25446d.put((byte) 1, new d() { // from class: com.inmobi.media.fl.6
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new fo(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a(view, btVar.f24811c);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                ((fo) view).f25473a = null;
                return super.a(view);
            }
        });
        this.f25446d.put((byte) 2, new d() { // from class: com.inmobi.media.fl.7
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new fn(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a(view, btVar.f24811c);
            }
        });
        this.f25446d.put((byte) 6, new d() { // from class: com.inmobi.media.fl.8
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new ImageView(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((ImageView) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageDrawable(null);
                    return super.a(view);
                }
                return false;
            }
        });
        this.f25446d.put((byte) 10, new d() { // from class: com.inmobi.media.fl.9
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new ex(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((ex) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                if (view instanceof ex) {
                    ((ex) view).setGifImpl(null);
                    return super.a(view);
                }
                return false;
            }
        });
        this.f25446d.put((byte) 7, new d() { // from class: com.inmobi.media.fl.10
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new fk(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((fk) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                if (view instanceof fk) {
                    fk fkVar = (fk) view;
                    fkVar.getProgressBar().setVisibility(8);
                    fkVar.getPoster().setImageBitmap(null);
                    fkVar.getVideoView().e();
                    return super.a(view);
                }
                return false;
            }
        });
        this.f25446d.put((byte) 4, new d() { // from class: com.inmobi.media.fl.11
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new b(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((TextView) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                if (view instanceof TextView) {
                    fl.a((TextView) view);
                    return super.a(view);
                }
                return false;
            }
        });
        this.f25446d.put((byte) 5, new d() { // from class: com.inmobi.media.fl.12
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new Button(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((Button) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                if (view instanceof Button) {
                    fl.a((TextView) ((Button) view));
                    return super.a(view);
                }
                return false;
            }
        });
        this.f25446d.put((byte) 8, new d() { // from class: com.inmobi.media.fl.2
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                return new ce(context2.getApplicationContext());
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a(fl.this, (ce) view, btVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                return (view instanceof ce) && super.a(view);
            }
        });
        this.f25446d.put((byte) 9, new d() { // from class: com.inmobi.media.fl.3
            @Override // com.inmobi.media.fl.d
            protected final View a(Context context2) {
                q qVar = null;
                try {
                    q qVar2 = new q(context2.getApplicationContext(), (byte) 0, null, null, Boolean.FALSE, "DEFAULT");
                    try {
                        qVar2.setShouldFireRenderBeacon(false);
                        return qVar2;
                    } catch (Exception e10) {
                        e = e10;
                        qVar = qVar2;
                        String unused = fl.f25439a;
                        gg.a().a(new hg(e));
                        return qVar;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }

            @Override // com.inmobi.media.fl.d
            protected final void a(View view, bt btVar, fq fqVar) {
                super.a(view, btVar, fqVar);
                fl.a((q) view, btVar, fqVar);
            }

            @Override // com.inmobi.media.fl.d
            public final boolean a(View view) {
                return (view instanceof q) && !((q) view).f25971u && super.a(view);
            }
        });
    }

    static /* synthetic */ int a(fl flVar) {
        int i10 = flVar.f25445b;
        flVar.f25445b = i10 + 1;
        return i10;
    }

    static /* synthetic */ int b(fl flVar) {
        int i10 = flVar.f25445b;
        flVar.f25445b = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10) {
        int i11;
        Context context = f25442f.get();
        return ((context == null || !(context instanceof InMobiAdActivity)) && (i11 = f25443g) != 0) ? (int) (i10 * ((i11 * 1.0d) / f25444h)) : i10;
    }

    private d d() {
        int i10 = 0;
        d dVar = null;
        for (Map.Entry<Byte, d> entry : this.f25446d.entrySet()) {
            if (entry.getValue().f25467b.size() > i10) {
                d value = entry.getValue();
                dVar = value;
                i10 = value.f25467b.size();
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i10) {
        f25444h = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, ImageView imageView) {
        Bitmap createBitmap;
        if (imageView.getDrawable() == null) {
            float f10 = ic.a().f25747c;
            cp cpVar = new cp(context, f10, (byte) 0);
            if (Build.VERSION.SDK_INT < 28) {
                cpVar.layout(0, 0, (int) (c(40) * f10), (int) (c(40) * f10));
                cpVar.setDrawingCacheEnabled(true);
                cpVar.buildDrawingCache();
                createBitmap = cpVar.getDrawingCache();
            } else {
                cpVar.layout(0, 0, (int) (c(40) * f10), (int) (c(40) * f10));
                createBitmap = Bitmap.createBitmap((int) (c(40) * f10), (int) (c(40) * f10), Bitmap.Config.ARGB_8888);
                cpVar.draw(new Canvas(createBitmap));
            }
            imageView.setImageBitmap(createBitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i10) {
        f25443g = i10;
    }

    private void c(View view) {
        d dVar;
        byte byteValue = f25440c.get(view.getClass()).byteValue();
        if (-1 == byteValue || (dVar = this.f25446d.get(Integer.valueOf(byteValue))) == null) {
            return;
        }
        if (this.f25445b >= 300) {
            c();
        }
        dVar.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeViewFactory.java */
    /* loaded from: classes3.dex */
    public abstract class d {

        /* renamed from: b  reason: collision with root package name */
        LinkedList<View> f25467b = new LinkedList<>();

        /* renamed from: a  reason: collision with root package name */
        private int f25466a = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f25469d = 0;

        public d() {
        }

        protected abstract View a(Context context);

        public boolean a(View view) {
            fl.b(view);
            view.setOnClickListener(null);
            this.f25467b.addLast(view);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            fl.a(fl.this);
            return true;
        }

        public String toString() {
            return "Size:" + this.f25467b.size() + " Miss Count:" + this.f25466a + " Hit Count:" + this.f25469d;
        }

        public final View a(Context context, bt btVar, fq fqVar) {
            View removeFirst;
            WeakReference unused = fl.f25442f = new WeakReference(context);
            if (this.f25467b.isEmpty()) {
                this.f25466a++;
                removeFirst = a(context);
            } else {
                this.f25469d++;
                removeFirst = this.f25467b.removeFirst();
                fl.b(fl.this);
            }
            if (removeFirst != null) {
                a(removeFirst, btVar, fqVar);
            }
            return removeFirst;
        }

        public final void a() {
            if (this.f25467b.size() > 0) {
                this.f25467b.removeFirst();
            }
        }

        protected void a(View view, bt btVar, fq fqVar) {
            view.setVisibility(btVar.f24832x);
            view.setOnClickListener(null);
        }
    }

    public static fl a(Context context) {
        fl flVar = null;
        fl flVar2 = f25441e == null ? null : f25441e.get();
        if (flVar2 == null) {
            synchronized (fl.class) {
                if (f25441e != null) {
                    flVar = f25441e.get();
                }
                if (flVar == null) {
                    flVar2 = new fl(context);
                    f25441e = new WeakReference<>(flVar2);
                } else {
                    flVar2 = flVar;
                }
            }
        }
        return flVar2;
    }

    private void c() {
        d d10 = d();
        if (d10 != null) {
            d10.a();
        }
    }

    public final View a(Context context, bt btVar, fq fqVar) {
        d dVar;
        byte a10 = a(btVar);
        if (-1 == a10 || (dVar = this.f25446d.get(Byte.valueOf(a10))) == null) {
            return null;
        }
        return dVar.a(context, btVar, fqVar);
    }

    public final void a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            a(childAt);
        }
    }

    public final void a(View view) {
        if ((view instanceof fe) || (view instanceof ez)) {
            ez ezVar = (ez) view;
            if (ezVar.getChildCount() != 0) {
                Stack stack = new Stack();
                stack.push(ezVar);
                while (!stack.isEmpty()) {
                    ez ezVar2 = (ez) stack.pop();
                    for (int childCount = ezVar2.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = ezVar2.getChildAt(childCount);
                        ezVar2.removeViewAt(childCount);
                        if (childAt instanceof ez) {
                            stack.push((ez) childAt);
                        } else {
                            c(childAt);
                        }
                    }
                    c(ezVar2);
                }
                return;
            }
        }
        c(view);
    }

    static /* synthetic */ void b(View view) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(null);
        } else {
            view.setBackground(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r10.equals("TEXT") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte a(com.inmobi.media.bt r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.bv
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1e
            com.inmobi.media.bv r10 = (com.inmobi.media.bv) r10
            boolean r0 = r10.a()
            if (r0 == 0) goto L11
            return r3
        L11:
            boolean r0 = r10.b()
            if (r0 == 0) goto L1d
            byte r10 = r10.A
            if (r10 == r4) goto L1c
            return r4
        L1c:
            return r2
        L1d:
            return r1
        L1e:
            java.lang.String r10 = r10.f24810b
            r10.hashCode()
            int r0 = r10.hashCode()
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = -1
            switch(r0) {
                case 67056: goto L7c;
                case 70564: goto L71;
                case 2241657: goto L66;
                case 2571565: goto L5d;
                case 69775675: goto L52;
                case 79826725: goto L47;
                case 81665115: goto L3c;
                case 1942407129: goto L31;
                default: goto L2f;
            }
        L2f:
            r1 = -1
            goto L86
        L31:
            java.lang.String r0 = "WEBVIEW"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L3a
            goto L2f
        L3a:
            r1 = 7
            goto L86
        L3c:
            java.lang.String r0 = "VIDEO"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L45
            goto L2f
        L45:
            r1 = 6
            goto L86
        L47:
            java.lang.String r0 = "TIMER"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L50
            goto L2f
        L50:
            r1 = 5
            goto L86
        L52:
            java.lang.String r0 = "IMAGE"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L5b
            goto L2f
        L5b:
            r1 = 4
            goto L86
        L5d:
            java.lang.String r0 = "TEXT"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L86
            goto L2f
        L66:
            java.lang.String r0 = "ICON"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L6f
            goto L2f
        L6f:
            r1 = 2
            goto L86
        L71:
            java.lang.String r0 = "GIF"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L7a
            goto L2f
        L7a:
            r1 = 1
            goto L86
        L7c:
            java.lang.String r0 = "CTA"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L85
            goto L2f
        L85:
            r1 = 0
        L86:
            switch(r1) {
                case 0: goto L96;
                case 1: goto L93;
                case 2: goto L92;
                case 3: goto L91;
                case 4: goto L92;
                case 5: goto L8e;
                case 6: goto L8d;
                case 7: goto L8a;
                default: goto L89;
            }
        L89:
            return r9
        L8a:
            r10 = 9
            return r10
        L8d:
            return r5
        L8e:
            r10 = 8
            return r10
        L91:
            return r8
        L92:
            return r6
        L93:
            r10 = 10
            return r10
        L96:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.fl.a(com.inmobi.media.bt):byte");
    }

    private static void a(TextView textView, String[] strArr) {
        int paintFlags = textView.getPaintFlags();
        int i10 = 0;
        for (String str : strArr) {
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1178781136:
                    if (str.equals("italic")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1026963764:
                    if (str.equals("underline")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -891985998:
                    if (str.equals("strike")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3029637:
                    if (str.equals("bold")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 |= 2;
                    break;
                case 1:
                    paintFlags |= 8;
                    break;
                case 2:
                    paintFlags |= 16;
                    break;
                case 3:
                    i10 |= 1;
                    break;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i10);
        textView.setPaintFlags(paintFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    public static void a(View view, bu buVar) {
        int parseColor = Color.parseColor("#00000000");
        try {
            parseColor = Color.parseColor(buVar.e());
        } catch (IllegalArgumentException e10) {
            gg.a().a(new hg(e10));
        }
        view.setBackgroundColor(parseColor);
        if ("line".equals(buVar.a())) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            if ("curved".equals(buVar.b())) {
                gradientDrawable.setCornerRadius(buVar.c());
            }
            int parseColor2 = Color.parseColor("#ff000000");
            try {
                parseColor2 = Color.parseColor(buVar.d());
            } catch (IllegalArgumentException e11) {
                gg.a().a(new hg(e11));
            }
            gradientDrawable.setStroke(1, parseColor2);
            if (Build.VERSION.SDK_INT < 16) {
                view.setBackgroundDrawable(gradientDrawable);
            } else {
                view.setBackground(gradientDrawable);
            }
        }
    }

    public static ViewGroup.LayoutParams a(bt btVar, ViewGroup viewGroup) {
        bu buVar = btVar.f24811c;
        Point point = buVar.f24834a;
        Point point2 = buVar.f24836c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(c(point.x), c(point.y));
        if (viewGroup instanceof ez) {
            ez.a aVar = new ez.a(c(point.x), c(point.y));
            int c10 = c(point2.x);
            int c11 = c(point2.y);
            aVar.f25322a = c10;
            aVar.f25323b = c11;
            return aVar;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(c(point.x), c(point.y));
            layoutParams2.setMargins(c(point2.x), c(point2.y), 0, 0);
            return layoutParams2;
        } else if (viewGroup instanceof AbsListView) {
            return new AbsListView.LayoutParams(c(point.x), c(point.y));
        } else {
            if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(c(point.x), c(point.y));
                layoutParams3.setMargins(c(point2.x), c(point2.y), 0, 0);
                return layoutParams3;
            }
            return layoutParams;
        }
    }

    static /* synthetic */ void a(ImageView imageView, bt btVar) {
        int i10;
        int i11;
        String str = (String) btVar.f24813e;
        if (str != null) {
            int c10 = c(btVar.f24811c.f24834a.x);
            int c11 = c(btVar.f24811c.f24834a.y);
            String f10 = btVar.f24811c.f();
            f10.hashCode();
            if (f10.equals("aspectFit")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (!f10.equals("aspectFill")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            Context context = f25442f.get();
            if (context != null && c10 > 0 && c11 > 0 && str.trim().length() != 0) {
                di.a(context).load(str).into(imageView, (Callback) di.a(new c(context, imageView, btVar)));
                if ("cross_button".equalsIgnoreCase(btVar.f24812d) && btVar.f24826r.length() == 0) {
                    new Handler().postDelayed(new a(context, imageView), Constants.MIN_PROGRESS_TIME);
                }
            }
            bt btVar2 = btVar.f24828t;
            int i12 = 1;
            if (btVar2 == null || !"line".equals(btVar2.f24811c.a())) {
                i10 = 0;
                i12 = 0;
                i11 = 0;
            } else {
                bu buVar = btVar2.f24811c;
                int i13 = buVar.f24836c.x == btVar.f24811c.f24836c.x ? 1 : 0;
                int i14 = c(buVar.f24834a.x) == c(btVar.f24811c.f24834a.x) + btVar.f24811c.f24836c.x ? 1 : 0;
                i11 = c(btVar2.f24811c.f24836c.y) == c(btVar.f24811c.f24836c.y) ? 1 : 0;
                r1 = c(btVar2.f24811c.f24834a.y) == c(btVar.f24811c.f24834a.y) + c(btVar.f24811c.f24836c.y) ? 1 : 0;
                if (c(btVar2.f24811c.f24834a.x) == c(btVar.f24811c.f24834a.x)) {
                    i10 = r1;
                    r1 = 1;
                } else {
                    i10 = r1;
                    i12 = i14;
                    r1 = i13;
                }
            }
            if (Build.VERSION.SDK_INT < 17) {
                imageView.setPadding(r1, i11, i12, i10);
            } else {
                imageView.setPaddingRelative(r1, i11, i12, i10);
            }
            a(imageView, btVar.f24811c);
        }
    }

    static /* synthetic */ void a(ex exVar, bt btVar) {
        exVar.setLayoutParams(new ViewGroup.LayoutParams(c(btVar.f24811c.f24834a.x), c(btVar.f24811c.f24834a.y)));
        exVar.setContentMode(btVar.f24811c.f());
        exVar.setGifImpl(((by) btVar).f24881z);
        a(exVar, btVar.f24811c);
    }

    static /* synthetic */ void a(fk fkVar, bt btVar) {
        a(fkVar, btVar.f24811c);
        Object obj = btVar.f24831w;
        if (obj != null) {
            fkVar.setPosterImage((Bitmap) obj);
        }
        fkVar.getProgressBar().setVisibility(0);
    }

    static /* synthetic */ void a(TextView textView, bt btVar) {
        cb.a aVar = (cb.a) btVar.f24811c;
        textView.setLayoutParams(new ViewGroup.LayoutParams(c(aVar.f24834a.x), c(aVar.f24834a.y)));
        textView.setText((CharSequence) btVar.f24813e);
        textView.setTypeface(Typeface.DEFAULT);
        byte b10 = aVar.f24894p;
        if (b10 == 1) {
            textView.setGravity(8388629);
        } else if (b10 != 2) {
            textView.setGravity(8388627);
        } else {
            textView.setGravity(17);
        }
        textView.setTextSize(1, c(aVar.h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.i());
        } catch (IllegalArgumentException e10) {
            gg.a().a(new hg(e10));
        }
        textView.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.e());
        } catch (IllegalArgumentException e11) {
            gg.a().a(new hg(e11));
        }
        textView.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            textView.setTextAlignment(1);
        }
        a(textView, aVar.j());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        a(textView, aVar);
    }

    static /* synthetic */ void a(TextView textView) {
        textView.setTypeface(Typeface.DEFAULT, 0);
        textView.setPaintFlags(textView.getPaintFlags() & (-17));
        textView.setPaintFlags(textView.getPaintFlags() & (-9));
    }

    static /* synthetic */ void a(Button button, bt btVar) {
        bw.a aVar = (bw.a) btVar.f24811c;
        button.setLayoutParams(new ViewGroup.LayoutParams(c(aVar.f24834a.x), c(aVar.f24834a.y)));
        button.setText((CharSequence) btVar.f24813e);
        button.setTextSize(1, c(aVar.h()));
        int parseColor = Color.parseColor("#ff000000");
        try {
            parseColor = Color.parseColor(aVar.i());
        } catch (IllegalArgumentException e10) {
            gg.a().a(new hg(e10));
        }
        button.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(aVar.e());
        } catch (IllegalArgumentException e11) {
            gg.a().a(new hg(e11));
        }
        button.setBackgroundColor(parseColor2);
        if (Build.VERSION.SDK_INT >= 17) {
            button.setTextAlignment(4);
        }
        button.setGravity(17);
        a(button, aVar.j());
        a(button, aVar);
    }

    static /* synthetic */ void a(fl flVar, final ce ceVar, bt btVar) {
        long a10;
        ceVar.setVisibility(4);
        final cd cdVar = (cd) btVar;
        cc ccVar = cdVar.A;
        cc.a aVar = ccVar.f24895a;
        cc.a aVar2 = ccVar.f24896b;
        if (aVar != null) {
            try {
                a10 = aVar.a();
            } catch (Exception e10) {
                gg.a().a(new hg(e10));
                return;
            }
        } else {
            a10 = 0;
        }
        long a11 = aVar2 != null ? aVar2.a() : 0L;
        if (a11 >= 0) {
            ceVar.setTimerValue(a11);
            new Handler().postDelayed(new Runnable() { // from class: com.inmobi.media.fl.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (fl.f25442f.get() != null) {
                        if (cdVar.f24901z) {
                            ceVar.setVisibility(0);
                        }
                        ceVar.a();
                    }
                }
            }, a10 * 1000);
        }
    }

    static /* synthetic */ void a(q qVar, bt btVar, fq fqVar) {
        try {
            ch chVar = (ch) btVar;
            char c10 = 0;
            qVar.a(q.f25944a, fqVar, false, false);
            qVar.f25959i = true;
            String str = (String) btVar.f24813e;
            String str2 = chVar.f24926z;
            switch (str2.hashCode()) {
                case -1081286672:
                    if (str2.equals("REF_IFRAME")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 84303:
                    if (str2.equals("URL")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2228139:
                    if (str2.equals("HTML")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 83774455:
                    if (str2.equals("REF_HTML")) {
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0 && c10 != 1) {
                qVar.b(str);
            } else {
                qVar.a(str);
            }
        } catch (Exception e10) {
            gg.a().a(new hg(e10));
        }
    }

    static /* synthetic */ void a(Context context, ImageView imageView, bt btVar) {
        if (context != null && imageView != null) {
            String str = btVar.f24826r;
            if ("cross_button".equalsIgnoreCase(btVar.f24812d) && str.trim().length() == 0) {
                b(context, imageView);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", "603");
        btVar.a("error", hashMap);
    }
}
