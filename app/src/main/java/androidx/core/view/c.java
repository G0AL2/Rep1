package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final f f2647a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final InterfaceC0052c f2648a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2648a = new b(clipData, i10);
            } else {
                this.f2648a = new d(clipData, i10);
            }
        }

        public c a() {
            return this.f2648a.build();
        }

        public a b(Bundle bundle) {
            this.f2648a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f2648a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f2648a.a(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC0052c {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo.Builder f2649a;

        b(ClipData clipData, int i10) {
            this.f2649a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void a(Uri uri) {
            this.f2649a.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void b(int i10) {
            this.f2649a.setFlags(i10);
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public c build() {
            return new c(new e(this.f2649a.build()));
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void setExtras(Bundle bundle) {
            this.f2649a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0052c {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class d implements InterfaceC0052c {

        /* renamed from: a  reason: collision with root package name */
        ClipData f2650a;

        /* renamed from: b  reason: collision with root package name */
        int f2651b;

        /* renamed from: c  reason: collision with root package name */
        int f2652c;

        /* renamed from: d  reason: collision with root package name */
        Uri f2653d;

        /* renamed from: e  reason: collision with root package name */
        Bundle f2654e;

        d(ClipData clipData, int i10) {
            this.f2650a = clipData;
            this.f2651b = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void a(Uri uri) {
            this.f2653d = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void b(int i10) {
            this.f2652c = i10;
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0052c
        public void setExtras(Bundle bundle) {
            this.f2654e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ContentInfo f2655a;

        e(ContentInfo contentInfo) {
            this.f2655a = (ContentInfo) h0.g.f(contentInfo);
        }

        @Override // androidx.core.view.c.f
        public ContentInfo a() {
            return this.f2655a;
        }

        @Override // androidx.core.view.c.f
        public ClipData b() {
            return this.f2655a.getClip();
        }

        @Override // androidx.core.view.c.f
        public int c() {
            return this.f2655a.getFlags();
        }

        @Override // androidx.core.view.c.f
        public int getSource() {
            return this.f2655a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2655a + "}";
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private interface f {
        ContentInfo a();

        ClipData b();

        int c();

        int getSource();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class g implements f {

        /* renamed from: a  reason: collision with root package name */
        private final ClipData f2656a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2657b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2658c;

        /* renamed from: d  reason: collision with root package name */
        private final Uri f2659d;

        /* renamed from: e  reason: collision with root package name */
        private final Bundle f2660e;

        g(d dVar) {
            this.f2656a = (ClipData) h0.g.f(dVar.f2650a);
            this.f2657b = h0.g.b(dVar.f2651b, 0, 5, "source");
            this.f2658c = h0.g.e(dVar.f2652c, 1);
            this.f2659d = dVar.f2653d;
            this.f2660e = dVar.f2654e;
        }

        @Override // androidx.core.view.c.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.c.f
        public ClipData b() {
            return this.f2656a;
        }

        @Override // androidx.core.view.c.f
        public int c() {
            return this.f2658c;
        }

        @Override // androidx.core.view.c.f
        public int getSource() {
            return this.f2657b;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ContentInfoCompat{clip=");
            sb2.append(this.f2656a.getDescription());
            sb2.append(", source=");
            sb2.append(c.e(this.f2657b));
            sb2.append(", flags=");
            sb2.append(c.a(this.f2658c));
            if (this.f2659d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f2659d.toString().length() + ")";
            }
            sb2.append(str);
            sb2.append(this.f2660e != null ? ", hasExtras" : "");
            sb2.append("}");
            return sb2.toString();
        }
    }

    c(f fVar) {
        this.f2647a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static c g(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2647a.b();
    }

    public int c() {
        return this.f2647a.c();
    }

    public int d() {
        return this.f2647a.getSource();
    }

    public ContentInfo f() {
        return this.f2647a.a();
    }

    public String toString() {
        return this.f2647a.toString();
    }
}
