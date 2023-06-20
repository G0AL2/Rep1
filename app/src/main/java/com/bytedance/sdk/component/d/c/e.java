package com.bytedance.sdk.component.d.c;

import android.content.Context;
import com.bytedance.sdk.component.d.k;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.o;
import com.bytedance.sdk.component.d.p;
import com.bytedance.sdk.component.d.q;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadConfig.java */
/* loaded from: classes.dex */
public class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private k f10242a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f10243b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.component.d.d f10244c;

    /* renamed from: d  reason: collision with root package name */
    private p f10245d;

    /* renamed from: e  reason: collision with root package name */
    private q f10246e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.d.c f10247f;

    /* renamed from: g  reason: collision with root package name */
    private o f10248g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.sdk.component.d.b f10249h;

    /* compiled from: LoadConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private k f10250a;

        /* renamed from: b  reason: collision with root package name */
        private ExecutorService f10251b;

        /* renamed from: c  reason: collision with root package name */
        private com.bytedance.sdk.component.d.d f10252c;

        /* renamed from: d  reason: collision with root package name */
        private p f10253d;

        /* renamed from: e  reason: collision with root package name */
        private q f10254e;

        /* renamed from: f  reason: collision with root package name */
        private com.bytedance.sdk.component.d.c f10255f;

        /* renamed from: g  reason: collision with root package name */
        private o f10256g;

        /* renamed from: h  reason: collision with root package name */
        private com.bytedance.sdk.component.d.b f10257h;

        public a a(com.bytedance.sdk.component.d.b bVar) {
            this.f10257h = bVar;
            return this;
        }

        public a a(ExecutorService executorService) {
            this.f10251b = executorService;
            return this;
        }

        public a a(com.bytedance.sdk.component.d.d dVar) {
            this.f10252c = dVar;
            return this;
        }

        public e a() {
            return new e(this);
        }
    }

    @Override // com.bytedance.sdk.component.d.l
    public k a() {
        return this.f10242a;
    }

    @Override // com.bytedance.sdk.component.d.l
    public ExecutorService b() {
        return this.f10243b;
    }

    @Override // com.bytedance.sdk.component.d.l
    public com.bytedance.sdk.component.d.d c() {
        return this.f10244c;
    }

    @Override // com.bytedance.sdk.component.d.l
    public p d() {
        return this.f10245d;
    }

    @Override // com.bytedance.sdk.component.d.l
    public q e() {
        return this.f10246e;
    }

    @Override // com.bytedance.sdk.component.d.l
    public com.bytedance.sdk.component.d.c f() {
        return this.f10247f;
    }

    @Override // com.bytedance.sdk.component.d.l
    public o g() {
        return this.f10248g;
    }

    @Override // com.bytedance.sdk.component.d.l
    public com.bytedance.sdk.component.d.b h() {
        return this.f10249h;
    }

    private e(a aVar) {
        this.f10242a = aVar.f10250a;
        this.f10243b = aVar.f10251b;
        this.f10244c = aVar.f10252c;
        this.f10245d = aVar.f10253d;
        this.f10246e = aVar.f10254e;
        this.f10247f = aVar.f10255f;
        this.f10249h = aVar.f10257h;
        this.f10248g = aVar.f10256g;
    }

    public static e a(Context context) {
        return new a().a();
    }
}
