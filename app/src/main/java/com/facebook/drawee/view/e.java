package com.facebook.drawee.view;

import android.net.Uri;
import g4.f;
import y3.n;

/* compiled from: SimpleDraweeView.java */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: h  reason: collision with root package name */
    private static n<? extends r4.b> f14521h;

    /* renamed from: g  reason: collision with root package name */
    private r4.b f14522g;

    public static void g(n<? extends r4.b> nVar) {
        f14521h = nVar;
    }

    protected r4.b getControllerBuilder() {
        return this.f14522g;
    }

    public void h(int i10, Object obj) {
        i(f.d(i10), obj);
    }

    public void i(Uri uri, Object obj) {
        setController(this.f14522g.A(obj).b(uri).a(getController()).build());
    }

    public void j(String str, Object obj) {
        i(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i10) {
        h(i10, null);
    }

    public void setImageRequest(b6.b bVar) {
        setController(this.f14522g.C(bVar).a(getController()).build());
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
    }

    @Override // com.facebook.drawee.view.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        i(uri, null);
    }

    public void setImageURI(String str) {
        j(str, null);
    }
}
