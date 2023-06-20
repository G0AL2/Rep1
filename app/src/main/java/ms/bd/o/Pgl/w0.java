package ms.bd.o.Pgl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: c  reason: collision with root package name */
    private static w0 f34587c;

    /* renamed from: a  reason: collision with root package name */
    private Context f34588a;

    /* renamed from: b  reason: collision with root package name */
    private List<Integer> f34589b = new ArrayList();

    private w0(Context context) {
        this.f34588a = null;
        this.f34588a = context;
    }

    public static w0 a(Context context) {
        if (f34587c == null) {
            synchronized (w0.class) {
                if (f34587c == null) {
                    f34587c = new w0(context);
                }
            }
        }
        return f34587c;
    }

    public void a() {
        int i10;
        int d10;
        int c10;
        try {
            synchronized (this) {
                d10 = d();
                c10 = c();
            }
            i10 = (d10 * 10000) + c10;
        } catch (Exception unused) {
            i10 = -10001;
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf == null) {
            return;
        }
        this.f34589b.add(valueOf);
        try {
            int size = this.f34589b.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.f34589b.subList(size - 10, size));
                this.f34589b.clear();
                this.f34589b = arrayList;
            }
        } catch (Throwable unused2) {
        }
    }

    public int b() {
        Intent registerReceiver = this.f34588a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "377329", new byte[]{35, 59, 64, 85, 2, 39, 52, 88, 111, 109, 54, 48, 74, 83, 67, 47, 51, 2, 111, 108, 44, 123, 102, 102, 57, 26, 21, 36, 95, 92, 1, 29, 101, 105, 42, 11, 20})));
        if (registerReceiver == null) {
            return -1;
        }
        int intExtra = registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "ba6883", new byte[]{96, 119, 68, 88, 18, 55}), -1);
        return (intExtra == 2 || intExtra == 5) ? 1 : 0;
    }

    public int c() {
        Intent registerReceiver = this.f34588a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "80674a", new byte[]{40, 60, 65, 81, 4, Byte.MAX_VALUE, 63, 95, 110, 105, 61, 55, 75, 87, 69, 119, 56, 5, 110, 104, 39, 124, 103, 98, 63, 66, 30, 35, 94, 88, 10, 26, 100, 109, 44, 83, 31})));
        if (registerReceiver == null) {
            return -1;
        }
        return Math.round(((registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "c49360", new byte[]{126, 51, 92, 66, 5}), -1) / registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "864dbc", new byte[]{58, 55, 70, 28, 88}), -1)) * 100.0f) * 10.0f) / 10;
    }

    public int d() {
        Intent registerReceiver = this.f34588a.registerReceiver(null, new IntentFilter((String) pblk.a(16777217, 0, 0L, "f0700a", new byte[]{118, 60, 64, 86, 0, Byte.MAX_VALUE, 97, 95, 111, 110, 99, 55, 74, 80, 65, 119, 102, 5, 111, 111, 121, 124, 102, 101, 59, 66, 64, 35, 95, 95, 84, 26, 101, 106, 40, 83, 65})));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra((String) pblk.a(16777217, 0, 0L, "a8c62d", new byte[]{96, 54, 5, 69, 10, 118, 102}), -1);
    }

    public synchronized int[] e() {
        int size = this.f34589b.size();
        if (size <= 0) {
            return new int[0];
        } else if (size == 1) {
            return new int[]{this.f34589b.get(0).intValue()};
        } else {
            List<Integer> list = this.f34589b;
            int i10 = size - 10;
            if (i10 <= 0) {
                i10 = 0;
            }
            List<Integer> subList = list.subList(i10, size);
            int[] iArr = new int[subList.size()];
            for (int i11 = 0; i11 < subList.size(); i11++) {
                iArr[i11] = subList.get(i11).intValue();
            }
            return iArr;
        }
    }
}
