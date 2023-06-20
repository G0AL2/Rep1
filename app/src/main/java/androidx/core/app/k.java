package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2563a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f2564b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2565c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle b(i.a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e10 = aVar.e();
        bundle2.putInt("icon", e10 != null ? e10.e() : 0);
        bundle2.putCharSequence("title", aVar.i());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle2.putBoolean("showsUserInterface", aVar.h());
        bundle2.putInt("semanticAction", aVar.g());
        return bundle2;
    }

    public static Bundle c(Notification notification) {
        synchronized (f2563a) {
            if (f2565c) {
                return null;
            }
            try {
                if (f2564b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f2565c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f2564b = declaredField;
                }
                Bundle bundle = (Bundle) f2564b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f2564b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                Log.e("NotificationCompat", "Unable to access notification extras", e10);
                f2565c = true;
                return null;
            } catch (NoSuchFieldException e11) {
                Log.e("NotificationCompat", "Unable to access notification extras", e11);
                f2565c = true;
                return null;
            }
        }
    }

    private static Bundle d(n nVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            bundleArr[i10] = d(nVarArr[i10]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, i.a aVar) {
        IconCompat e10 = aVar.e();
        builder.addAction(e10 != null ? e10.e() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
