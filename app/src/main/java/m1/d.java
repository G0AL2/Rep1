package m1;

import android.os.Build;
import androidx.work.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o1.u;
import qe.k;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class d extends c<l1.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n1.h<l1.b> hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // m1.c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f34914j.d() == m.CONNECTED;
    }

    @Override // m1.c
    /* renamed from: i */
    public boolean c(l1.b bVar) {
        k.f(bVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (Build.VERSION.SDK_INT >= 26) {
            if (!bVar.a() || !bVar.d()) {
                return true;
            }
        } else if (!bVar.a()) {
            return true;
        }
        return false;
    }
}
