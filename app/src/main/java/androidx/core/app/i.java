package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class i {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Bundle f2508a;

        /* renamed from: b  reason: collision with root package name */
        private IconCompat f2509b;

        /* renamed from: c  reason: collision with root package name */
        private final n[] f2510c;

        /* renamed from: d  reason: collision with root package name */
        private final n[] f2511d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2512e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2513f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2514g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f2515h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f2516i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f2517j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f2518k;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.c(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f2518k;
        }

        public boolean b() {
            return this.f2512e;
        }

        public n[] c() {
            return this.f2511d;
        }

        public Bundle d() {
            return this.f2508a;
        }

        public IconCompat e() {
            int i10;
            if (this.f2509b == null && (i10 = this.f2516i) != 0) {
                this.f2509b = IconCompat.c(null, "", i10);
            }
            return this.f2509b;
        }

        public n[] f() {
            return this.f2510c;
        }

        public int g() {
            return this.f2514g;
        }

        public boolean h() {
            return this.f2513f;
        }

        public CharSequence i() {
            return this.f2517j;
        }

        public boolean j() {
            return this.f2515h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z10, int i10, boolean z11, boolean z12) {
            this.f2513f = true;
            this.f2509b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f2516i = iconCompat.e();
            }
            this.f2517j = e.d(charSequence);
            this.f2518k = pendingIntent;
            this.f2508a = bundle == null ? new Bundle() : bundle;
            this.f2510c = nVarArr;
            this.f2511d = nVarArr2;
            this.f2512e = z10;
            this.f2514g = i10;
            this.f2513f = z11;
            this.f2515h = z12;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f2519e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f2520f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2521g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f2522h;

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0048b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hVar.a()).setBigContentTitle(this.f2551b).bigPicture(this.f2519e);
                if (this.f2521g) {
                    IconCompat iconCompat = this.f2520f;
                    if (iconCompat == null) {
                        a.a(bigPicture, null);
                    } else if (i10 >= 23) {
                        C0048b.a(bigPicture, this.f2520f.q(hVar instanceof j ? ((j) hVar).f() : null));
                    } else if (iconCompat.i() == 1) {
                        a.a(bigPicture, this.f2520f.d());
                    } else {
                        a.a(bigPicture, null);
                    }
                }
                if (this.f2553d) {
                    a.b(bigPicture, this.f2552c);
                }
                if (i10 >= 31) {
                    c.a(bigPicture, this.f2522h);
                }
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f2520f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f2521g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f2519e = bitmap;
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f2523e;

        @Override // androidx.core.app.i.f
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f2523e);
            }
        }

        @Override // androidx.core.app.i.f
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f2551b).bigText(this.f2523e);
                if (this.f2553d) {
                    bigText.setSummaryText(this.f2552c);
                }
            }
        }

        @Override // androidx.core.app.i.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f2523e = e.d(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected e f2550a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f2551b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f2552c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2553d = false;

        public void a(Bundle bundle) {
            if (this.f2553d) {
                bundle.putCharSequence("android.summaryText", this.f2552c);
            }
            CharSequence charSequence = this.f2551b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c10 = c();
            if (c10 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c10);
            }
        }

        public abstract void b(h hVar);

        protected abstract String c();

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public RemoteViews f(h hVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f2550a != eVar) {
                this.f2550a = eVar;
                if (eVar != null) {
                    eVar.z(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 19) {
            return notification.extras;
        }
        if (i10 >= 16) {
            return k.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        d R;
        Notification S;
        boolean T;
        Icon U;
        @Deprecated
        public ArrayList<String> V;

        /* renamed from: a  reason: collision with root package name */
        public Context f2524a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f2525b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<m> f2526c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f2527d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f2528e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f2529f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f2530g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f2531h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f2532i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f2533j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f2534k;

        /* renamed from: l  reason: collision with root package name */
        int f2535l;

        /* renamed from: m  reason: collision with root package name */
        int f2536m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2537n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2538o;

        /* renamed from: p  reason: collision with root package name */
        f f2539p;

        /* renamed from: q  reason: collision with root package name */
        CharSequence f2540q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f2541r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence[] f2542s;

        /* renamed from: t  reason: collision with root package name */
        int f2543t;

        /* renamed from: u  reason: collision with root package name */
        int f2544u;

        /* renamed from: v  reason: collision with root package name */
        boolean f2545v;

        /* renamed from: w  reason: collision with root package name */
        String f2546w;

        /* renamed from: x  reason: collision with root package name */
        boolean f2547x;

        /* renamed from: y  reason: collision with root package name */
        String f2548y;

        /* renamed from: z  reason: collision with root package name */
        boolean f2549z;

        public e(Context context, String str) {
            this.f2525b = new ArrayList<>();
            this.f2526c = new ArrayList<>();
            this.f2527d = new ArrayList<>();
            this.f2537n = true;
            this.f2549z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f2524a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f2536m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2524a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(w.b.f38105b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(w.b.f38104a);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
            return bitmap;
        }

        private void n(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.S;
                notification.flags = i10 | notification.flags;
                return;
            }
            Notification notification2 = this.S;
            notification2.flags = (~i10) & notification2.flags;
        }

        public e A(CharSequence charSequence) {
            this.f2540q = d(charSequence);
            return this;
        }

        public e B(CharSequence charSequence) {
            this.S.tickerText = d(charSequence);
            return this;
        }

        public e C(long[] jArr) {
            this.S.vibrate = jArr;
            return this;
        }

        public e D(int i10) {
            this.F = i10;
            return this;
        }

        public e E(long j10) {
            this.S.when = j10;
            return this;
        }

        public e a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2525b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new j(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z10) {
            n(16, z10);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i10) {
            this.E = i10;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f2530g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f2529f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f2528e = d(charSequence);
            return this;
        }

        public e l(int i10) {
            Notification notification = this.S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public e o(String str) {
            this.f2546w = str;
            return this;
        }

        public e p(Bitmap bitmap) {
            this.f2533j = e(bitmap);
            return this;
        }

        public e q(int i10, int i11, int i12) {
            Notification notification = this.S;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e r(boolean z10) {
            this.f2549z = z10;
            return this;
        }

        public e s(int i10) {
            this.f2535l = i10;
            return this;
        }

        public e t(boolean z10) {
            n(2, z10);
            return this;
        }

        public e u(int i10) {
            this.f2536m = i10;
            return this;
        }

        public e v(int i10, int i11, boolean z10) {
            this.f2543t = i10;
            this.f2544u = i11;
            this.f2545v = z10;
            return this;
        }

        public e w(boolean z10) {
            this.f2537n = z10;
            return this;
        }

        public e x(int i10) {
            this.S.icon = i10;
            return this;
        }

        public e y(Uri uri) {
            Notification notification = this.S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e z(f fVar) {
            if (this.f2539p != fVar) {
                this.f2539p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        @Deprecated
        public e(Context context) {
            this(context, null);
        }
    }
}
