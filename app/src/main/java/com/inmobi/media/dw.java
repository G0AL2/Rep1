package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: ViewableAd.java */
/* loaded from: classes3.dex */
public abstract class dw {

    /* renamed from: a  reason: collision with root package name */
    protected j f25180a;

    /* renamed from: b  reason: collision with root package name */
    a f25181b;

    /* renamed from: c  reason: collision with root package name */
    protected fq f25182c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f25183d;

    /* compiled from: ViewableAd.java */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25184a;

        public abstract View a(View view, ViewGroup viewGroup, boolean z10, q qVar);

        public void a() {
            if (this.f25184a) {
                return;
            }
            this.f25184a = true;
        }
    }

    public dw(j jVar) {
        this.f25180a = jVar;
        this.f25182c = jVar.getAdConfig();
    }

    public abstract View a(View view, ViewGroup viewGroup, boolean z10);

    public a a() {
        return this.f25181b;
    }

    public abstract void a(byte b10);

    public abstract void a(Context context, byte b10);

    public abstract void a(Map<View, FriendlyObstructionPurpose> map);

    public View b() {
        WeakReference<View> weakReference = this.f25183d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public View c() {
        return null;
    }

    public abstract void d();

    public void e() {
        WeakReference<View> weakReference = this.f25183d;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(View view) {
        this.f25183d = new WeakReference<>(view);
    }
}
