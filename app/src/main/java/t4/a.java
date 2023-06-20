package t4;

import android.graphics.drawable.Animatable;
import r4.c;

/* compiled from: ImageLoadingTimeControllerListener.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    private long f37119b = -1;

    /* renamed from: c  reason: collision with root package name */
    private long f37120c = -1;

    /* renamed from: d  reason: collision with root package name */
    private b f37121d;

    public a(b bVar) {
        this.f37121d = bVar;
    }

    @Override // r4.c, r4.d
    public void l(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f37120c = currentTimeMillis;
        b bVar = this.f37121d;
        if (bVar != null) {
            bVar.a(currentTimeMillis - this.f37119b);
        }
    }

    @Override // r4.c, r4.d
    public void p(String str, Object obj) {
        this.f37119b = System.currentTimeMillis();
    }
}
