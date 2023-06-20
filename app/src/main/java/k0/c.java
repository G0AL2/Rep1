package k0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0425c f33123a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class b implements InterfaceC0425c {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f33125a;

        /* renamed from: b  reason: collision with root package name */
        private final ClipDescription f33126b;

        /* renamed from: c  reason: collision with root package name */
        private final Uri f33127c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f33125a = uri;
            this.f33126b = clipDescription;
            this.f33127c = uri2;
        }

        @Override // k0.c.InterfaceC0425c
        public Object a() {
            return null;
        }

        @Override // k0.c.InterfaceC0425c
        public Uri b() {
            return this.f33125a;
        }

        @Override // k0.c.InterfaceC0425c
        public void c() {
        }

        @Override // k0.c.InterfaceC0425c
        public Uri d() {
            return this.f33127c;
        }

        @Override // k0.c.InterfaceC0425c
        public ClipDescription getDescription() {
            return this.f33126b;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* renamed from: k0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private interface InterfaceC0425c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f33123a = new a(uri, clipDescription, uri2);
        } else {
            this.f33123a = new b(uri, clipDescription, uri2);
        }
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f33123a.b();
    }

    public ClipDescription b() {
        return this.f33123a.getDescription();
    }

    public Uri c() {
        return this.f33123a.d();
    }

    public void d() {
        this.f33123a.c();
    }

    public Object e() {
        return this.f33123a.a();
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC0425c {

        /* renamed from: a  reason: collision with root package name */
        final InputContentInfo f33124a;

        a(Object obj) {
            this.f33124a = (InputContentInfo) obj;
        }

        @Override // k0.c.InterfaceC0425c
        public Object a() {
            return this.f33124a;
        }

        @Override // k0.c.InterfaceC0425c
        public Uri b() {
            return this.f33124a.getContentUri();
        }

        @Override // k0.c.InterfaceC0425c
        public void c() {
            this.f33124a.requestPermission();
        }

        @Override // k0.c.InterfaceC0425c
        public Uri d() {
            return this.f33124a.getLinkUri();
        }

        @Override // k0.c.InterfaceC0425c
        public ClipDescription getDescription() {
            return this.f33124a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f33124a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private c(InterfaceC0425c interfaceC0425c) {
        this.f33123a = interfaceC0425c;
    }
}
