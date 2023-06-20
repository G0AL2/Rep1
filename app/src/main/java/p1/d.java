package p1;

import android.os.Build;
import androidx.work.e;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Collection;
import java.util.List;

/* compiled from: EnqueueUtils.kt */
/* loaded from: classes.dex */
public final class d {
    public static final o1.u a(o1.u uVar) {
        o1.u d10;
        qe.k.f(uVar, "workSpec");
        androidx.work.c cVar = uVar.f34914j;
        String str = uVar.f34907c;
        if (qe.k.a(str, ConstraintTrackingWorker.class.getName())) {
            return uVar;
        }
        if (cVar.f() || cVar.i()) {
            androidx.work.e a10 = new e.a().c(uVar.f34909e).g("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
            qe.k.e(a10, "Builder().putAll(workSpe…ame)\n            .build()");
            String name = ConstraintTrackingWorker.class.getName();
            qe.k.e(name, "name");
            d10 = uVar.d((r45 & 1) != 0 ? uVar.f34905a : null, (r45 & 2) != 0 ? uVar.f34906b : null, (r45 & 4) != 0 ? uVar.f34907c : name, (r45 & 8) != 0 ? uVar.f34908d : null, (r45 & 16) != 0 ? uVar.f34909e : a10, (r45 & 32) != 0 ? uVar.f34910f : null, (r45 & 64) != 0 ? uVar.f34911g : 0L, (r45 & 128) != 0 ? uVar.f34912h : 0L, (r45 & 256) != 0 ? uVar.f34913i : 0L, (r45 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? uVar.f34914j : null, (r45 & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0 ? uVar.f34915k : 0, (r45 & 2048) != 0 ? uVar.f34916l : null, (r45 & 4096) != 0 ? uVar.f34917m : 0L, (r45 & Constants.BUFFER_SIZE) != 0 ? uVar.f34918n : 0L, (r45 & 16384) != 0 ? uVar.f34919o : 0L, (r45 & 32768) != 0 ? uVar.f34920p : 0L, (r45 & Constants.MIN_PROGRESS_STEP) != 0 ? uVar.f34921q : false, (131072 & r45) != 0 ? uVar.f34922r : null, (r45 & 262144) != 0 ? uVar.f34923s : 0, (r45 & 524288) != 0 ? uVar.f34924t : 0);
            return d10;
        }
        return uVar;
    }

    private static final boolean b(List<? extends androidx.work.impl.t> list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (androidx.work.impl.t tVar : list) {
                if (cls.isAssignableFrom(tVar.getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static final o1.u c(List<? extends androidx.work.impl.t> list, o1.u uVar) {
        qe.k.f(list, "schedulers");
        qe.k.f(uVar, "workSpec");
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (23 <= i10 && i10 < 26) {
            z10 = true;
        }
        if (z10) {
            return a(uVar);
        }
        return (i10 > 22 || !b(list, "androidx.work.impl.background.gcm.GcmScheduler")) ? uVar : a(uVar);
    }
}
