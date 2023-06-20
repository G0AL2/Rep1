package m1;

import android.os.Build;
import androidx.work.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o1.u;
import qe.k;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class g extends c<l1.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n1.h<l1.b> hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // m1.c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        m d10 = uVar.f34914j.d();
        return d10 == m.UNMETERED || (Build.VERSION.SDK_INT >= 30 && d10 == m.TEMPORARILY_UNMETERED);
    }

    @Override // m1.c
    /* renamed from: i */
    public boolean c(l1.b bVar) {
        k.f(bVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return !bVar.a() || bVar.b();
    }
}
