package m1;

import android.os.Build;
import androidx.work.l;
import androidx.work.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import o1.u;
import qe.k;

/* compiled from: ContraintControllers.kt */
/* loaded from: classes.dex */
public final class e extends c<l1.b> {

    /* renamed from: f  reason: collision with root package name */
    private static final String f34180f;

    /* compiled from: ContraintControllers.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
        String i10 = l.i("NetworkMeteredCtrlr");
        k.e(i10, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f34180f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n1.h<l1.b> hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // m1.c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f34914j.d() == m.METERED;
    }

    @Override // m1.c
    /* renamed from: i */
    public boolean c(l1.b bVar) {
        k.f(bVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (Build.VERSION.SDK_INT < 26) {
            l.e().a(f34180f, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (bVar.a()) {
                return false;
            }
        } else if (bVar.a() && bVar.b()) {
            return false;
        }
        return true;
    }
}
