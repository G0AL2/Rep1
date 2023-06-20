package hd;

import android.content.Context;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.google.android.gms.iid.InstanceID;
import java.lang.reflect.InvocationTargetException;

/* compiled from: DeviceIdResolver.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f31413a;

    public a(Context context) {
        this.f31413a = context;
    }

    String a() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object invoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        return (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
    }

    String b() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String str = InstanceID.ERROR_SERVICE_NOT_AVAILABLE;
        Object invoke = InstanceID.class.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f31413a);
        return (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
    }

    public String c() {
        try {
            return a();
        } catch (ClassNotFoundException unused) {
            try {
                return b();
            } catch (ClassNotFoundException unused2) {
                System.err.println("Can't generate id. Please add com.google.firebase:firebase-iid to your project.");
                return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
                System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
                System.err.println("Can't generate id. Please add com.google.firebase:firebase-iid to your project.");
                return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused4) {
            System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
            return b();
        }
    }
}
