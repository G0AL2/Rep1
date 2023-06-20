package d8;

import android.content.Context;
import android.os.Build;
import e8.v;

/* compiled from: SchedulingModule.java */
/* loaded from: classes2.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(Context context, f8.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, h8.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e8.c(context, dVar, cVar);
        }
        return new e8.a(context, dVar, aVar, cVar);
    }
}
