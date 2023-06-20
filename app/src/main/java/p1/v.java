package p1;

import android.os.PowerManager;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WakeLocks.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f35473a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<PowerManager.WakeLock, String> f35474b = new WeakHashMap<>();

    private v() {
    }

    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return f35474b;
    }
}
