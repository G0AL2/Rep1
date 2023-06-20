package com.bytedance.sdk.component.widget.a;

/* compiled from: BaseAdapterInstance.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f10505b;

    /* renamed from: a  reason: collision with root package name */
    private volatile b f10506a;

    private a() {
    }

    public static a a() {
        if (f10505b == null) {
            synchronized (a.class) {
                if (f10505b == null) {
                    f10505b = new a();
                }
            }
        }
        return f10505b;
    }

    public b b() {
        return this.f10506a;
    }

    public void a(b bVar) {
        this.f10506a = bVar;
    }
}
