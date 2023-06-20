package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2474a = (IconCompat) aVar.v(remoteActionCompat.f2474a, 1);
        remoteActionCompat.f2475b = aVar.l(remoteActionCompat.f2475b, 2);
        remoteActionCompat.f2476c = aVar.l(remoteActionCompat.f2476c, 3);
        remoteActionCompat.f2477d = (PendingIntent) aVar.r(remoteActionCompat.f2477d, 4);
        remoteActionCompat.f2478e = aVar.h(remoteActionCompat.f2478e, 5);
        remoteActionCompat.f2479f = aVar.h(remoteActionCompat.f2479f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f2474a, 1);
        aVar.D(remoteActionCompat.f2475b, 2);
        aVar.D(remoteActionCompat.f2476c, 3);
        aVar.H(remoteActionCompat.f2477d, 4);
        aVar.z(remoteActionCompat.f2478e, 5);
        aVar.z(remoteActionCompat.f2479f, 6);
    }
}
